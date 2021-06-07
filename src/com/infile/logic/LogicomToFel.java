/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infile.logic;

import com.fel.validaciones.documento.Adendas;
import com.fel.validaciones.documento.AnulacionFel;
import com.fel.validaciones.documento.ComplementoCambiaria;
import com.fel.validaciones.documento.ComplementoExportacion;
import com.fel.validaciones.documento.ComplementoFacturaEspecial;
import com.fel.validaciones.documento.ComplementoNotas;
import com.fel.validaciones.documento.DatosEmisor;
import com.fel.validaciones.documento.DatosGenerales;
import com.fel.validaciones.documento.DatosReceptor;
import com.fel.validaciones.documento.DocumentoFel;
import com.fel.validaciones.documento.Frases;
import com.fel.validaciones.documento.ImpuestosDetalle;
import com.fel.validaciones.documento.Items;
import com.fel.validaciones.documento.TotalImpuestos;
import com.fel.validaciones.documento.Totales;
import com.infile.traductor.ResultadoParse;
import static java.lang.Math.round;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class LogicomToFel {

    //Objeto para la respuesta
    ResultadoParse resultado_parse = new ResultadoParse();

    // Objetos para formar el documento_fel
    DocumentoFel documento_fel = new DocumentoFel();
    DatosGenerales datos_generales = new DatosGenerales();
    DatosEmisor datos_emisor = new DatosEmisor();
    DatosReceptor datos_receptor = new DatosReceptor();
    Totales total_documento = new Totales();
    Adendas adenda = new Adendas();
    Adendas adenda_detalle = new Adendas();

    double total_calculado = 0;
    double base = 0;
    double iva_adicional_segun_items;
    double total_adicional_segun_items;

    BigDecimal total_freight;
    BigDecimal total_tax_freight;

    public ResultadoParse convertir(Order orden, String nombre_archivo) {

        total_freight = BigDecimal.ZERO;
        total_tax_freight = BigDecimal.ZERO;

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.US);
        //String dateInString = "7-JAN-2013"; 
        String dateInString = orden.getOrderHeader().getGeneral().getNTSDate().toUpperCase(); //"26-APR-2019";
        //dateInString = dateInString.replace("JAN", "ENE");
        //dateInString = dateInString.replace("APR", "APR");
        //dateInString = dateInString.replace("AUG", "AGO");
        //dateInString = dateInString.replace("SEPT", "SEP");

        // Variable para ir sumando el total de todos los detalles con el unico fin de comprobacion
        try {

            // ========================   SECCION DE DATOS GENERALES ========================
            // 1. Fecha y hora de emision
            Date date = formatter.parse(dateInString);
            SimpleDateFormat formato_fecha_salida = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss-06:00");
            //System.out.println(formato_fecha_salida.format(date));

            datos_generales.setFechaHoraEmision(formato_fecha_salida.format(date));
            datos_generales.setCodigoMoneda("USD");
            datos_generales.setTipo("FACT");
            documento_fel.setDatos_generales(datos_generales);

            // ======================== SECCION DE DATOS DEL EMISOR =========================
            // 1. Correo del Emisor
            String identificador_establecimiento = orden.getOrderHeader().getGeneral().getWarehouseNumber();
            int codigo_establecimiento = 0;
            String departamento = "";
            String municipio = "";
            String direccion = "";
            String codigo_postal = "";
            String nombre_comercial = "";

            if (identificador_establecimiento.contains("Y")) {
                codigo_establecimiento = 1;
                departamento = "GUATEMALA";
                municipio = "GUATEMALA";
                direccion = "Ave. Las Américas 11-54 zona 13 Guatemala, Guatemala";
                codigo_postal = "01013";
                nombre_comercial = "LOGICOM DE GUATEMALA";

            } else if (identificador_establecimiento.contains("Z")) {
                codigo_establecimiento = 2;
                departamento = "QUETZALTENANGO";
                municipio = "QUETZALTENANGO";
                direccion = "9 calle 24-38 zona 7 apartamento 1 condominio de Castilla, Quetzaltenango, Quetzaltenango";
                codigo_postal = "09007";
                nombre_comercial = "SUCURSAL QUETZALTENANGO";
            }

            // 2. Codigo de Establecimiento
            datos_emisor.setCodigoEstablecimiento(codigo_establecimiento);
            datos_emisor.setCorreoEmisor("");
            datos_emisor.setAfiliacionIVA("GEN");
            datos_emisor.setCodigoPostal(codigo_postal);
            datos_emisor.setDepartamento(departamento);
            datos_emisor.setDireccion(direccion);
            datos_emisor.setMunicipio(municipio);
            //datos_emisor.setNITEmisor("58131965"); //1
            datos_emisor.setNITEmisor("1111111111K");
            datos_emisor.setNombreComercial(nombre_comercial);
            datos_emisor.setNombreEmisor("LOGICOM DE GUATEMALA SOCIEDAD ANONIMA");
            datos_emisor.setPais("GT");
            documento_fel.setDatos_emisor(datos_emisor);
            // ======================== SECCION DE DATOS DEL RECEPTOR =======================

            String id_receptor = orden.getOrderHeader().getGeneral().getVATNumber().replace("-", "");
            if (id_receptor.equals("")) {
                id_receptor = "CF";
            }

            if (!id_receptor.equals("CF")) {
                if (!validar_nit_por_algoritmo(id_receptor)) {
                    id_receptor = "CF";
                }
            }

            datos_receptor.setIDReceptor(id_receptor);
            datos_receptor.setNombreReceptor(orden.getOrderHeader().getDistributorDetails().getDSName());

            String zipcode_receptor;

            if (orden.getOrderHeader().getDistributorDetails().getBillTo().getZipcode() == null) {
                zipcode_receptor = "99999";
            } else {
                zipcode_receptor = orden.getOrderHeader().getDistributorDetails().getBillTo().getZipcode();
            }

            datos_receptor.setCodigoPostal("99999");
            datos_receptor.setCorreoReceptor(orden.getOrderHeader().getDistributorDetails().getPrimaryEmailAddress());
            datos_receptor.setDepartamento(orden.getOrderHeader().getDistributorDetails().getBillTo().getCity());
            datos_receptor.setMunicipio(orden.getOrderHeader().getDistributorDetails().getBillTo().getState());
            datos_receptor.setDireccion(orden.getOrderHeader().getDistributorDetails().getBillTo().getBillToAddress());
            datos_receptor.setPais(orden.getOrderHeader().getDistributorDetails().getBillTo().getCountry());
            documento_fel.setDatos_receptor(datos_receptor);

            // ============================= SECCION DE FRASES ===============================
            Frases frase1 = new Frases();
            frase1.setTipoFrase(1);
            frase1.setCodigoEscenario(1);

            Frases frase2 = new Frases();
            frase2.setTipoFrase(2);
            frase2.setCodigoEscenario(1);

            /*Frases frase3 = new Frases();
            frase3.setTipoFrase(4);
            frase3.setCodigoEscenario(1);*/
            documento_fel.setFrases(frase1);
            documento_fel.setFrases(frase2);
            //documento_fel.setFrases(frase3);

            // ============================ SECCION DE ADENDAS ===============================
            String walk_in = orden.getShippingInstructions().getFreightCode() + " - " + orden.getShippingInstructions().getFreightCodeDesc();
            String OrderNumber = orden.getOrderHeader().getGeneral().getOrderNumber();
            String empleado = orden.getOrderHeader().getGeneral().getOrderEntryOperator();
            String fecha_pedido = orden.getOrderHeader().getGeneral().getOrderDate();
            String volumen = orden.getOrderHeader().getGeneral().getOrderMonth();
            String no_id = orden.getOrderHeader().getDistributorDetails().getDSID();
            String enviar_a = orden.getOrderHeader().getDistributorDetails().getBillTo().getName();
            String almacen = orden.getOrderHeader().getGeneral().getWarehouseNumber();
            String instrucciones_envio = orden.getShippingInstructions().getShippingInstructions();

            for (int i = 0; i < orden.getPaymentDetails().getPaymentReference().size(); i++) {
                adenda.setAdenda("PaymentType_" + i, orden.getPaymentDetails().getPaymentReference().get(i).getPaymentType());
                adenda.setAdenda("ReferenceNo_" + i, orden.getPaymentDetails().getPaymentReference().get(i).getReferenceNo());
            }

            //String forma_pago = orden.getPaymentDetails().getPaymentReference().get(0).getPaymentType();
            //String referencia = orden.getPaymentDetails().getPaymentReference().get(0).getReferenceNo();
            String puntos_volumen = orden.getVolumePoints().toString();
            String ingreso_base = orden.getTotalEarnBase().toString();
            String peso_total = orden.getCalculatedWeight().toString();
            String fondo_marketing = orden.getTaxBreakups().getTax().getTotalPH().toString();
            String cargo_logistico = orden.getTaxBreakups().getTax().getTotalLogistics().toString();
            String cargo_envio = orden.getTaxBreakups().getTax().getTotalFreight().toString();
            String total_antes_iva = orden.getTaxBreakups().getTax().getTotalDueBeforeTax().toString();
            String subtotal = orden.getTaxBreakups().getTax().getTotalDiscountedRetail().toString();
            String descuento = orden.getTaxBreakups().getTax().getTotalDiscount().toString();
            String total_antes_descuento = orden.getTaxBreakups().getTax().getTotalRetail().toString();

            String fqs_name = orden.getOrderHeader().getDistributorDetails().getLineage().getFQSName();
            String ship_to_addres = orden.getOrderHeader().getDistributorDetails().getShipTo().getShipToAddress();
            String phone = orden.getOrderHeader().getDistributorDetails().getShipTo().getPhone();
            String tipo_cambio = orden.getOrderHeader().getGeneral().getEXCHANGERATE().toString();

            String ship_to_name = orden.getOrderHeader().getDistributorDetails().getShipTo().name;
            String lineage_fqsname = orden.getOrderHeader().getDistributorDetails().getLineage().getFQSName();
            String lineage_fqsid = orden.getOrderHeader().getDistributorDetails().getLineage().getFQSID();

            adenda.setAdenda("FreightCode-FreightCodeDesc", walk_in);
            adenda.setAdenda("OrderNumber", OrderNumber);
            adenda.setAdenda("OrderEntryOperator_1", empleado);
            adenda.setAdenda("OrderDate", fecha_pedido);
            adenda.setAdenda("OrderNumber", volumen);
            adenda.setAdenda("OrderEntryOperator_2", no_id);
            adenda.setAdenda("Name", enviar_a);
            adenda.setAdenda("WarehouseNumber", almacen);
            adenda.setAdenda("ShippingInstructions", instrucciones_envio);
            adenda.setAdenda("VolumePoints", puntos_volumen);
            adenda.setAdenda("TotalEarnBase", ingreso_base);
            adenda.setAdenda("CalculatedWeight", peso_total);
            adenda.setAdenda("TotalPH", fondo_marketing);
            adenda.setAdenda("TotalLogistics", cargo_logistico);
            adenda.setAdenda("TotalFreight", cargo_envio);
            adenda.setAdenda("TotalDueBeforeTax", total_antes_iva);
            adenda.setAdenda("TotalDiscountedRetail", subtotal);
            adenda.setAdenda("TotalDiscount", descuento);
            adenda.setAdenda("TotalRetail", total_antes_descuento);

            adenda.setAdenda("ShipToName", ship_to_name);
            adenda.setAdenda("LineageFqsName", lineage_fqsname);
            adenda.setAdenda("LineageFqSid", lineage_fqsid);

            adenda.setAdenda("FQSName", fqs_name);
            adenda.setAdenda("ShipToAddress", ship_to_addres);
            adenda.setAdenda("Phone", phone);
            adenda.setAdenda("EXCHANGERATE", tipo_cambio);
            adenda.setAdenda("IDENTIFICADOR_UNICO", orden.getOrderHeader().getGeneral().getOrderNumber());

            // ============================= SECCION DE ITEMS ================================
            // Cantidad de lineas de detalle
            int cantidad_detalles = orden.getOrderLine().getItem().size();

            // indice para las lineas de detalle
            int i;

            String consolidado_product_code = "";

            double total_impuesto_iva = 0.00;

            double gran_total = 0.00;

            // Recorrer todos los datelles
            for (i = 0; i < cantidad_detalles; i++) {

                BigDecimal Unit_Tax = orden.getOrderLine().getItem().get(i).getUnitTax();
                BigDecimal Line_Tax = orden.getOrderLine().getItem().get(i).getLineTax();
                int QtyOrdered = orden.getOrderLine().getItem().get(i).getQtyOrdered().intValue();
                BigDecimal UnitPH = orden.getOrderLine().getItem().get(i).getUnitPH();
                BigDecimal UnitFr = orden.getOrderLine().getItem().get(i).getUnitFr();
                BigDecimal UnitLog = orden.getOrderLine().getItem().get(i).getUnitLog();
                BigDecimal DiscRetail = orden.getOrderLine().getItem().get(i).getDiscRetail();
                BigDecimal DiscAmount = orden.getOrderLine().getItem().get(i).getDiscountAmt();

                String product_code = orden.getOrderLine().getItem().get(i).getProductCode().toString();

                // Operaciones para encontrar el precio unitario y precio
                // ======================================================
                // Primer Version
                /*BigDecimal op1 = Line_Tax.multiply(new BigDecimal(QtyOrdered));
                op1 = op1.setScale(2, RoundingMode.HALF_UP);

                //System.out.println("OP1 " + op1);
                BigDecimal op2 = UnitPH.multiply(new BigDecimal(QtyOrdered));
                op2 = op2.setScale(2, RoundingMode.HALF_UP);

                //System.out.println("OP2 " + op2);
                BigDecimal op3 = UnitFr.multiply(new BigDecimal(QtyOrdered));
                op3 = op3.setScale(2, RoundingMode.HALF_UP);

                //System.out.println("OP3 " + op3);
                BigDecimal op4 = UnitLog.multiply(new BigDecimal(QtyOrdered));
                op4 = op4.setScale(2, RoundingMode.HALF_UP);

                //System.out.println("OP4 " + op4);
                BigDecimal op5 = op1.add(op2).add(op3).add(op4).add(DiscRetail);
                op5 = op5.setScale(2, RoundingMode.HALF_UP);
                //System.out.println("OP5 " + op5);

                BigDecimal op6 = op5.divide(new BigDecimal(QtyOrdered));
                op6 = op6.setScale(2, RoundingMode.HALF_UP);
                //System.out.println("OP6 " + op6);
                 */
                // ============================================================
                // ============================================================
                // Operaciones para encontrar el precio unitario y precio
                // ======================================================
                // Segunda Version
                BigDecimal op1 = UnitFr.multiply(new BigDecimal(0.12));
                //op1 = op1.setScale(2, RoundingMode.HALF_UP);
                //System.out.println("OP1 " + op1);

                //BigDecimal nuevo_valor_unit_tax = BigDecimal.valueOf(Line_Tax.doubleValue() / QtyOrdered);
                BigDecimal nuevo_valor_unit_tax = BigDecimal.valueOf(Line_Tax.doubleValue() / QtyOrdered);

                //System.out.println("LineTax divido Cantidad " + nuevo_valor_unit_tax + " Unit_Tax " + Unit_Tax);
                System.out.println();

                BigDecimal op2 = nuevo_valor_unit_tax.subtract(op1);

                //op2 = op2.setScale(2, RoundingMode.HALF_UP);
                //System.out.println("OP2 " + op2);
                //BigDecimal op2 = Unit_Tax.subtract(op1);
                //op2 = op2.setScale(2, RoundingMode.HALF_UP);
                //System.out.println("OP2 " + op2);
                BigDecimal op3 = DiscRetail.divide(new BigDecimal(QtyOrdered), MathContext.DECIMAL128);
                op3 = op3.setScale(2, RoundingMode.HALF_UP);
                //System.out.println("OP3 " + op3);     

                BigDecimal op4 = DiscAmount.divide(new BigDecimal(QtyOrdered));
                //op4 = op4.setScale(2, RoundingMode.HALF_UP);
                //System.out.println("OP4" + op4); 

                BigDecimal op5 = op2.add(UnitPH).add(UnitLog).add(op3).add(op4);
                //op5 = op5.setScale(2, RoundingMode.HALF_UP);
                //System.out.println("OP5 " + op5);

                // ============================================================
                // ============================================================
                //BigDecimal op1_1 = Line_Tax.multiply(new BigDecimal(QtyOrdered));
                //op1_1 = op1_1.setScale(2, RoundingMode.HALF_UP);
                //BigDecimal op2_2 = UnitPH.multiply(new BigDecimal(QtyOrdered));
                //op2_2 = op2_2.setScale(2, RoundingMode.HALF_UP);
                //BigDecimal op3_3 = UnitFr.multiply(new BigDecimal(QtyOrdered));
                //op3_3 = op3_3.setScale(2, RoundingMode.HALF_UP);
                //BigDecimal op4_4 = UnitLog.multiply(new BigDecimal(QtyOrdered));
                //op4_4 = op4_4.setScale(2, RoundingMode.HALF_UP);
                //BigDecimal op5_5 = op1_1.add(op2_2).add(op3_3).add(op4_4).add(DiscRetail);
                //op5_5 = op5_5.setScale(2, RoundingMode.HALF_UP);
                //System.out.println("OP5 " + op5);
                //BigDecimal op6_6 = op5_5.divide(new BigDecimal(QtyOrdered));
                // op6_6 = op6_6.setScale(2, RoundingMode.HALF_UP);
                // Calculo para el monto gravable
                Double monto_gravable = (((op5.doubleValue() * QtyOrdered) - orden.getOrderLine().getItem().get(i).getDiscountAmt().doubleValue()) / 1.12);
                Double total_iva = (monto_gravable * 0.12);
                total_impuesto_iva = total_impuesto_iva + total_iva;

                //System.out.println("MONTO GRAVABLE POR LINEA DE DETALLE .... " + monto_gravable);
                // Calculo para el impuesto 
                // Calculo para el total por linea 
                // Double total_x_linea = (monto_gravable + Line_Tax.doubleValue());
                Double total_x_linea = ((op5.doubleValue() * QtyOrdered) - orden.getOrderLine().getItem().get(i).getDiscountAmt().doubleValue());
                gran_total = gran_total + total_x_linea;

                //total_x_linea = total_x_linea.setScale(2, RoundingMode.HALF_UP);
                //System.out.println("TOTAL POR LINEA DE DETALLE .... " + total_x_linea);
                //System.out.println("TOTAL " + total_x_linea + "\n");
                Items item = new Items();

                String tipo_servicio = "";
                tipo_servicio = orden.getOrderLine().getItem().get(i).getProductType();
                if ((tipo_servicio.equals("P")) || (tipo_servicio.equals("A"))) {
                    tipo_servicio = "B";
                } else {
                    tipo_servicio = "S";

                }

                item.setNumeroLinea(i + 1);
                item.setBienOServicio(tipo_servicio);
                item.setCantidad(Double.valueOf(QtyOrdered));
                item.setDescripcion(orden.getOrderLine().getItem().get(i).getItemDescription());
                item.setPrecio((op5.doubleValue() * QtyOrdered));
                item.setPrecioUnitario(op5.doubleValue());
                item.setDescuento(orden.getOrderLine().getItem().get(i).getDiscountAmt().doubleValue());
                item.setTotal(Math.round(total_x_linea * 100.0) / 100.0);
                item.setUnidadMedida(orden.getOrderLine().getItem().get(i).getUOM());

                ImpuestosDetalle impuesto1 = new ImpuestosDetalle();
                impuesto1.setCodigoUnidadGravable(1);
                impuesto1.setMontoGravable(monto_gravable);
                //System.out.println("IVA POR LINEA DE DETALLE .... " + Line_Tax);
                impuesto1.setMontoImpuesto(total_iva);
                impuesto1.setNombreCorto("IVA");

                item.setImpuestos_detalle(impuesto1);

                consolidado_product_code = consolidado_product_code + "<" + "ProductCode_" + i + ">" + product_code + "</" + "ProductCode_" + i + ">" + "\n";
                adenda.setAdenda("ProductCode_" + i, product_code);
                documento_fel.setItems(item);

                // Este codigo se quita porque lo que va es un detalle que diga UNITFR con la suma de los tag total freight
                /*if (UnitFr.compareTo(BigDecimal.ZERO) > 0) {
                    System.out.println("UnitFr " + UnitFr);
                    i += 1;
                    agregar_detalle_adicional("UnitFr", UnitFr, i);
                }*/
            }

            adenda.setAdenda("detalle", consolidado_product_code);

            // Continuando con el armado del detalle, ahora se verifica que si las siguientes etiquetas
            // tienen valor entonces se agregan como un detalle al documento. 
            BigDecimal Total_Logistics = orden.getTaxBreakups().getTax().getTotalLogistics();
            //BigDecimal Total_Freight = orden.getTaxBreakups().getTax().getTotalFreight();
            BigDecimal Total_PH = orden.getTaxBreakups().getTax().getTotalPH();

            BigDecimal Total_Freight = orden.getPaymentDetails().getOrderPricing().getTotalFreight();
            BigDecimal Total_Tax_Freight = orden.getPaymentDetails().getOrderPricing().getTotalTaxFreight();

            if (Total_Logistics.compareTo(BigDecimal.ZERO) > 0) {
                //System.out.println("Total_Logistics " + Total_Logistics);
                i += 1;
                //agregar_detalle_adicional("Total_Logistics", Total_Logistics, i);
            }

            if (Total_Freight.compareTo(BigDecimal.ZERO) > 0) {
                System.out.println("--> Agregando Total_Freight y Total_Tax_Freight al documento " + Total_Freight);
                i += 1;
                agregar_total_freight("Total_Freight", Total_Freight, Total_Tax_Freight, i);
            }

            if (Total_PH.compareTo(BigDecimal.ZERO) > 0) {
                //System.out.println("Total_PH " + Total_PH);

                i += 1;
                //agregar_detalle_adicional("Total_PH", Total_PH, i);
            }

            documento_fel.setAdenda(adenda);

            // ======================== SECCION DE TOTAL DE IMPUESTOS ==========================
            //double total_impuesto_iva = orden.getTaxBreakups().getTax().getTotalTax().doubleValue();
            total_impuesto_iva = total_impuesto_iva + iva_adicional_segun_items;

            TotalImpuestos total_impuestos = new TotalImpuestos();

            total_impuestos.setNombreCorto("IVA");

            total_impuestos.setTotalMontoImpuesto(total_impuesto_iva);

            documento_fel.setImpuestos_resumen(total_impuestos);

            // ===================== SECCION DE GRAN TOTAL DEL DOCUMENTO ========================
            double gran_total_documento = orden.getPaymentDetails().getOrderPricing().getTotalPayments().doubleValue();

            gran_total_documento = gran_total_documento + total_adicional_segun_items;

            total_documento.setGranTotal(orden.getPaymentDetails().getOrderPricing().getTotalPayments().doubleValue());

            documento_fel.setTotales(total_documento);

            Double gran_total_segun_cabecera = orden.getPaymentDetails().getOrderPricing().getTotalPayments().doubleValue();

            //System.out.println("\n--> SECCION DE CUADRE SEGUN SOLICITUD: ");
            System.out.println("--> =========================================");
            System.out.println("\n--> **** MOSTRANDO TODOS LOS DETALLES ORIGINALMENTE:" + "\n");
            Double gran_total_segun_detalles = 0.00;

            for (int det = 0; det < documento_fel.getItems().size(); det++) {
                gran_total_segun_detalles = gran_total_segun_detalles + documento_fel.getItems().get(det).getTotal();
                System.out.println("--> **** DETALLE No " + documento_fel.getItems().get(det).getNumeroLinea()
                        + "\n-->Descripcion: " + documento_fel.getItems().get(det).getDescripcion()
                        + "\n--> Total: " + documento_fel.getItems().get(det).getTotal()
                        + "\n--> Descuento: " + documento_fel.getItems().get(det).getDescuento()
                        + "\n--> Precio: " + documento_fel.getItems().get(det).getPrecio()
                        + "\n--> Precio U: " + documento_fel.getItems().get(det).getPrecioUnitario()
                        + "\n--> Cantidad: " + documento_fel.getItems().get(det).getCantidad()
                        + "\n--> Monto Gravable: " + documento_fel.getItems().get(det).getImpuestos_detalle().get(0).getMontoGravable()
                        + "\n--> IVA: " + documento_fel.getItems().get(det).getImpuestos_detalle().get(0).getMontoImpuesto());

            }

            System.out.println("\n--> **** CANTIDAD DE DETALLES: " + documento_fel.getItems().size());
            System.out.println("--> **** GRAN TOTAL SEGUN DETALLES: " + gran_total_segun_detalles);
            System.out.println("--> **** GRAN TOTAL SEGUN CABECERA: " + gran_total_segun_cabecera);
            double diferencia = Math.round((gran_total_segun_cabecera - gran_total_segun_detalles) * 100.0) / 100.0;

            System.out.println("--> **** DIFERENCIA: " + diferencia);

            if (diferencia > 0.00) {

                System.out.println("\n--> SECCION DE CUADRE.");
                //System.out.println("Op1 " + (Math.round(documento_fel.getItems().get(documento_fel.getItems().size() - 1).getTotal() * 100) / 100));
                //System.out.println("Op2 " + diferencia);

                double valor_ajustado_ultimo_detalle = ((documento_fel.getItems().get(documento_fel.getItems().size() - 1).getTotal()) * 100 / 100) + diferencia;

                System.out.println("--> **** VALOR TOTAL DEL ULTIMO DETALLE POSTERIOR AL AJUSTE: " + valor_ajustado_ultimo_detalle + "\n");
                agregar_detalle_recalculado(documento_fel.getItems().get(documento_fel.getItems().size() - 1), BigDecimal.valueOf(valor_ajustado_ultimo_detalle));

                System.out.println("\n--> **** MOSTRANDO TODOS LOS DETALLES POSTERIOR AL AJUSTE:" + "\n");
                gran_total_segun_detalles = 0.00;
                gran_total_segun_cabecera = orden.getPaymentDetails().getOrderPricing().getTotalPayments().doubleValue();

                for (int det = 0; det < documento_fel.getItems().size(); det++) {
                    gran_total_segun_detalles = gran_total_segun_detalles + documento_fel.getItems().get(det).getTotal();
                    System.out.println("--> DETALLE No " + documento_fel.getItems().get(det).getNumeroLinea() + " Descripcion: " + documento_fel.getItems().get(det).getDescripcion() + " Total: " + documento_fel.getItems().get(det).getTotal() + " Precio U: " + documento_fel.getItems().get(det).getPrecioUnitario() + " Cantidad: " + documento_fel.getItems().get(det).getCantidad());
                }

                System.out.println("\n--> **** CANTIDAD DE DETALLES: " + documento_fel.getItems().size());
                System.out.println("--> **** GRAN TOTAL SEGUN DETALLES: " + gran_total_segun_detalles);
                System.out.println("--> **** GRAN TOTAL SEGUN CABECERA: " + gran_total_segun_cabecera);
                System.out.println("\n--> =========================================" + "\n");
            }

        } catch (ParseException e) {

            List<String> lista_errores = new ArrayList<>();

            lista_errores.add(e.getMessage());

            System.out.println("--> Ocurrio un error, por favor revise lo siguiente: " + e.getMessage());

            resultado_parse.setResultado(false);
            resultado_parse.setDescripcion("Ocurrio un error, por favor revise lo siguiente: " + e.getMessage());
            resultado_parse.setDocumento_fel(null);
            resultado_parse.setLista_errores(null); // Solo para cuando hay errores
            //resultado_parse.setNit_empresa("58131965"); //2
            resultado_parse.setNit_empresa("1111111111K");
            resultado_parse.setTipo_documento("FACT");
            resultado_parse.setTipo_transaccion("CERTIFICACION");
            //resultado_parse.setUuid(""); // Solo para las anulaciones

        }

        //System.out.println("Cantidad de lineas de detalle =  " + documento_fel.getItems().size());

        /*for (int j = 0; j < documento_fel.getItems().size(); j++) {
            System.out.println("Detalle No =  " + j + " " + "Detalle desc =  " + documento_fel.getItems().get(j).getDescripcion());
            System.out.println("Valor " + documento_fel.getItems().get(j).getTotal());
            System.out.println("IVA " + documento_fel.getItems().get(j).getImpuestos_detalle().get(0).getMontoImpuesto() );
            System.out.println("BASE " + documento_fel.getItems().get(j).getImpuestos_detalle().get(0).getMontoGravable() + "\n");

            total_calculado = total_calculado + documento_fel.getItems().get(j).getTotal();
            base = base + documento_fel.getItems().get(j).getImpuestos_detalle().get(0).getMontoGravable();

        }*/

 /*DecimalFormat twoDForm = new DecimalFormat("#.##");

        System.out.println("Total calculado segun todas las lineas = " + Double.valueOf(twoDForm.format(total_calculado).replace(",", ".")));
        System.out.println("BASE = " + Double.valueOf(twoDForm.format(base).replace(",", ".")));
        System.out.println("Total segun el valor del XML Logicom = " + documento_fel.getTotales().getGranTotal());*/
        resultado_parse.setResultado(true);
        resultado_parse.setDescripcion("--> XML Orden: [" + orden.getOrderHeader().getGeneral().getOrderNumber() + "] Archivo: [" + nombre_archivo + "] Procesado Correctamente");
        resultado_parse.setDocumento_fel(documento_fel);
        resultado_parse.setLista_errores(null); // Solo para cuando hay errores
        //resultado_parse.setNit_empresa("58131965"); //3
        resultado_parse.setNit_empresa("1111111111K");
        resultado_parse.setTipo_documento("FACT");
        resultado_parse.setTipo_transaccion("CERTIFICACION");
        resultado_parse.setCodigo_establecimiento(documento_fel.getDatos_emisor().getCodigoEstablecimiento().toString());
        //resultado_parse.setUuid(""); // Solo para las anulaciones

        return resultado_parse;
    }

    private void agregar_detalle_adicional(String descripcion, BigDecimal valor, int numero_linea) {

        // Monto gravable
        BigDecimal monto_gravable = valor.divide(new BigDecimal(1.12), 2, RoundingMode.HALF_UP);

        // impuesto 
        BigDecimal iva_por_linea = valor.subtract(monto_gravable);
        iva_por_linea = iva_por_linea.setScale(2, RoundingMode.HALF_UP);

        base = base + monto_gravable.doubleValue();

        Items item = new Items();

        item.setNumeroLinea(numero_linea);
        item.setBienOServicio("B");
        item.setCantidad(1.0);
        item.setDescripcion(descripcion);
        item.setPrecio(valor.doubleValue());
        item.setPrecioUnitario(valor.doubleValue());
        item.setDescuento(0.00);
        item.setTotal(valor.doubleValue());
        item.setUnidadMedida("UND");

        ImpuestosDetalle impuesto = new ImpuestosDetalle();
        impuesto.setCodigoUnidadGravable(1);
        impuesto.setMontoGravable(monto_gravable.doubleValue());
        impuesto.setMontoImpuesto(iva_por_linea.doubleValue());
        impuesto.setNombreCorto("IVA");

        item.setImpuestos_detalle(impuesto);

        adenda.setAdenda("IVA_" + descripcion, iva_por_linea.toString());
        adenda.setAdenda("TOTAL_" + descripcion, valor.toString());

        iva_adicional_segun_items = iva_adicional_segun_items + iva_por_linea.doubleValue();
        total_adicional_segun_items = total_adicional_segun_items + valor.doubleValue();

        documento_fel.setItems(item);

    }

    private void agregar_detalle_recalculado(Items detalle_a_recalcular, BigDecimal valor) {

        // ELiminar el ultimo detalle porque se volvera a agregar recalculado:    
        documento_fel.getItems().remove(documento_fel.getItems().size() - 1);
        
        BigDecimal nuevo_valor = valor.add(BigDecimal.valueOf(detalle_a_recalcular.getDescuento())) ;

        // Monto gravable
        BigDecimal monto_gravable = (nuevo_valor.subtract(BigDecimal.valueOf(detalle_a_recalcular.getDescuento()))).divide(new BigDecimal(1.12), 2, RoundingMode.HALF_UP);

        // impuesto 
        BigDecimal iva_por_linea = (nuevo_valor.subtract(BigDecimal.valueOf(detalle_a_recalcular.getDescuento()))).subtract(monto_gravable);
        
        iva_por_linea = iva_por_linea.setScale(2, RoundingMode.HALF_UP);

        base = base + monto_gravable.doubleValue();

        System.out.println("--> Valor :" + nuevo_valor);
        System.out.println("--> monto_gravable :" + monto_gravable);
        System.out.println("--> iva_por_linea :" + iva_por_linea);

        Items item = new Items();

        item.setNumeroLinea(detalle_a_recalcular.getNumeroLinea());
        item.setBienOServicio(detalle_a_recalcular.getBienOServicio());
        item.setCantidad(detalle_a_recalcular.getCantidad());
        item.setDescripcion(detalle_a_recalcular.getDescripcion());

        item.setPrecio((nuevo_valor.doubleValue()));
        item.setPrecioUnitario((nuevo_valor.doubleValue()) / detalle_a_recalcular.getCantidad());
        item.setDescuento(detalle_a_recalcular.getDescuento());
        item.setTotal(nuevo_valor.doubleValue()-detalle_a_recalcular.getDescuento());

        item.setUnidadMedida(detalle_a_recalcular.getUnidadMedida());

        ImpuestosDetalle impuesto = new ImpuestosDetalle();
        impuesto.setCodigoUnidadGravable(1);

        impuesto.setMontoGravable(monto_gravable.doubleValue());
        impuesto.setMontoImpuesto(iva_por_linea.doubleValue());

        impuesto.setNombreCorto("IVA");

        item.setImpuestos_detalle(impuesto);

        documento_fel.setItems(item);

        // Se ajustan los impuestos a nivel de la cabecera
        double total_impuestos_recalculado = documento_fel.getImpuestos_resumen().get(0).getTotalMontoImpuesto() - detalle_a_recalcular.getImpuestos_detalle().get(0).getMontoImpuesto();
        total_impuestos_recalculado = total_impuestos_recalculado + iva_por_linea.doubleValue();
        documento_fel.getImpuestos_resumen().remove(0);

        TotalImpuestos total_impuestos = new TotalImpuestos();
        total_impuestos.setNombreCorto("IVA");

        BigDecimal iva = BigDecimal.valueOf(total_impuestos_recalculado);
        iva = iva.setScale(2, RoundingMode.HALF_UP);

        total_impuestos.setTotalMontoImpuesto(iva.doubleValue());

        documento_fel.setImpuestos_resumen(total_impuestos);

    }

    private void agregar_total_freight(String descripcion, BigDecimal total_freight_, BigDecimal total_tax_freight_, int numero_linea) {

        // Monto gravable
        BigDecimal monto_gravable = total_freight_;
        monto_gravable = monto_gravable.setScale(2, RoundingMode.HALF_UP);

        // impuesto 
        BigDecimal iva_por_linea = total_tax_freight_;
        iva_por_linea = iva_por_linea.setScale(2, RoundingMode.HALF_UP);

        Double precio = monto_gravable.doubleValue() + iva_por_linea.doubleValue();

        Items item = new Items();

        item.setNumeroLinea(numero_linea - 1);
        item.setBienOServicio("S");
        item.setCantidad(1.0);
        item.setDescripcion(descripcion);
        item.setPrecio(precio);
        item.setPrecioUnitario(precio);
        item.setDescuento(0.00);
        item.setTotal(precio);
        item.setUnidadMedida("UND");

        ImpuestosDetalle impuesto = new ImpuestosDetalle();
        impuesto.setCodigoUnidadGravable(1);
        impuesto.setMontoGravable(monto_gravable.doubleValue());
        impuesto.setMontoImpuesto(iva_por_linea.doubleValue());
        impuesto.setNombreCorto("IVA");

        item.setImpuestos_detalle(impuesto);

        iva_adicional_segun_items = iva_adicional_segun_items + iva_por_linea.doubleValue();
        
        total_adicional_segun_items = total_adicional_segun_items + monto_gravable.doubleValue();

        documento_fel.setItems(item);

    }

    private void unificar_total_freight(BigDecimal total_tax_freight_, BigDecimal total_freight_) {

        // Monto gravable
        BigDecimal monto_gravable = total_freight.add(total_freight).add(total_freight_);
        monto_gravable = monto_gravable.setScale(2, RoundingMode.HALF_UP);

        // impuesto 
        BigDecimal iva = total_tax_freight.add(total_tax_freight).add(total_tax_freight_);
        iva = iva.setScale(2, RoundingMode.HALF_UP);

    }

    public static boolean validar_nit_por_algoritmo(String nit) {

        try {

            nit = nit.replace("-", "");
            int longitud_nit = nit.length();
            String digito_verificador = nit.substring(nit.length() - 1, nit.length());
            int suma_digitos = 0;

            for (int i = 0; i < nit.length() - 1; i++) {
                suma_digitos = suma_digitos + Integer.valueOf(nit.substring(i, i + 1)) * longitud_nit;
                longitud_nit -= 1;
            }

            int residuo = suma_digitos % 11;

            int resultado = 11 - residuo;

            if (resultado >= 11) {
                residuo = resultado % 11;
                resultado = residuo;
            }

            if (resultado == 10) {
                if ("K".equals(digito_verificador.toUpperCase())) {
                    return true;
                }

            } else if ((!"K".equals(digito_verificador.toUpperCase()))) {
                return Integer.valueOf(digito_verificador) == resultado;
            }

        } catch (NumberFormatException ex) {
            return false;
        }

        return false;

    }

}

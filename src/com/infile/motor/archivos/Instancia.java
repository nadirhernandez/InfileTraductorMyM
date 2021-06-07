package com.infile.motor.archivos;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Instancia extends Thread {

    private int numero_instancia = 0;
    static final int numero_puerto = 4000; 
    public String identificador_cliente = "";

    
    public String getIdentificador_cliente() {
        return identificador_cliente;
    }

    public void setIdentificador_cliente(String identificador_cliente) {
        this.identificador_cliente = identificador_cliente;
    }
   
    public int getVerificaInstancia() {
        return this.numero_instancia;
    }

    public void comprobar_servicio(int verificaInstancia) {
        this.numero_instancia = verificaInstancia;
    }

    public Instancia(String identificador) {

        this.identificador_cliente = identificador;

    }

    @Override
    public void run() {
        try {

            if (identificador_cliente.equals("ggf5890098765") || identificador_cliente.equals("hhgmmm5551234") ) {

            } else {
                comprobar_servicio(0);
                ServerSocket server_socket = new ServerSocket(5001);
                System.out.println("\nInstancia Iniciada ...");
                Socket socket = server_socket.accept();
                socket.close();
                System.out.println("No es posible utilizar mas de una instancia.");
            }

        } catch (IOException e) {
            comprobar_servicio(1);
            System.out.println(e.getMessage().replace("Address already in use", "La instancia ya se encuentra iniciada. Puedes continuar procesando archivos."));
            System.exit(0);
        }
    }
}

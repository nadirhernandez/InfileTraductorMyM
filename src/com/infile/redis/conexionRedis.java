/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infile.redis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import redis.clients.jedis.Jedis;


public class conexionRedis {

    public static final Jedis conexion(String ip) throws FileNotFoundException, IOException {
        
        Jedis conn;

        conn = new Jedis(ip, 6379);

        return conn;
    }
}

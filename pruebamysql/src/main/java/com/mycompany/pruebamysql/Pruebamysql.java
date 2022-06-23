/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pruebamysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Colque
 */
public class Pruebamysql {

    
    String bd = "mxZNQ3qPm7";
    String url = "jdbc:mysql://remotemysql.com:3306/";
    String user = "mxZNQ3qPm7";
    String password = "JZxxjuqW4p";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;
    
    
    public Pruebamysql() {

    }

    public Connection conectar() {
       try {
           Class.forName(driver);
           cx = DriverManager.getConnection(url + bd, user, password);
           System.out.println("se conecto a base de datos: " + bd);
       } catch (ClassNotFoundException | SQLException ex) {
           System.out.println("no se conecto a base de datos: " + bd);
           Logger.getLogger(Pruebamysql.class.getName()).log(Level.SEVERE, null, ex);
       }
       return cx;
   }
    public void desconectar() {
        try {
            cx.close();
        } catch (SQLException ex) {
           Logger.getLogger(Pruebamysql.class.getName()).log(Level.SEVERE, null, ex);
       }
  }
    
    public static void main(String[] args) {
       Pruebamysql conexion = new Pruebamysql();
      conexion.conectar();
    }
}

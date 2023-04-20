/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;

/**
 *
 * @author KIKA
 */
public class Conexion {

    protected static Connection iniciar() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        
        String dbDriver = "com.mysql.jdbc.Driver"; 
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        // Database name to access 
        String dbName = "pruebausu"; 
        String dbUsername = "root"; 
        String dbPassword = "n0m3l0"; 
  
        Class.forName(dbDriver).newInstance(); 
        Connection con = DriverManager.getConnection(dbURL + dbName, 
                                                     dbUsername,  
                                                     dbPassword); 
        System.out.println("se conecto");
        return con; 
        }
    }
     


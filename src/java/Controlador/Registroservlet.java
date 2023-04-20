/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Controlador.*;
import java.sql.PreparedStatement;
/**
 *
 * @author KIKA
 */
public class Registroservlet extends HttpServlet {
    
    
    private Statement st;

    Usuario obj= new Usuario();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            
            
            String nom=request.getParameter("nombre");
            String pat=request.getParameter("paterno");
            String mat=request.getParameter("materno");
            String fec=request.getParameter("fecha");
            String usu=request.getParameter("usu");
            String cont=request.getParameter("contra");
            
            Connection con=Conexion.iniciar();
            st=con.createStatement();
            st.executeUpdate("INSERT INTO usuario(`nombre`,`paterno`,`materno`,`fecha`,`usuario`,`contra`) values('"+nom+"','"+pat+"','"+mat+"','"+fec+"','"+usu+"','"+cont+"')");
            
                     
            
            con.close();
            st.close();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Se registró </h1>");
            out.println("</body>");
            out.println("</hl>");               
            
            
            System.out.println("Se registro");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registroservlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Registroservlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Registroservlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Registroservlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException   {
        
        
        
    }
       
        
     
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

     
    
}

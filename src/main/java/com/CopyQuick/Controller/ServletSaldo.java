/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CopyQuick.Controller;

import com.CopyQuick.Model.VO.Estudiante;
import com.CopyQuick.Model.VO.EstudianteManager;
import com.CopyQuick.Model.VO.Profesor;
import com.CopyQuick.Model.VO.ProfesorManager;
import com.CopyQuick.Model.VO.SaldoManager;
import com.CopyQuick.Model.VO.Saldo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Asus
 */
public class ServletSaldo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet saldo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet saldo at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
        String[] json =null;
        json = (Utils.readParams(request)).split(",");
        json[0] = json[0].substring(1);
        json[json.length-1] = json[json.length-1].substring(0, json[json.length-1].length()-1);
        String[][] datos = new String[json.length][2];
        for(int i=0;i<json.length;i++){
            String[] split = json[i].split(":");
            datos[i][0] = split[0];
            datos[i][1] = split[1].substring(1, split[1].length()-1);
        }
        
        SaldoManager sm = new SaldoManager();
        
        
        if(datos[json.length-1][1].equalsIgnoreCase("saldo")){
            Saldo saldo = new Saldo();
            saldo.setIdAdministrador(1234);
            saldo.setIdEstudiante(1345);
            saldo.setIdSaldo(1);
            saldo.setSaldo(1000);
        }else{
            Saldo saldo = new Saldo();
            saldo.setIdSaldo(11232);
            saldo.setIdEstudiante(111);
            saldo.setIdAdministrador(222);
            sm.insertSaldo(saldo);
        }
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

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
import com.CopyQuick.Model.VO.UserManager;
import com.CopyQuick.Model.VO.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC02
 */
public class ServletRegistro extends HttpServlet {

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
        
        UserManager um = new UserManager();
        EstudianteManager em = new EstudianteManager();
        ProfesorManager pm = new ProfesorManager();
        
        if(datos[json.length-1][1].equalsIgnoreCase("estudiante")){
            Usuario user = new Usuario();
            Estudiante est = new Estudiante();
            user.setNomUsuario(datos[0][1]);
            user.setContrasena(datos[1][1]);
            est.setCarrera(datos[3][1]);
            est.setSemestre(Integer.parseInt(datos[4][1]));
            est.setIdEstudiante(14586);
            est.setCorreo(datos[2][1]);
            est.setSaldo(0);
            um.insertUser(user);
            em.insertEstudent(est);
        }else{
            Usuario user = new Usuario();
            Profesor prof = new Profesor();
            user.setNomUsuario(datos[0][1]);
            user.setContrasena(datos[1][1]);
            prof.setCorreo(datos[2][1]);
            prof.setIdProfesor(8798545);
            prof.setTipo(datos[3][1]);
            um.insertUser(user);
            pm.insertEstudent(prof);
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

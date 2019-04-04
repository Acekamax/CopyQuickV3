/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CopyQuick.Model.DAO;

import com.CopyQuick.Model.VO.Usuario;

/**
 *
 * @author PC02
 */
public class main {
    public static void main(String arg[]){
        DAO_Usuario du = new DAO_Usuario();
        Usuario u = new Usuario();
        u.setContrasena("Uno");
        u.setNomUsuario("Prueba");
        du.InsertObject(u);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CopyQuick.Model.VO;

import com.CopyQuick.Model.DAO.DAO_Archivo;
import com.CopyQuick.Controller.Utils;

/**
 *
 * @author PC02
 */
public class ArchivoManager {
    
    public String findFile(Archivo archivo){
        DAO_Archivo dao = new DAO_Archivo();
        return Utils.toJson(dao.findFiles(archivo));
    }
    
}

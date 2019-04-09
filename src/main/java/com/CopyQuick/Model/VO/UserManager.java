/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CopyQuick.Model.VO;

import com.CopyQuick.Controller.Utils;
import com.CopyQuick.Model.DAO.DAO_Usuario;

/**
 *
 * @author Andrea Muñoz
 */
public class UserManager {
    
    public String insertUser(Usuario user){
    DAO_Usuario du=new DAO_Usuario();
    du.InsertObject(user);
    return Utils.toJson(user);
    }
}

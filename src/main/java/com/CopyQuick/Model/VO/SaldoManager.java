/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CopyQuick.Model.VO;

import com.CopyQuick.Controller.Utils;
import com.CopyQuick.Model.DAO.DAO_Saldo;
/**
 *
 * @author Asus
 */
public class SaldoManager {
    public String insertSaldo(Saldo Sald){
        DAO_Saldo ds = new DAO_Saldo();
        ds.InsertObject(Sald);
       // ds.InsertObject(sald);
        return Utils.toJson(Sald);
    }
}

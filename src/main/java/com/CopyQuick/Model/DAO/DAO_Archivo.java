/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CopyQuick.Model.DAO;

import com.CopyQuick.Model.VO.Archivo;
import com.CopyQuick.Persistence.EMF;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author CopyQuick.
 */
public class DAO_Archivo {
    
    public EntityManager em = null;
    
    public Archivo findFiles(Archivo archivo){
        em = EMF.get().createEntityManager();
        em.getTransaction().begin();
        Archivo file = em.find(Archivo.class, 1);
        return file;
    }
    
}

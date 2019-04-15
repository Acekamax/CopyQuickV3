/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CopyQuick.Model.DAO;

import com.CopyQuick.Model.VO.Archivo;
import com.CopyQuick.Persistence.EMF;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author CopyQuick.
 */
public class DAO_Archivo {
    
    public EntityManager em = null;
    
    public ArrayList<Archivo> findFiles(){
        em = EMF.get().createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT a FROM Archivo a");
        return (ArrayList<Archivo>) query.getResultList();
    }
    
}

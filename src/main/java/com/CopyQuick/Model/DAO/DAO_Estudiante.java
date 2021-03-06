/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CopyQuick.Model.DAO;

import com.CopyQuick.Model.VO.Estudiante;
import com.CopyQuick.Persistence.EMF;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author CopyQuick.
 */
public class DAO_Estudiante {

    public EntityManager em = null;

    public boolean InsertObject(Estudiante est) {

        try {
            em = EMF.get().createEntityManager();
            em.getTransaction().begin(); //inicia conexión
            em.persist(est);
            em.getTransaction().commit();
            em.refresh(est);
            em.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }

    }
}

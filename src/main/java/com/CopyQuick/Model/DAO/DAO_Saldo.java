
package com.CopyQuick.Model.DAO;

//import com.CopyQuick.Controller.SaldoJpaController;
import com.CopyQuick.Model.VO.Saldo;

import com.CopyQuick.Persistence.EMF;
//import java.util.List;
import javax.persistence.EntityManager;
//import javax.persistence.Query;

/**
 *
 * @author Asus
 */
public class DAO_Saldo {
     public EntityManager em = null;

    public boolean InsertObject(Saldo s) {

        try {
            em = EMF.get().createEntityManager();
            em.getTransaction().begin(); //inicia conexión
            em.persist(s);
            em.getTransaction().commit();
            em.refresh(s);
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

    
    
    
    
    
    
    
    
    
    
    /*
    private Saldo Saldo = new Saldo(); 
    private SaldoJpaController manager = new SaldoJpaController();
    
    public boolean insertarsaldo(Integer idusuario, Integer Saldo){
        EntityManager em = manager.getEntityManager();
        boolean valor;
        String mensaje; 
        try{
           Query query = em.createQuery("SELECT s.idestudiante, s.Saldo FROM Saldo s  WHERE s.idEstudiante = :idEstudiante AND s.idSaldo = :idsaldo");
           query.setParameter("idusuario", idusuario);
           query.setParameter("Saldo", Saldo);
           List resultado=query.getResultList();
           if (!resultado.isEmpty()) {
                valor = true;
            }else{
           valor = false;
           }
        }catch (Exception e){
            valor = false;
            mensaje = e.getMessage();
        }
        return valor;
    }*/
    
}

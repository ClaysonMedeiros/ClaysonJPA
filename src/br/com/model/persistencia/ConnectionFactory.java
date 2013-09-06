package br.com.model.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author clayson_medeiros
 */
public class ConnectionFactory {

    private static final String UNIT_NAME = "ClaysonJPAPU";
    private EntityManagerFactory emf = null;
    private EntityManager em = null;

    public EntityManager getEntityManager() {

        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(UNIT_NAME);
        }

        if (em == null) {
            em = emf.createEntityManager();
        }
        return em;
    }
}

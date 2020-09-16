package be.infernalwhale.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceProvider {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");

    static EntityManager createEM() {
        return emf.createEntityManager();
    }
}

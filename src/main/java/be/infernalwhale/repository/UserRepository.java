package be.infernalwhale.repository;

import be.infernalwhale.model.User;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    public List<User> getAllUsers() {
        EntityManager em = PersistenceProvider.createEM();
        return em.createQuery("FROM User", User.class).getResultList();
    }

    public Optional<User> getUserById(String login) {
        EntityManager em = PersistenceProvider.createEM();
        return Optional.of(em.find(User.class, login));
    }

    public void createUser(User user) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }

    public void updateUser(User user) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
    }

    public void deleteUser(User user) {
        EntityManager em = PersistenceProvider.createEM();
        em.getTransaction().begin();
        em.remove(user);
        em.getTransaction().commit();
    }

    public void deleteUserById(String login) {
        getUserById(login).ifPresent(this::deleteUser);
    }
}

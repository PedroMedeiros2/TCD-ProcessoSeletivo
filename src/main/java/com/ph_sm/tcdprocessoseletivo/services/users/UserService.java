package com.ph_sm.tcdprocessoseletivo.services.users;

import com.ph_sm.tcdprocessoseletivo.entities.credential.Credential;
import com.ph_sm.tcdprocessoseletivo.entities.users.User;
import com.ph_sm.tcdprocessoseletivo.services.credential.CredentialService;
import com.ph_sm.tcdprocessoseletivo.services.credential.CredentialServiceLocal;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserService implements UserServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Inject
    CredentialServiceLocal credentialService;

    @Override
    public void persist(User user) {
        credentialService.persist(user.getCredential());
        em.persist(user);
    }

    @Override
    public User findUserByEmail(String email) {
        Credential credential = em.createQuery("SELECT c FROM Credential c WHERE c.email = :email", Credential.class)
                .setParameter("email", email)
                .getSingleResult();

        User user = em.createQuery("SELECT u FROM users_tb u WHERE u.credential = :credential", User.class)
                .setParameter("credential", credential)
                .getSingleResult();

        return user;
    }

    @Override
    public User findUserById(Long id) {
        User user = em.createQuery("SELECT u FROM users_tb u WHERE u.id = :id", User.class)
                .setParameter("id", id)
                .getSingleResult();

        return user;
    }

    @Override
    public void update(User user) {
        em.merge(user);
    }

    @Override
    public void delete(User user) {
        em.remove(user);
    }
}

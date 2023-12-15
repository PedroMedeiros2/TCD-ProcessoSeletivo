package com.ph_sm.tcdprocessoseletivo.services.credential;

import com.ph_sm.tcdprocessoseletivo.entities.credential.Credential;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class CredentialService implements CredentialServiceLocal {
    @PersistenceContext
    private EntityManager em;


    @Override
    public void persist(Credential credential) {
        em.persist(credential);
    }

    @Override
    public Credential findCredentialByEmail(String email) {
        Credential credential = em.createQuery("SELECT c FROM Credential c WHERE c.email = :email", Credential.class)
                .setParameter("email", email)
                .getSingleResult();

        return credential;
    }

    @Override
    public Credential findCredentialById(Long id) {
        Credential credential = em.createQuery("SELECT c FROM Credential c WHERE c.id = :id", Credential.class)
                .setParameter("id", id)
                .getSingleResult();

        return credential;
    }

    @Override
    public void update(Credential credential) {
        em.merge(credential);
    }

    @Override
    public void delete(Credential credential) {
        em.remove(credential);
    }
}

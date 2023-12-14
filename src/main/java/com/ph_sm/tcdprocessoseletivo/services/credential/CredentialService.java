package com.ph_sm.tcdprocessoseletivo.services.credential;

import com.ph_sm.tcdprocessoseletivo.entities.credential.Credential;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.security.enterprise.identitystore.Pbkdf2PasswordHash;
import java.util.HashMap;
import java.util.Map;

@Stateless
public class CredentialService implements CredentialServiceLocal {

    @Inject
    Pbkdf2PasswordHash passwordHasher;
    @PersistenceContext
    private EntityManager em;

    @Override
    public Credential persist(Credential credential) {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("Pbkdf2PasswordHash.Iterations", "3071");
        parameters.put("Pbkdf2PasswordHash.Algorithm", "PBKDF2WithHmacSHA512");
        parameters.put("Pbkdf2PasswordHash.SaltSizeBytes", "64");
        passwordHasher.initialize(parameters);

        credential.setPassword(passwordHasher.generate(credential.getPassword().toCharArray()));

        em.persist(credential);

        return credential;
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

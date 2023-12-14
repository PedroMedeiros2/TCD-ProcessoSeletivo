package com.ph_sm.tcdprocessoseletivo.services.publication;

import com.ph_sm.tcdprocessoseletivo.entities.publication.Publication;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PublicationService implements PublicationServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void persist(Publication publication) {
        em.persist(publication);
    }

    @Override
    public void update(Publication publication) {
        em.merge(publication);
    }

    @Override
    public void remove(Publication publication) {
        em.remove(publication);
    }

    @Override
    public Publication findPublicationById(long id) {
        Publication publication = em.createQuery("SELECT p FROM Publication p WHERE p.id = :id", Publication.class)
                .setParameter("id", id)
                .getSingleResult();

        return publication;
    }
}

package com.ph_sm.tcdprocessoseletivo.services.announcement;

import com.ph_sm.tcdprocessoseletivo.entities.announcement.Rectification;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class RectificationService implements RectificationServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void persist(Rectification rectification) {
        em.persist(rectification);
    }

    @Override
    public Rectification findRectificationById(Long id) {
        Rectification rectification = em.createQuery("SELECT r FROM Rectification r WHERE r.id = :id", Rectification.class)
                .setParameter("id", id)
                .getSingleResult();

        return rectification;
    }

    @Override
    public void update(Rectification rectification) {
        em.merge(rectification);
    }

    @Override
    public void delete(Rectification rectification) {
        em.remove(rectification);
    }
}

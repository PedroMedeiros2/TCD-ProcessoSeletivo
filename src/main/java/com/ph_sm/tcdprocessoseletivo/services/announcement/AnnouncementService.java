package com.ph_sm.tcdprocessoseletivo.services.announcement;

import com.ph_sm.tcdprocessoseletivo.entities.announcement.Announcement;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class AnnouncementService implements AnnouncementServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void persist(Announcement announcement) {
        em.persist(announcement);
    }

    @Override
    public Announcement findAnnouncementById(Long id) {
        Announcement announcement = em.createQuery("SELECT a FROM Announcement a WHERE a.id = :id", Announcement.class)
                .setParameter("id", id)
                .getSingleResult();

        return announcement;
    }

    @Override
    public Announcement findAnnouncementByNumber(Integer number) {
        Announcement announcement = em.createQuery("SELECT a FROM Announcement a WHERE a.number = :number", Announcement.class)
                .setParameter("number", number)
                .getSingleResult();

        return announcement;
    }

    @Override
    public void update(Announcement announcement) {
        em.merge(announcement);
    }

    @Override
    public void delete(Announcement announcement) {
        em.remove(announcement);
    }
}

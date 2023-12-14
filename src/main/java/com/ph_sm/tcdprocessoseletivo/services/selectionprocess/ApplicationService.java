package com.ph_sm.tcdprocessoseletivo.services.selectionprocess;

import com.ph_sm.tcdprocessoseletivo.entities.selectionprocess.Application;
import com.ph_sm.tcdprocessoseletivo.entities.users.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ApplicationService implements ApplicationServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void persist(Application application) {
        em.persist(application);
    }

    @Override
    public void update(Application application) {
        em.merge(application);
    }

    @Override
    public void delete(Application application) {
        em.remove(em.merge(application));
    }

    @Override
    public List<User> getUsersBySelectionProcessId(long selectionProcessId) {
        List<User> users = em.createQuery("SELECT a.candidate FROM Application a WHERE a.selectionProcess.id = :selectionProcessId", User.class)
                .setParameter("selectionProcessId", selectionProcessId)
                .getResultList();

        return users;
    }
}

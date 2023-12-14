package com.ph_sm.tcdprocessoseletivo.services.selectionprocess;

import com.ph_sm.tcdprocessoseletivo.entities.selectionprocess.SelectionProcess;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class SelectionProcessService implements SelectionProcessServiceLocal {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void persist(SelectionProcess selectionProcess) {
        em.persist(selectionProcess);
    }

    @Override
    public void update(SelectionProcess selectionProcess) {
        em.merge(selectionProcess);
    }

    @Override
    public void remove(SelectionProcess selectionProcess) {
        em.remove(selectionProcess);
    }

    @Override
    public SelectionProcess findSelectionProcessById(long id) {
        SelectionProcess selectionProcess = em.createQuery("SELECT s FROM SelectionProcess s WHERE s.id = :id", SelectionProcess.class)
                .setParameter("id", id)
                .getSingleResult();

        return selectionProcess;
    }
}

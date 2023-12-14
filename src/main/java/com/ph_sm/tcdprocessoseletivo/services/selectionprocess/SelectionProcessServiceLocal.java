package com.ph_sm.tcdprocessoseletivo.services.selectionprocess;

import com.ph_sm.tcdprocessoseletivo.entities.selectionprocess.SelectionProcess;

import javax.ejb.Local;

@Local
public interface SelectionProcessServiceLocal {

    /**
     * Method to persist a selection process.
     * @param selectionProcess selection process to be persisted.
     */
    void persist(SelectionProcess selectionProcess);

    /**
     * Method to update a selection process.
     * @param selectionProcess selection process to be updated.
     */
    void update(SelectionProcess selectionProcess);

    /**
     * Method to remove a selection process.
     * @param selectionProcess selection process to be removed.
     */
    void remove(SelectionProcess selectionProcess);

    /**
     * Method to find a selection process by id.
     * @param id id of the selection process to be found.
     * @return selection process found.
     */
    SelectionProcess findSelectionProcessById(long id);

}

package com.ph_sm.tcdprocessoseletivo.services.publication;

import com.ph_sm.tcdprocessoseletivo.entities.publication.Publication;

import javax.ejb.Local;

@Local
public interface PublicationServiceLocal {

    /**
     * Persist a publication in the database.
     *
     * @param publication Publication to be persisted.
     */
    void persist(Publication publication);

    /**
     * Update a publication in the database.
     *
     * @param publication Publication to be updated.
     */
    void update(Publication publication);

    /**
     * Remove a publication from the database.
     *
     * @param publication Publication to be removed.
     */
    void remove(Publication publication);

    /**
     * Find a publication by its id.
     *
     * @param id Long with the id of the publication to be found.
     * @return Publication with the id passed as parameter.
     */
    Publication findPublicationById(long id);
}

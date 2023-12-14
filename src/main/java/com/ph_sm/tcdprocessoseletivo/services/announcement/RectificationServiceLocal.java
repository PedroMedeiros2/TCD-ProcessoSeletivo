package com.ph_sm.tcdprocessoseletivo.services.announcement;

import com.ph_sm.tcdprocessoseletivo.entities.announcement.Rectification;

import javax.ejb.Local;

/**
 * This interface represents the local interface of the rectification service.
 * Used to perform operations in the database.
 */
@Local
public interface RectificationServiceLocal {
    /**
     * Persists a rectification in the database.
     * @param rectification
     */
    void persist(Rectification rectification);

    /**
     * Finds a rectification by its id.
     * @param id
     * @return
     */
    Rectification findRectificationById(Long id);

    /**
     * Updates a rectification in the database.
     * @param rectification
     */
    void update(Rectification rectification);

    /**
     * Deletes a rectification from the database.
     * @param rectification
     */
    void delete(Rectification rectification);
}

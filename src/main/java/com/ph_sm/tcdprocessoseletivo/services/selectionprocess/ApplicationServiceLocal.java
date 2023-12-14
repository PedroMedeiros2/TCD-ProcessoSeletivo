package com.ph_sm.tcdprocessoseletivo.services.selectionprocess;

import com.ph_sm.tcdprocessoseletivo.entities.selectionprocess.Application;
import com.ph_sm.tcdprocessoseletivo.entities.users.User;

import javax.ejb.Local;
import java.util.List;

@Local
public interface ApplicationServiceLocal {
    /**
     * Persist an application.
     * @param application Application to be persisted.
     */
    void persist(Application application);

    /**
     * Update an application.
     * @param application Application to be updated.
     */
    void update(Application application);

    /**
     * Delete an application.
     * @param application Application to be deleted.
     */
    void delete(Application application);

    /**
     * Return all user's who applied to a selection process.
     * @param selectionProcessId Id of the selection process.
     *                           Example: "1"
     * @return List of User's who applied to a selection process.
     */
    List<User> getUsersBySelectionProcessId(long selectionProcessId);
}

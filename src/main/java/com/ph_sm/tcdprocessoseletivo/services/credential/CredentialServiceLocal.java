package com.ph_sm.tcdprocessoseletivo.services.credential;

import com.ph_sm.tcdprocessoseletivo.entities.credential.Credential;

import javax.ejb.Local;

/**
 * Interface for the CredentialService
 */
@Local
public interface CredentialServiceLocal {

    /**
     * Persist a credential in the database
     *
     * @param credential Credential to be persisted
     * @return Credential persisted
     */
    Credential persist(Credential credential);

    /**
     * Find a credential by email
     *
     * @param email Email of the credential to be found
     * @return Credential found
     */
    Credential findCredentialByEmail(String email);

    /**
     * Find a credential by id
     *
     * @param id Id of the credential to be found
     * @return Credential found
     */
    Credential findCredentialById(Long id);

    /**
     * Update a credential in the database
     *
     * @param credential Credential to be updated
     */
    void update(Credential credential);

    /**
     * Delete a credential from the database
     *
     * @param credential Credential to be deleted
     */
    void delete(Credential credential);

}

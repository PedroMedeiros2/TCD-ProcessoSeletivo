package com.ph_sm.tcdprocessoseletivo.services.users;

import com.ph_sm.tcdprocessoseletivo.entities.users.User;

import javax.ejb.Local;

/**
 * Interface for the UserService
 */
@Local
public interface UserServiceLocal {
    /**
     * Persist a user in the database
     *
     * @param user User to be persisted
     */
    void persist(User user);

    /**
     * Find a user by email
     *
     * @param email Email of the user to be found
     * @return User found
     */
    User findUserByEmail(String email);

    /**
     * Find a user by id
     *
     * @param id Id of the user to be found
     * @return User found
     */
    User findUserById(Long id);

    /**
     * Update a user in the database
     *
     * @param user User to be updated
     */
    void update(User user);

    /**
     * Delete a user from the database
     *
     * @param user User to be deleted
     */
    void delete(User user);
}

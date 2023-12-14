package com.ph_sm.tcdprocessoseletivo.services.announcement;


import com.ph_sm.tcdprocessoseletivo.entities.announcement.Announcement;

import javax.ejb.Local;

@Local
public interface AnnouncementServiceLocal {
    /**
     * Persist an announcement in the database.
     *
     * @param announcement Announcement to be persisted
     */
    void persist(Announcement announcement);

    /**
     * Find an announcement by its unique identifier.
     *
     * @param id Long with the unique identifier of the announcement
     * @return Announcement with the announcement found
     */
    Announcement findAnnouncementById(Long id);

    /**
     * Find an announcement by its number.
     *
     * @param number Integer with the number of the announcement
     * @return Announcement with the announcement found
     */
    Announcement findAnnouncementByNumber(Integer number);

    /**
     * Update an announcement in the database.
     *
     * @param announcement Announcement to be updated
     */
    void update(Announcement announcement);

    /**
     * Delete an announcement from the database.
     *
     * @param announcement Announcement to be deleted
     */
    void delete(Announcement announcement);
}

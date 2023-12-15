package com.ph_sm.tcdprocessoseletivo.entities.announcement;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

/**
 * This class represents a rectification entity.
 * Used to store rectification data.
 * A rectification is a change in the announcement.
 */
@Entity
public class Rectification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate publicationDate;
    private String description;
    private String link;
    @ManyToOne
    @JoinColumn(name = "announcement_id")
    private Announcement announcement;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Constructor method without parameters.
     */
    public Rectification() {}
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">

    /**
     * Get the unique identifier of the rectification
     *
     * @return Long with the unique identifier of the rectification
     */
    public long getId() {
        return id;
    }

    /**
     * Set the unique identifier of the rectification
     *
     * @param id Long with the unique identifier of the rectification
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Get the publication date of the rectification
     *
     * @return Date with the publication date of the rectification
     */
    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    /**
     * Set the publication date of the rectification
     *
     * @param publicationDate Date with the publication date of the rectification
     */
    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * Get the description of the rectification
     *
     * @return String with the description of the rectification
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description of the rectification
     *
     * @param description String with the description of the rectification
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the link of the rectification
     *
     * @return String with the link of the rectification
     */
    public String getLink() {
        return link;
    }

    /**
     * Set the link of the rectification
     *
     * @param link String with the link of the rectification
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Get the announcement of the rectification
     *
     * @return Announcement with the announcement of the rectification
     */
    public Announcement getAnnouncement() {
        return announcement;
    }

    /**
     * Set the announcement of the rectification
     *
     * @param announcement Announcement with the announcement of the rectification
     */
    public void setAnnouncement(Announcement announcement) {
        this.announcement = announcement;
    }
    //</editor-fold>

}
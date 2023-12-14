package com.ph_sm.tcdprocessoseletivo.entities.announcement;

import javax.persistence.*;
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
    private Date publicationDate;
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

    //</editor-fold>

}
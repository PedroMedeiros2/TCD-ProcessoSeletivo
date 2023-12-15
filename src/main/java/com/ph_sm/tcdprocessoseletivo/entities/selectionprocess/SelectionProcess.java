package com.ph_sm.tcdprocessoseletivo.entities.selectionprocess;

import com.ph_sm.tcdprocessoseletivo.entities.announcement.Announcement;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

/**
 * this class represents a selection process entity.
 * Used to store selection process data.
 */
@Entity
public class SelectionProcess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private LocalDate  startDate;
    private LocalDate endDate;
    @Enumerated(EnumType.STRING)
    private StatusSelectionProcess status;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "announcement_id", referencedColumnName = "id")
    private Announcement announcement;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Constructor method without parameters.
     */
    public SelectionProcess() {}
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    /**
     * Getter method for id attribute.
     * @return id attribute.
     */
    public long getId() {
        return id;
    }

    /**
     * Setter method for id attribute.
     * @param id id attribute.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Getter method for title attribute.
     * @return title attribute.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter method for title attribute.
     * @param title title attribute.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter method for startDate attribute.
     * @return startDate attribute.
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Setter method for startDate attribute.
     * @param startDate startDate attribute.
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter method for endDate attribute.
     * @return endDate attribute.
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Setter method for endDate attribute.
     * @param endDate endDate attribute.
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter method for status attribute.
     * @return status attribute.
     */
    public StatusSelectionProcess getStatus() {
        return status;
    }

    /**
     * Setter method for status attribute.
     * @param status status attribute.
     */
    public void setStatus(StatusSelectionProcess status) {
        this.status = status;
    }

    /**
     * Getter method for announcement attribute.
     * @return announcement attribute.
     */
    public Announcement getAnnouncement() {
        return announcement;
    }

    /**
     * Setter method for announcement attribute.
     * @param announcement announcement attribute.
     */
    public void setAnnouncement(Announcement announcement) {
        this.announcement = announcement;
    }
    //</editor-fold>
}

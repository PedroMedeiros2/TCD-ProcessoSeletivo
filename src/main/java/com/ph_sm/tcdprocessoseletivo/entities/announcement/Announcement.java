package com.ph_sm.tcdprocessoseletivo.entities.announcement;

import com.ph_sm.tcdprocessoseletivo.entities.selectionprocess.SelectionProcess;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class represents an announcement entity.
 * Used to store announcement data.
 * An announcement is a public announcement of a selection process.
 */
@Entity
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Integer number;
    private LocalDate publicationDate;
    private String description;
    private String link;
    @OneToMany(mappedBy = "announcement", cascade = CascadeType.ALL)
    private List<Rectification> rectifications;
    @OneToOne(mappedBy = "announcement")
    private SelectionProcess selectionProcess;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Constructor method without parameters.
     */
    public Announcement() {
        this.rectifications = new ArrayList<>();
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    /**
     * Get the unique identifier of the announcement
     *
     * @return Long with the unique identifier of the announcement
     */
    public long getId() {
        return id;
    }

    /**
     * Set the unique identifier of the announcement
     *
     * @param id Long with the unique identifier of the announcement
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Get the number of the announcement
     *
     * @return Integer with the number of the announcement
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Set the number of the announcement
     *
     * @param number Integer with the number of the announcement
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * Get the publication date of the announcement
     *
     * @return Date with the publication date of the announcement
     */
    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    /**
     * Set the publication date of the announcement
     *
     * @param publicationDate Date with the publication date of the announcement
     */
    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * Get the description of the announcement
     *
     * @return String with the description of the announcement
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description of the announcement
     *
     * @param description String with the description of the announcement
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the link of the announcement
     *
     * @return String with the link of the announcement
     */
    public String getLink() {
        return link;
    }

    /**
     * Set the link of the announcement
     *
     * @param link String with the link of the announcement
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Get the rectifications of the announcement
     *
     * @return List with the rectifications of the announcement
     */
    public List<Rectification> getRectifications() {
        return rectifications;
    }

    /**
     * Set the rectifications of the announcement
     *
     * @param rectifications List with the rectifications of the announcement
     */
    public void setRectifications(List<Rectification> rectifications) {
        this.rectifications = rectifications;
    }

    /**
     * Get the selection process of the announcement
     *
     * @return SelectionProcess with the selection process of the announcement
     */
    public SelectionProcess getSelectionProcess() {
        return selectionProcess;
    }

    /**
     * Set the selection process of the announcement
     *
     * @param selectionProcess SelectionProcess with the selection process of the announcement
     */
    public void setSelectionProcess(SelectionProcess selectionProcess) {
        this.selectionProcess = selectionProcess;
    }
    //</editor-fold>
}

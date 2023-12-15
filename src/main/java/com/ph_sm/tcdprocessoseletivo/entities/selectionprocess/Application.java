package com.ph_sm.tcdprocessoseletivo.entities.selectionprocess;

import com.ph_sm.tcdprocessoseletivo.entities.selectionprocess.SelectionProcess;
import com.ph_sm.tcdprocessoseletivo.entities.users.User;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

/**
 * This class represents an application entity.
 * Used to store application data.
 * An application is a candidate's application to a selection process.
 */
@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private User candidate;
    @ManyToOne
    @JoinColumn(name = "selection_process_id")
    private SelectionProcess selectionProcess;
    private LocalDate applicationDate;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Constructor method without parameters.
     */
    public Application() {}
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">

    /**
     * Get the id of the application.
     * @return The id of the application.
     */
    public long getId() {
        return id;
    }

    /**
     * Set the id of the application.
     * @param id The id of the application.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Get the candidate of the application.
     * @return The candidate of the application.
     */
    public User getCandidate() {
        return candidate;
    }

    /**
     * Set the candidate of the application.
     * @param candidate The candidate of the application.
     */
    public void setCandidate(User candidate) {
        this.candidate = candidate;
    }

    /**
     * Get the selection process of the application.
     * @return The selection process of the application.
     */
    public SelectionProcess getSelectionProcess() {
        return selectionProcess;
    }

    /**
     * Set the selection process of the application.
     * @param selectionProcess The selection process of the application.
     */
    public void setSelectionProcess(SelectionProcess selectionProcess) {
        this.selectionProcess = selectionProcess;
    }

    /**
     * Get the application date of the application.
     * @return The application date of the application.
     */
    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    /**
     * Set the application date of the application.
     * @param applicationDate The application date of the application.
     */
    public void setApplicationDate(LocalDate    applicationDate) {
        this.applicationDate = applicationDate;
    }
    //</editor-fold>
}

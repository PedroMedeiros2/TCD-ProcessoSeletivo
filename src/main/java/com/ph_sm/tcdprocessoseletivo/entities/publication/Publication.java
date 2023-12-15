package com.ph_sm.tcdprocessoseletivo.entities.publication;

import com.ph_sm.tcdprocessoseletivo.entities.users.User;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

/**
 * This class represents a publication entity.
 * Used to store publication data.
 * A publication is a news, announcement, instructions, exam or answer key.
 */
@Entity
public class Publication {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    @Column(length = 10000)
    private String content;
    private LocalDate publishDate;
    private LocalDate editDate;
    @ManyToOne
    private User author;
    @Enumerated(EnumType.STRING)
    private PublicationType type;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Constructor method without parameters.
     */
    public Publication() {}
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">

    /**
     * Get the unique identifier of the publication
     *
     * @return Long with the unique identifier of the publication
     */
    public long getId() {
        return id;
    }

    /**
     * Set the unique identifier of the publication
     *
     * @param id Long with the unique identifier of the publication
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Get the title of the publication
     *
     * @return String with the title of the publication
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the title of the publication
     *
     * @param title String with the title of the publication
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get the content of the publication
     *
     * @return String with the content of the publication
     */
    public String getContent() {
        return content;
    }

    /**
     * Set the content of the publication
     *
     * @param content String with the content of the publication
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Get the publish date of the publication
     *
     * @return Date with the publish date of the publication
     */

    public LocalDate getPublishDate() {
        return publishDate;
    }

    /**
     * Set the publish date of the publication
     *
     * @param publishDate Date with the publish date of the publication
     */
    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    /**
     * Get the edit date of the publication
     *
     * @return Date with the edit date of the publication
     */
    public LocalDate getEditDate() {
        return editDate;
    }

    /**
     * Set the edit date of the publication
     *
     * @param editDate Date with the edit date of the publication
     */
    public void setEditDate(LocalDate editDate) {
        this.editDate = editDate;
    }

    /**
     * Get the author of the publication
     *
     * @return User with the author of the publication
     */
    public User getAuthor() {
        return author;
    }

    /**
     * Set the author of the publication
     *
     * @param author User with the author of the publication
     */
    public void setAuthor(User author) {
        this.author = author;
    }

    /**
     * Get the type of the publication
     *
     * @return PublicationType with the type of the publication
     */
    public PublicationType getType() {
        return type;
    }

    /**
     * Set the type of the publication
     *
     * @param type PublicationType with the type of the publication
     */
    public void setType(PublicationType type) {
        this.type = type;
    }
    //</editor-fold>
}

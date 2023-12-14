package com.ph_sm.tcdprocessoseletivo.entities.credential;

import javax.persistence.*;

/**
 * Class representing the credentials of the users
 * id: Unique identifier of the user
 * email: Email of the user
 * password: Password of the user
 * role: Role of the user
 */

@Entity
public class Credential {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 255, nullable = false, unique = true)
    private String email;
    @Column(length = 100, nullable = false)
    private String password;

    //<editor-fold defaultstate="collapsed" desc="Constructors">

    /**
     * Constructor method without parameters.
     */
    public Credential() {}
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">

    /**
     * Get the unique identifier of the user
     *
     * @return Long with the unique identifier of the user
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the unique identifier of the user
     *
     * @param id Long with the unique identifier of the user
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the email of the user
     *
     * @return String with the email of the user
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the email of the user
     *
     * @param email String with the email of the user
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the password of the user
     *
     * @return String with the password of the user
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the password of the user
     *
     * @param password String with the password of the user
     */
    public void setPassword(String password) {
        this.password = password;
    }
    //</editor-fold>
}

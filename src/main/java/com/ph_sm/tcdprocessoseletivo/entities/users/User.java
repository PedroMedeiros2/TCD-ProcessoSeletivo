package com.ph_sm.tcdprocessoseletivo.entities.users;

import com.ph_sm.tcdprocessoseletivo.entities.credential.Credential;

import javax.persistence.*;
import java.time.LocalDate;


/**
 * This class represents a User entity.
 * Used to store user data.
 * A user is a person who can access the system.
 * A user can be a candidate, editor or administrator.
 */
@Entity
@Table(name = "users_tb")
public class User {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 255, nullable = false)
    private String name;

    private LocalDate birthDate;
    @Column(length = 11, nullable = false, unique = true)
    private String cpf;
    @Enumerated(EnumType.STRING)
    private Role role;
    private Boolean newsletter = false;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Credential credential;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Constructor method without parameters.
     */
    public User() {}
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
     * Get the name of the user
     *
     * @return String with the name of the user
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the user
     *
     * @param name String with the name of the user
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the birth date of the user
     *
     * @return Date with the birth date of the user
     */
    public LocalDate  getBirthDate() {
        return birthDate;
    }

    /**
     * Set the birth date of the user
     *
     * @param birthDate Date with the birth date of the user
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Get the CPF of the user
     *
     * @return String with the CPF of the user
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Set the CPF of the user
     *
     * @param cpf String with the CPF of the user
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Get the role of the user
     *
     * @return Role with the role of the user
     */
    public Role getRole() {
        return role;
    }

    /**
     * Set the role of the user
     *
     * @param role Role with the role of the user
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * Get the newsletter of the user
     *
     * @return Boolean with the newsletter of the user
     */
    public Boolean getNewsletter() {
        return newsletter;
    }

    /**
     * Set the newsletter of the user
     *
     * @param newsletter Boolean with the newsletter of the user
     */
    public void setNewsletter(Boolean newsletter) {
        this.newsletter = newsletter;
    }

    /**
     * Get the credential of the user
     *
     * @return Credential with the credential of the user
     */
    public Credential getCredential() {
        return credential;
    }

    /**
     * Set the credential of the user
     *
     * @param credential Credential with the credential of the user
     */
    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    //</editor-fold>
}

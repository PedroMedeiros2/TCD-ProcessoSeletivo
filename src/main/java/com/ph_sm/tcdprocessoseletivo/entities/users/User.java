package com.ph_sm.tcdprocessoseletivo.entities.users;

import com.ph_sm.tcdprocessoseletivo.entities.person.Person;

import javax.persistence.*;

/**
 * Abstract class that represents a User.
 * @see Person
 * @see Credential
 */

@MappedSuperclass
public abstract class User extends Person {

    //<editor-fold defaultstate="collapsed" desc="Attributes">
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Credential credential;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Constructor method without parameters.
     */
    public User() {}
    //</editor-fold>
}

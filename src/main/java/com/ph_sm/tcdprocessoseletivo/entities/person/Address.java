package com.ph_sm.tcdprocessoseletivo.entities.person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Class representing an address entity.
 * Used to store the address information of a person.
 * It is utilized within the Person class.
 */

@Entity
public class Address {

    //<editor-fold defaultstate="collapsed" desc="Attributes">
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructors">

    /**
     * Constructor method without parameters.
     */
    public Address() {}

    /**
     * Constructor method without parameters.
     *
     * @param address String containing the address.
     *                Example: "Rua dos Bobos, 0"
     * @param city String containing the city.
     *             Example: "São Paulo"
     * @param state String containing the state.
     *              Example: "SP"
     * @param zipCode String containing the zip code.
     *                Example: "00000-000"
     *
     */
    public Address(String address, String city, String state, String zipCode) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    /**
     * Getter method for the id attribute.
     *
     * @return Long containing the id.
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter method for the id attribute.
     *
     * @param id Long containing the id.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter method for the address attribute.
     *
     * @return String containing the address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter method for the address attribute.
     *
     * @param address String containing the address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Getter method for the city attribute.
     *
     * @return String containing the city.
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter method for the city attribute.
     *
     * @param city String containing the city.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter method for the state attribute.
     *
     * @return String containing the state.
     */
    public String getState() {
        return state;
    }

    /**
     * Setter method for the state attribute.
     *
     * @param state String containing the state.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter method for the zipCode attribute.
     *
     * @return String containing the zip code.
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
    * Setter method for the zipCode attribute.
    *
    * @param zipCode String containing the zip code.
    */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    //</editor-fold>

}

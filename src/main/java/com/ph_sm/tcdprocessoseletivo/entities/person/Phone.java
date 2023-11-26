package com.ph_sm.tcdprocessoseletivo.entities.person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Class representing a phone entity.
 * Used to store the phone information of a person.
 * It is utilized within the Person class.
 */

@Entity
public class Phone {
    //<editor-fold defaultstate="collapsed" desc="Attributes">
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String countryCode;
    private String areaCode;
    private String number;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructors">

    /**
     * Constructor method without parameters.
     */
    public Phone() {}

    /**
     * Constructor method without parameters.
     *
     * @param countryCode String containing the country code.
     *                    Example: "+55"
     * @param areaCode String containing the area code.
     *                 Example: "11"
     * @param number String containing the phone number.
     *               Example: "99999-9999"
     *
     */
    public Phone(String countryCode, String areaCode, String number) {
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.number = number;
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
     * Getter method for the countryCode attribute.
     *
     * @return String containing the country code.
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Setter method for the countryCode attribute.
     *
     * @param countryCode String containing the country code.
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Getter method for the areaCode attribute.
     *
     * @return String containing the area code.
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Setter method for the areaCode attribute.
     *
     * @param areaCode String containing the area code.
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * Getter method for the number attribute.
     *
     * @return String containing the phone number.
     */
    public String getNumber() {
        return number;
    }

    /**
     * Setter method for the number attribute.
     *
     * @param number String containing the phone number.
     */
    public void setNumber(String number) {
        this.number = number;
    }

    //</editor-fold>

}

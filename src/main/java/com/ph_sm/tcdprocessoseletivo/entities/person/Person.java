package com.ph_sm.tcdprocessoseletivo.entities.person;

import java.util.Date;

/**
 * Class representing a person entity.
 * Used to store the information of a person.
 */
public class Person {

    //<editor-fold defaultstate="collapsed" desc="Attributes">
    private Long id;
    private String name;
    private Date birthDate;
    private String cpf;
    private Phone phone;
    private Address address;

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructors">

/**
     * Constructor method without parameters.
     *
     * @param name String containing the name.
     *             Example: "John Doe"
     * @param birthDate Date containing the birth date.
     *                  Example: "01/01/2000"
     * @param cpf String containing the CPF.
     *            Example: "000.000.000-00"
     * @param phone Phone containing the phone information.
     *              Example: "Phone{countryCode=+55, areaCode=11, number=99999-9999}"
     * @param address Address containing the address information.
     *                Example: "Address{address=Rua dos Bobos, 0, city=São Paulo, state=SP, zipCode=00000-000}"
     */
    public Person(String name, Date birthDate, String cpf, Phone phone, Address address) {
        this.name = name;
        this.birthDate = birthDate;
        this.cpf = cpf;
        this.phone = phone;
        this.address = address;
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
     * Getter method for the name attribute.
     *
     * @return String containing the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for the name attribute.
     *
     * @param name String containing the name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for the birthDate attribute.
     *
     * @return Date containing the birth date.
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Setter method for the birthDate attribute.
     *
     * @param birthDate Date containing the birth date.
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Getter method for the cpf attribute.
     *
     * @return String containing the CPF.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Setter method for the cpf attribute.
     *
     * @param cpf String containing the CPF.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Getter method for the phone attribute.
     *
     * @return Phone containing the phone information.
     */
    public Phone getPhone() {
        return phone;
    }

    /**
     * Setter method for the phone attribute.
     *
     * @param phone Phone containing the phone information.
     */
    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    /**
     * Getter method for the address attribute.
     *
     * @return Address containing the address information.
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Setter method for the address attribute.
     *
     * @param address Address containing the address information.
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    //</editor-fold>

}

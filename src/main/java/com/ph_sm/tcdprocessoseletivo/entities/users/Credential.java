package com.ph_sm.tcdprocessoseletivo.entities.users;

/**
 * Class representing the credentials of the users
 * id: Unique identifier of the user
 * email: Email of the user
 * password: Password of the user
 * role: Role of the user
 */
public class Credential {
    //<editor-fold defaultstate="collapsed" desc="Attributes">
    private Long id;
    private String email;
    private String password;
    private Role role;

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Constructor passing the parameters
     *
     * @param email Email of the user.
     *              Example: "joao.bobo@email.com"
     * @param password Password of the user.
     *                 Example: "123456"
     * @param role Role of the user.
     *             Example: Role.ADM
     */
    public Credential(String email, String password, Role role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }

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
}

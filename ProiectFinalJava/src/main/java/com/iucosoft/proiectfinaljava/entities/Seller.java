package com.iucosoft.proiectfinaljava.entities;

import java.util.Objects;

/**
 *
 * @author tacua
 */
public class Seller {

    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private int telephone;

    public Seller() {
    }

    public Seller(int id, String ussername, String firstName, String lastName, int telephone) {
        this.id = id;
        this.username = ussername;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.username);

        hash = 23 * hash + Objects.hashCode(this.firstName);
        hash = 23 * hash + Objects.hashCode(this.lastName);
        hash = 23 * hash + this.telephone;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Seller other = (Seller) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.telephone != other.telephone) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Seller{" + "id=" + id + ", username=" + username + ", firstName=" + firstName + ", lastName=" + lastName + ", telephone=" + telephone + '}';
    }

    public String toStringUsername() {
        return username;
    }

}

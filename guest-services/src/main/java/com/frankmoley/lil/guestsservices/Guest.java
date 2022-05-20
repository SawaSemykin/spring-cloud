package com.frankmoley.lil.guestsservices;

import javax.persistence.*;

/**
 * @author Aleksandr Semykin
 */
@Entity
@Table(name="PERSON")
public class Guest {

    @Id
    @Column(name="PERSON_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="EMAIL_ADDRESS")
    private String emailAddress;

    public long getId() {
        return id;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}

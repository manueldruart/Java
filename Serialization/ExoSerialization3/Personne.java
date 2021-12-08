package com.company.Serialization.ExoSerialization3;

import java.io.Serializable;

public class Personne implements Serializable {
    private String firstName;
    private String lastName;
    private String job;
    private int dateOfBirth;

    public Personne(String firstName, String lastName, String job, int dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.job = job;
        this.dateOfBirth = dateOfBirth;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", job='" + job + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}


package com.softserveinc.task01;

public class Human {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String phone;

    public Human() {
    }

    public Human(String firstName, String lastName, String dateOfBirth, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName=' " + firstName + '\'' +
                ", lastName=' " + lastName + '\'' +
                ", dateOfBirth=' " + dateOfBirth + '\'' +
                ", phone=' " + phone + '\'' +
                '}';
        }
    }



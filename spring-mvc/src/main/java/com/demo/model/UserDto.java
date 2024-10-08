package com.demo.model;

public class UserDto {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public UserDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public String toString() {
        return "UserDto{" +
               "fname='" + firstName + '\'' +
               ", lname='" + lastName + '\'' +
               '}';
    }
}

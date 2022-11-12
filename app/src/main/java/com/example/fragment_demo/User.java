package com.example.fragment_demo;

public class User {

    private String first_letter;
    private String name;
    private String ammound;

    public User(String first_letter, String name, String ammound) {
        this.first_letter = first_letter;
        this.name = name;
        this.ammound = ammound;
    }

    public String getFirst_letter() {
        return first_letter;
    }

    public void setFirst_letter(String first_letter) {
        this.first_letter = first_letter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmmound() {
        return ammound;
    }

    public void setAmmound(String ammound) {
        this.ammound = ammound;
    }
}

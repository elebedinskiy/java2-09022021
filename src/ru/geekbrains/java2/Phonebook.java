package ru.geekbrains.java2;

public class Phonebook {
    private String family;
    private String phone;

    Phonebook(String family, String phones){
        this.family = family;
        this.phone = phones;
    }

    public String getFamily() {
        return family;
    }

    public String getPhone() {
        return phone;
    }

}
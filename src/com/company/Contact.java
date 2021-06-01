package com.company;

public class Contact {
    String name;
    String phone;
    String email;

    String getContactDetails(){
        return name + "," + phone + "," + email;
    }
    void updateContactDetails(String name,String phone,String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

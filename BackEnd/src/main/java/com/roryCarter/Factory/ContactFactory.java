package com.roryCarter.Factory;

import com.roryCarter.Domain.Contact;

public class ContactFactory {
    public static Contact buildContact(String screenId, String cellNo, String email, String query)     {
        Contact contact=new Contact.Builder()

                .screenId(screenId)
                .cellNo(cellNo)
                .email(email)
                .query(query)
                .build();
        return contact;
    }
}

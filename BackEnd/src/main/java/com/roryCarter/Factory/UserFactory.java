package com.roryCarter.Factory;

import com.roryCarter.Domain.User;

import java.util.Date;

public class UserFactory {
    public static User buildUser(String screenId, String firstName, String lastName, String password, String dietLaw, Date dateJoined, double weight)

    {
        User user=new User.Builder()
                .screenId(screenId)
                .firstName(firstName)
                .lastName(lastName)
                .password(password)
                .dietLaw(dietLaw)
                .dateJoined(dateJoined)
                .weight(weight)
                .build();

        return user;


    }
}

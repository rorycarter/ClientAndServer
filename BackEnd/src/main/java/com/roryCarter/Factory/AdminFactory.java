package com.roryCarter.Factory;

import com.roryCarter.Domain.Admin;

public class AdminFactory {


    public static Admin buildAdmin(String screenId, String fullName, String password)
    {
        Admin admin = new Admin.Builder()
                .screenId(screenId)
                .fullName(fullName)
                .password(password)
                .build();
        return admin;
    }
}

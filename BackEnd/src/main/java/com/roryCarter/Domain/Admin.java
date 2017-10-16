package com.roryCarter.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

    @Id
    private String screenId;
    private String fullName;
    private String password;


    public String getScreenId() {
        return screenId;
    }

    public String getFullName() {
        return fullName;
    }


    public String getPassword() {
        return password;
    }
    private Admin() {
    }

    public Admin(Builder builder) {
        this.screenId = builder.screenId;
        this.fullName = builder.fullName;
        this.password = builder.password;
    }

    public static class Builder{
        private String screenId;
        private String fullName;
        private String password;

        public Builder screenId(String value){
            this.screenId = value;
            return this;
        }

        public Builder fullName(String value){
            this.fullName = value;
            return this;
        }

        public Builder password(String value){
            this.password = value;
            return this;
        }

        public Admin build(){

            return new Admin(this);
        }

    }


}

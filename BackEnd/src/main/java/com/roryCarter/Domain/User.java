package com.roryCarter.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {

    @Id
    private String screenId;
    private String firstName;
    private String lastName;
    private String password;
    private String dietLaw;
    private Date dateJoined;
    private double weight;


public User()
{



}
    public String getScreenId() {
        return screenId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public String getPassword() {
        return password;
    }

    public String getDietLaw() {
        return dietLaw;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public double getWeight() {
        return weight;
    }

    public User(Builder builder)
    {

        this.password=builder.password;
        this.screenId=builder.screenId;
        this.dietLaw=builder.dietLaw;
        this.dateJoined=builder.dateJoined;


    }
    public static class Builder
    {
        private String screenId;
        private String firstName;
        private String lastName;

        private String password;
        private String dietLaw;
        private Date dateJoined;
        private double weight;



        public Builder screenId(String value)
        {

            this.screenId=value;
            return this;



        }
        public Builder firstName (String value)
        {

            this.firstName=value;
            return this;


        }
        public Builder lastName (String value)
        {

            this.lastName=value;
            return this;


        }

        public Builder password(String value)
        {

            this.password=value;
            return this;
        }

        public Builder dietLaw(String value)
        {

            this.dietLaw=value;
            return this;
        }
        public Builder dateJoined(Date value) {
            this.dateJoined=value;
            return this;
        }
        public Builder weight(double value)
        {

            this.weight=value;
            return this;
        }
        public User build()
        {


            return new User(this);

        }


    }
    public int compareTo(User user) {
        return screenId.compareTo(user.screenId);
    }


    public boolean equals(Object o)
    {


        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return screenId == user.screenId;


    }

    public String hashcode()
    {

        return screenId;
    }
    @Override
    public String toString() {
        return "User{" +
                "Screen Id='" + screenId + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

}

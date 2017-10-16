package com.roryCarter.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {
    @Id
    private String screenId;

    private String cellNo;
    private String email;
    private String query;


    public String getEmail() {
        return email;
    }

    public String getCellNo() {
        return cellNo;
    }

    public String getScreenId() {
        return screenId;
    }

    public String getQuery() {
        return query;
    }

    public Contact()
    {}


    private Contact(Builder builder)
    {

        this.cellNo=builder.cellNo;
        this.email=builder.email;
        this.query=builder.query;
        this.screenId=builder.screenId;

    }
    public static class Builder
    {

        private String email;
        private String query;
        private String cellNo;
        private String screenId;


        public Builder cellNo(String value)
        {

            this.cellNo=value;
            return this;
        }
        public Builder email(String value)
        {

            this.email=value;
            return this;

        }
        public Builder query(String value)
        {
            this.query=value;
            return this;
        }
        public Builder screenId(String value)
        {
            this.screenId=value;
            return this;
        }

        public Contact build()
        {


            return new Contact(this);

        }

    }


}

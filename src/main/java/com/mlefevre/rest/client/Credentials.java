package com.mlefevre.rest.client;

public class Credentials {

    protected String userName;

    protected String password;


    public Credentials() { }

    public Credentials(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

}
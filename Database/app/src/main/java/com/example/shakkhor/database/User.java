package com.example.shakkhor.database;

/**
 * Created by Risad on 28-Jul-17.
 */

public class User {
    String email,uname,pass;

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setUname(String uname){
        this.uname = uname;
    }

    public String getUname(){
        return this.uname;
    }

    public void setPass(String pass){
        this.pass = pass;
    }

    public String getPass(){
        return this.pass;
    }
}

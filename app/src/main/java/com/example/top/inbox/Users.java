package com.example.top.inbox;

/**
 * Created by TOP on 9/1/2016.
 */
public class Users {
    int id;
    String username , email , pass , repmail , date;
    public void setId(int id)
    {
        this.id=id;
    }
    public int detId()
    {
        return this.id;
    }
    public void setName(String username)
    {
        this.username=username;
    }
    public String getName()
    {
        return this.username;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getEmail()
    {
        return this.email;
    }
    public void setPass(String pass)
    {
        this.pass=pass;
    }
    public String getPassword()
    {
        return this.pass;
    }
    public void setRepmail(String repmail)
    {
        this.repmail=repmail;
    }
    public String getRepmail()
    {
        return this.repmail;
    }
    public void setDate(String date)
    {
        this.date=date;
    }
    public String getDate()
    {
        return this.date;
    }
}

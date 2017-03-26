package com.sample.spark.account;
import java.util.*;;

import com.sample.spark.account.accounts;

public class credentials{
    String username;
    String passwd;

    public void setuser(String u){
        username = u;
    }
    public void setpasswd(String p){
        passwd = p;
    }
    public String getuser(){
        return username;
    }
    public String getpasswd(){
        return passwd;
    }
    public credentials(String u, String p){
        username = u;
        passwd = p;
    }
}
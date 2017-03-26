package com.sample.spark.account;
import java.util.*;
import com.sample.spark.account.*;

public class accounts{
    ArrayList<credentials> account = new ArrayList();

    public ArrayList<credentials> all(){
        return account;
    }
    public void add(credentials credential){
        account.add(credential);
    }
    public boolean testif(String t){
        boolean test = false;
        for(credentials c : account){
            if(t.equals(c.username)){
                test = true;
            }
        }
        return test;
    }
    public boolean login(String u, String p){
        boolean test1 = false;
        boolean test2 = false;
        boolean test3 = false;
        for(credentials c : account){
            if(u.equals(c.username)){
                test1 = true;
        }
            if(p.equals(c.passwd)){
                test2 = true;
            }
        }
        if(test1 && test2){
            test3 = true;
        }
        return test3;
    }
}
package com.sample.spark;

import java.util.HashMap;
import java.util.Map;

import com.sample.sparkdemo.extend.Recipe;
import com.sample.sparkdemo.extend.Ingredient;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;
import static spark.Spark.*;
import java.util.Calendar;
import java.util.*;

public class Main {

    public static String name="", add="", contact="", email="", remove="", uname="", passwd="", company="";
    public static String uname_signup="", passwd_signup="";
    public static List<String> fullname = new ArrayList<String>();
    public static List<String> address = new ArrayList<String>();
    public static List<String> user = new ArrayList<String>(); 
    public static List<String> pass = new ArrayList<String>();
    public static boolean test;


    public static void main(String[] args) {
        
        staticFiles.location("/css"); // Static files

        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            
            model.put("title", "Home: Calling Card");

            return new ModelAndView(model, "home.ftl"); // located in src/main/resources/spark/template/freemarker
        }, new FreeMarkerEngine());

        get("/add", (req, res) -> {
            Map<String, Object> model = new HashMap<>();

            model.put("title", "Add Contact");
            
            return new ModelAndView(model, "add.ftl");
        }, new FreeMarkerEngine());

        post("/add", (req, res) -> {
            Map<String, Object> model = new HashMap<>();

            name = req.queryParams("fullname");
            add = req.queryParams("fulladdress");
            contact = req.queryParams("contact");
            company = req.queryParams("company");
            email = req.queryParams("email");

            fullname.add(name);
            address.add(req.queryParams("fulladdress"));

            model.put("title", "UPDATED: Calling Card");
            model.put("address", add);
            model.put("company", company);
            model.put("contact", contact);
            model.put("email", email);
            model.put("month", month());
            model.put("date", date());
            model.put("fullname", fullname);

            return new ModelAndView(model, "phonebook.ftl"); // located in src/main/resources/spark/template/freemarker
        }, new FreeMarkerEngine());

    get("/phonebook", (req, res) -> {
            Map<String, Object> model = new HashMap<>();

            model.put("title", "Phonebook: Calling Card");
            model.put("address", add);
            model.put("company", company);
            model.put("contact", contact);
            model.put("email", email);
            model.put("month", month());
            model.put("date", date());
            model.put("fullname", fullname);

            return new ModelAndView(model, "phonebook.ftl"); // located in src/main/resources/spark/template/freemarker
        }, new FreeMarkerEngine());
    post("/phonebook", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            remove = req.queryParams("remove");


            model.put("title", "Phonebook: Calling Card");
            model.put("address", add);
            model.put("company", company);
            model.put("contact", contact);
            model.put("email", email);
            model.put("month", month());
            model.put("date", date());
            model.put("fullname", fullname);

            return new ModelAndView(model, "phonebook.ftl"); // located in src/main/resources/spark/template/freemarker
        }, new FreeMarkerEngine());
    get("/about", (req, res) -> {
                Map<String, Object> model = new HashMap<>();
                
                model.put("title", "About us: Calling Card");

                return new ModelAndView(model, "about us.ftl"); // located in src/main/resources/spark/template/freemarker
            }, new FreeMarkerEngine());
    get("/login", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            
            model.put("title", "Log-in: Calling Card");

            return new ModelAndView(model, "login.ftl"); // located in src/main/resources/spark/template/freemarker
        }, new FreeMarkerEngine());

     post("/login", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            boolean confirm1 = false, confirm2 = false;;
            uname = req.queryParams("username");
            passwd = req.queryParams("password");
            for(String u : user){
                if(u.equals(uname)){
                    confirm1 = true;
                }
            }
            for(String p : pass){
                if(p.equals(passwd)){
                    confirm2 = true;
                 }
            }
            if(confirm1 && confirm2){
                model.put("title", "PHONEBOOK: Calling Card");
                model.put("address", add);
                model.put("company", company);
                model.put("contact", contact);
                model.put("email", email);
                model.put("month", month());
                model.put("date", date());
                model.put("fullname", fullname);
                return new ModelAndView(model, "phonebook.ftl");
            }
            else{
                model.put("message", "Wrong Username or Password");
                model.put("title", "Log-in: Calling Card");
                return new ModelAndView(model, "login-confirm.ftl");
            }
             // located in src/main/resources/spark/template/freemarker
        },  new FreeMarkerEngine());


    get("/signup", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            
            model.put("title", "Sign-up: Calling Card");

            return new ModelAndView(model, "sign-up.ftl"); // located in src/main/resources/spark/template/freemarker
        }, new FreeMarkerEngine());

     post("/signup", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            boolean taken = false;
            uname_signup = req.queryParams("usernamesignup");
            passwd_signup = req.queryParams("passwordsignup");
            for(String u : user){
                if(u.equals(uname_signup)){
                    taken = true;
                }
            }
            if(taken){
                model.put("message", "Not Available! Username is already taken.");
                model.put("title", "Log-in: Calling Card");
            }
            else{
                model.put("message", "Congratulation! You have successfully created an account.");
                model.put("title", "Log-in: Calling Card"); 
                user.add(uname_signup);
                pass.add(passwd_signup);
                }
            return new ModelAndView(model, "sign-up-confirm.ftl"); // located in src/main/resources/spark/template/freemarker
        },  new FreeMarkerEngine());

    get("/view", (req, res) ->{
            Map<String, Object> model = new HashMap<>();
            
            model.put("title", "VIEW: Calling Card");
            model.put("address", add);
            model.put("company", company);
            model.put("contact", contact);
            model.put("email", email);
            model.put("month", month());
            model.put("date", date());
            model.put("fullname", fullname);

            return new ModelAndView(model, "list.ftl");
        },  new FreeMarkerEngine());

    post("/view", (req, res) ->{
            Map<String, Object> model = new HashMap<>();
            
            remove = req.queryParams("remove");
            testifexist();
            if(test){
                delete();
                
                model.put("title", "VIEW: Calling Card");
                model.put("address", add);
                model.put("company", company);
                model.put("contact", contact);
                model.put("email", email);
                model.put("month", month());
                model.put("date", date());
                model.put("fullname", fullname);
                model.put("message", "You have successfully deleted the Card.");  
                test = false;
                return new ModelAndView(model, "list-confirm.ftl");
            }
            else{
                model.put("title", "VIEW: Calling Card");
                model.put("address", add);
                model.put("company", company);
                model.put("contact", contact);
                model.put("email", email);
                model.put("month", month());
                model.put("date", date());
                model.put("fullname", fullname);
                model.put("message", "ERROR! The Card doesn't exist.");
                return new ModelAndView(model, "list-confirm.ftl");
            }
        },  new FreeMarkerEngine());

    get("/delete/:value", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            String remove = req.params(":value");
            testifexist();
             if(test){
                delete();
                model.put("message", "You have successfully deleted the Card.");  
                test = false;
            }
            else{
                model.put("message", "ERROR! The Card doesn't exist.");
            }
            return new ModelAndView(model, "delete.ftl");
        },  new FreeMarkerEngine());

     get("/delete", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
           
            return new ModelAndView(model, "remove.ftl");
        },  new FreeMarkerEngine());

     post("/delete", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            remove = req.queryParams("remove");
            testifexist();
            if(test){
                delete();
                model.put("message", "You have successfully deleted the Card.");
                test = false;
            }
            else{
                model.put("message", "ERROR! The Card doesn't exist.");
            }
            return new ModelAndView(model, "delete.ftl");
        },  new FreeMarkerEngine());

    }

    public static String month(){
        Calendar cal = Calendar.getInstance(    );
        int m = cal.get(Calendar.MONTH);
        String[] months= {"JAN","FEB","MAR","APR","MAY","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
       return months[m];
    }

    public static int date(){
        Calendar cal = Calendar.getInstance();
        int date = cal.get(Calendar.DAY_OF_MONTH);
        return date;
    }
    public static List delete(){
        Map<String, Object> model = new HashMap<>();
        boolean ok = false;
        String found= "";
        for(String i: fullname){
            if(i.equalsIgnoreCase(remove)){
                ok = true;
                found = i;
            }
        }
        if(ok){
            fullname.remove(found);
        }
        return fullname;
    }
    public static boolean testifexist(){
        for(String i: fullname){
            if(i.equalsIgnoreCase(remove)){
                test = true;
            }
        }
        return test;
    }
}
 
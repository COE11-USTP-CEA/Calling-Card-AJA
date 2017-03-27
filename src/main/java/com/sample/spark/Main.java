package com.sample.spark;

import java.util.HashMap;
import java.util.Map;

import com.sample.spark.extend.*;
import com.sample.spark.account.*;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;
import static spark.Spark.*;
import java.util.Calendar;
import java.util.*;

public class Main {

    public static String contact_firstname ="";
    public static String contact_lastname ="";
    public static String comments ="" , c_email="", active="Guest";
    public static boolean log = false;


    public static void main(String[] args) {

        staticFiles.location("/css"); // Static files
        cards card = new cards();
        accounts account = new accounts();
            get("/", (req, res) -> {
                String profile = "#";
                Map<String, Object> model = new HashMap<>();
                if(log){
                    String status = "Log-in";
                    if(log){
                        status = "Log-out";
                        profile = "/profile";
                    }
                    else{
                        active = "Guest";
                        status = "Log-in";
                    }
                    model.put("title", "Phonebook: Calling Card");
                    model.put("cards", card.all());
                    model.put("username",active);
                    model.put("profile",profile);
                    model.put("action", "/");
                    model.put("status", "Log-out");

                    return new ModelAndView(model, "phonebook.ftl"); // located in src/main/resources/spark/template/freemarker
                }
                else{
                    model.put("title", "Home: Calling Card");
                    log = false;
                    return new ModelAndView(model, "home.ftl"); // located in src/main/resources/spark/template/freemarker
                    }
                }, new FreeMarkerEngine());
            post("/", (req, res) -> {
                Map<String, Object> model = new HashMap<>();
                String logout = req.queryParams("logout");
                String status = "Log-in";
                String profile = "#";
                if(logout.equals("true")){
                    if(log){
                        log = false;
                        status = "Log-out";
                        profile = "/profile";
                    }
                    else{
                        log = true;
                        active = "Guest";
                        status = "Log-in";
                    }
                }
                model.put("title", "Home: Calling Card");

                return new ModelAndView(model, "home.ftl"); // located in src/main/resources/spark/template/freemarker
            }, new FreeMarkerEngine());
            get("/phonebook", (req, res) -> {
                Map<String, Object> model = new HashMap<>();
                String status = "Log-in";
                String profile = "#";
                if(log){
                    status = "Log-out";
                    profile = "/profile";
                    }
                else{
                    active = "Guest";
                    status = "Log-in";
                }
                model.put("title", "Phonebook: Calling Card");
                model.put("cards", card.all());
                model.put("username",active);
                model.put("profile", profile);
                model.put("action","/");
                model.put("status", "Log-in");
                return new ModelAndView(model, "phonebook.ftl"); // located in src/main/resources/spark/template/freemarker
            }, new FreeMarkerEngine());
            post("/phonebook", (req, res) -> {
                Map<String, Object> model = new HashMap<>();
                String remove = req.queryParams("remove");
                String status = "Log-in";
                String profile = "#";
                String logout = req.queryParams("logout");
                if(logout.equals("true")){
                    if(log){
                        log = false;
                        status = "Log-out";
                        profile = "/profile";
                    }
                    else{
                        log = true;
                        active = "Guest";
                        status = "Log-in";
                    }
                }
                model.put("title", "Phonebook: Calling Card");
                model.put("cards", card.all());
                model.put("username",active);
                model.put("profile",profile);
                model.put("action","/");
                model.put("status", status);
                

                return new ModelAndView(model, "phonebook.ftl"); // located in src/main/resources/spark/template/freemarker
            }, new FreeMarkerEngine());
            get("/add", (req, res) -> {
                Map<String, Object> model = new HashMap<>();
                if(log){
                    model.put("title", "Add Contact");
                    
                    return new ModelAndView(model, "add.ftl");
                }
                else{
                    model.put("message", "You must be log-in!");
                    model.put("title", "Log-in: Calling Card");
                    return new ModelAndView(model, "login-confirm.ftl");
                }
                }, new FreeMarkerEngine());

            post("/add", (req, res) -> {
                Map<String, Object> model = new HashMap<>();

                String name = req.queryParams("fullname");
                String add = req.queryParams("fulladdress");
                String contact = req.queryParams("contact");
                String company = req.queryParams("company");
                String email = req.queryParams("email");
                String id = card.getSaltString();
                int date = date();
                String month = month();
                info infos = new info(id,name,add,company,contact,email,date,month);
                card.add(infos);

                model.put("title", "UPDATED: Calling Card");
                model.put("cards", card.all());
                model.put("username",active);
                model.put("profile","/profile");
                model.put("action", "/");
                model.put("status", "Log-out");

                return new ModelAndView(model, "phonebook.ftl"); // located in src/main/resources/spark/template/freemarker
            }, new FreeMarkerEngine());

            get("/about", (req, res) -> {
                Map<String, Object> model = new HashMap<>();
                    
                model.put("title", "About us: Calling Card");

                return new ModelAndView(model, "about us.ftl"); // located in src/main/resources/spark/template/freemarker
                }, new FreeMarkerEngine());
            get("/view", (req, res) ->{
                Map<String, Object> model = new HashMap<>();
                
                model.put("title", "VIEW: Calling Card");
                model.put("cards", card.all());

                return new ModelAndView(model, "list.ftl");
            },  new FreeMarkerEngine());

            post("/view", (req, res) ->{
                Map<String, Object> model = new HashMap<>();
                
                String remove = req.queryParams("remove");
                info infos = card.showbyid(remove);
                boolean test = card.testif(remove);
                if(test){
                    card.deletebyid(remove);
                    model.put("title", "VIEW: Calling Card");
                    model.put("cards", card.all());
                    model.put("message", "You have successfully deleted the Card.");  
                    return new ModelAndView(model, "list-confirm.ftl");
                }
                else{
                    model.put("title", "VIEW: Calling Card");
                    model.put("cards", card.all());
                    model.put("message", "ERROR! The Card doesn't exist.");
                    return new ModelAndView(model, "list-confirm.ftl");
                }
            },  new FreeMarkerEngine());

    get("/delete/:id", (req, res) -> {
        Map<String, Object> model = new HashMap<>();
            if(log){
            String remove = req.params(":id");
            info infos = card.showbyid(remove);
            boolean test = card.testif(remove);
                if(test){
                    card.deletebyid(remove);
                    model.put("title", "Success!: Calling Card");
                    model.put("message", "You have successfully deleted the Card."); 
                    model.put("cards", card.all()); 
                }
                else{
                    model.put("title", "OOPS!: Calling Card");
                    model.put("message", "ERROR! The Card doesn't exist.");
                    model.put("cards", card.all());
                }
                return new ModelAndView(model, "list-confirm.ftl");
            }
            else{
                model.put("message", "You must be log-in!");
                model.put("title", "Log-in: Calling Card");
                return new ModelAndView(model, "login-confirm.ftl");
            }
        },  new FreeMarkerEngine());
    get("/view/:id", (req, res) -> {
        Map<String, Object> model = new HashMap<>();
            if(log){
            String edit = req.params(":id");
            boolean test = card.testif(edit);
                if(test){
                    info infos = card.showbyid(edit);
                    model.put("title", "edit card");
                    model.put("card", infos);
                    return new ModelAndView(model, "view.ftl");
                }
                else{
                    model.put("title", "Cards");
                    model.put("cards", card.all());
                    model.put("message", "ERROR! The Card doesn't exist.");
                    return new ModelAndView(model, "list-confirm.ftl");
                }
            }
            else{
                model.put("message", "You must be log-in!");
                model.put("title", "Log-in: Calling Card");
                return new ModelAndView(model, "login-confirm.ftl");
            }
            },  new FreeMarkerEngine());
    get("/edit/:id", (req, res) -> {
        Map<String, Object> model = new HashMap<>();
            if(log){
            String edit = req.params(":id");
            boolean test = card.testif(edit);
                if(test){
                    info infos = card.showbyid(edit);
                    model.put("title", "EDIT!: Calling Card");
                    model.put("card", infos);
                    return new ModelAndView(model, "edit.ftl");
                }
                else{
                    model.put("title", "Cards");
                    model.put("cards", card.all());
                    model.put("message", "ERROR! The Card doesn't exist.");
                    return new ModelAndView(model, "list-confirm.ftl");
                }
            }
            else{
                model.put("message", "You must be log-in!");
                model.put("title", "Log-in: Calling Card");
                return new ModelAndView(model, "login-confirm.ftl");
            }
            },  new FreeMarkerEngine());
    post("/edit", (req, res) -> {
        Map<String, Object> model = new HashMap<>();
            if(log){
                String edit = req.queryParams("id");
                String name = req.queryParams("name");
                String address = req.queryParams("address");
                String companyname = req.queryParams("companyname");
                String contact = req.queryParams("contact");
                String email = req.queryParams("email");
                
                info infos = card.updatebyid(edit,name,address,companyname,contact,email);
                model.put("message", "You have successfully edited the Card.");
                model.put("title", "Success: Calling Card");
                model.put("cards", card.all());
                return new ModelAndView(model, "list-confirm.ftl");
            }
            else{
                model.put("message", "You must be log-in!");
                model.put("title", "Log-in: Calling Card");
                return new ModelAndView(model, "login-confirm.ftl");
            }
        },  new FreeMarkerEngine());
        post("/search", (req, res) -> {
        Map<String, Object> model = new HashMap<>();
            if(log){
                String search = req.queryParams("search");
                
                int counter = card.count(search);
                model.put("message", counter +" Card(s) found.");
                model.put("title", "Search: Calling Card");
                model.put("cards", card.search(search));
                return new ModelAndView(model, "list-confirm.ftl");
            }
            else{
                model.put("message", "You must be log-in!");
                model.put("title", "Log-in: Calling Card");
                return new ModelAndView(model, "login-confirm.ftl");
            }
            },  new FreeMarkerEngine());
        get("/contact", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
    
            model.put("title", "Contact us: Calling Card");
            model.put("first_name", contact_firstname);
            model.put("last_name", contact_lastname);
            model.put("email", c_email);
            model.put("comments", comments);

            return new ModelAndView(model, "contact us.ftl"); // located in src/main/resources/spark/template/freemarker
            }, new FreeMarkerEngine());
        post("/contact", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            contact_firstname= req.queryParams("first_name");
            contact_lastname= req.queryParams("last_name");
            c_email= req.queryParams("email");
            comments= req.queryParams("comments");
                
            model.put("title", "Contact us: Calling Card");
            model.put("first_name", contact_firstname);
            model.put("last_name", contact_lastname);
            model.put("email", c_email);
            model.put("comments", comments);

            return new ModelAndView(model, "feedback.ftl"); // located in src/main/resources/spark/template/freemarker
            }, new FreeMarkerEngine());
        get("/login", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            
            model.put("title", "Log-in: Calling Card");

            return new ModelAndView(model, "login.ftl"); // located in src/main/resources/spark/template/freemarker
        }, new FreeMarkerEngine());

        post("/login", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            String uname = req.queryParams("username");
            String passwd = req.queryParams("password");
            boolean login = account.login(uname, passwd);
            if(login){
                model.put("title", "PHONEBOOK: Calling Card");
                model.put("cards", card.all());
                active = uname;
                model.put("username",active);
                model.put("profile", "/profile");
                model.put("action", "/");
                model.put("status", "Log-out");
                log = true;
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
            String uname_signup = req.queryParams("usernamesignup");
            String passwd_signup = req.queryParams("passwordsignup");
            boolean taken = account.testif(uname_signup);
        
            if(taken){
                model.put("message", "Not Available! Username is already taken.");
                model.put("title", "Log-in: Calling Card");
            }
            else{
                model.put("message", "Congratulation! You have successfully created an account.");
                model.put("title", "Log-in: Calling Card"); 
                credentials credential = new credentials(uname_signup, passwd_signup);
                account.add(credential);
                }
            return new ModelAndView(model, "sign-up-confirm.ftl"); // located in src/main/resources/spark/template/freemarker
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
    protected static String getSaltString() {
        String dummy = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 4) {
            int index = (int) (rnd.nextFloat() * dummy.length());
            salt.append(dummy.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
}
 
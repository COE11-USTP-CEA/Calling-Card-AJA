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

    public static String firstname="", lastname="", middlename="", street="", city="", prov="", tel="", mobile="", email=""; 
           
    public static void main(String[] args) {
         List<String> fullname = new ArrayList<String>();
         List<String> address = new ArrayList<String>();
         List<String> telephone = new ArrayList<String>();
         List<String> mob = new ArrayList<String>();
         List<String> em = new ArrayList<String>();

        
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

            firstname = req.queryParams("firstname");
            lastname = req.queryParams("lastname");
            middlename = req.queryParams("middlename");
            street = req.queryParams("street");
            city = req.queryParams("city");
            prov = req.queryParams("province");
            tel = req.queryParams("telephone");
            mobile = req.queryParams("mobile");
            email = req.queryParams("email");

            fullname.add(firstname+" "+middlename+" "+lastname);
            address.add(street+" "+city+" "+prov);
            telephone.add(tel);
            mob.add(mobile);
            em.add(email);
            em.add("waca");

            model.put("title", "UPDATED: Calling Card");
            model.put("firstname", firstname);
            model.put("lastname", lastname);
            model.put("middlename", middlename);
            model.put("street", street);
            model.put("city", city);
            model.put("province", prov);
            model.put("tel", tel);
            model.put("mobile", mobile);
            model.put("email", email);
            model.put("month", month());
            model.put("date", date());
            model.put("fullname", fullname);

            return new ModelAndView(model, "phonebook.ftl"); // located in src/main/resources/spark/template/freemarker
        }, new FreeMarkerEngine());

    get("/phonebook", (req, res) -> {
            Map<String, Object> model = new HashMap<>();

            model.put("title", "Phonebook: Calling Card");
            model.put("firstname", firstname);
            model.put("lastname", lastname);
            model.put("middlename", middlename);
            model.put("street", street);
            model.put("city", city);
            model.put("province", prov);
            model.put("tel", tel);
            model.put("mobile", mobile);
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

            return new ModelAndView(model, "sign-up.ftl"); // located in src/main/resources/spark/template/freemarker
        }, new FreeMarkerEngine());

     post("/login", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            String uname, passwd;

            uname = req.queryParams("username");
            passwd = req.queryParams("password");
           
            return new ModelAndView(model, "home.ftl"); // located in src/main/resources/spark/template/freemarker
        },  new FreeMarkerEngine());

    get("/view", (req, res) ->{
            Map<String, Object> model = new HashMap<>();
            
            model.put("title", "VIEW: Calling Card");
            model.put("firstname", firstname);
            model.put("lastname", lastname);
            model.put("middlename", middlename);
            model.put("street", street);
            model.put("city", city);
            model.put("province", prov);
            model.put("tel", tel);
            model.put("mobile", mobile);
            model.put("email", email);
            model.put("month", month());
            model.put("date", date());
            model.put("fullname", fullname);

            return new ModelAndView(model, "list.ftl");
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
}
 
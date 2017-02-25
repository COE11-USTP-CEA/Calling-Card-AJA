package com.sample.spark;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;
import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {
        staticFiles.location("/css"); // Static files

        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("title", "Home: Calling Card");
            return new ModelAndView(model, "home.ftl"); // located in src/main/resources/spark/template/freemarker
        }, new FreeMarkerEngine());

        get("/submit", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("title", "Add Contact");
            return new ModelAndView(model, "submit.ftl");
        }, new FreeMarkerEngine());

        post("/submit", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            String firtsname, lastname, middlename, street, city, prov, tel, mobile;
            firtsname = req.queryParams("firtsname");
            lastname = req.queryParams("lastname");
            middlename = req.queryParams("middlename");
            street = req.queryParams("street");
            city = req.queryParams("city");
            prov = req.queryParams("province");
            tel = req.queryParams("telephone");
            mobile = req.queryParams("mobile");

            model.put("firtsname", firtsname);
            model.put("lastname", lastname);
            model.put("middlename", middlename);
            model.put("street", street);
            model.put("city", city);
            model.put("province", prov);
            model.put("tel", tel);
            model.put("mobile", mobile);

            return new ModelAndView(model, "home-updated.ftl"); // located in src/main/resources/spark/template/freemarker
        }, new FreeMarkerEngine());

    }
}
 
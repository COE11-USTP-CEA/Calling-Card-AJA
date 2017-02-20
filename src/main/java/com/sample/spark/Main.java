package com.sample.spark;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;
import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {
        staticFiles.location("/css"); // Static files

        get("/home", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("title", "Calling Card");
            return new ModelAndView(model, "home.ftl"); // located in src/main/resources/spark/template/freemarker
        }, new FreeMarkerEngine());

        get("/about", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("title", "About us");
            model.put("message", "About us!");
            return new ModelAndView(model, "about.ftl"); 
        }, new FreeMarkerEngine());

        get("/page2", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("title", "page2");
            model.put("message", "Page2");
            return new ModelAndView(model, "page2.ftl"); 
        }, new FreeMarkerEngine());

        get("/page3", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("title", "page3");
            model.put("message", "Page3");
            return new ModelAndView(model, "page3.ftl");
        }, new FreeMarkerEngine());

        get("/page4", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("title", "page4");
            model.put("message", "Page4");
            return new ModelAndView(model, "page4.ftl"); 
        }, new FreeMarkerEngine());
    }
}

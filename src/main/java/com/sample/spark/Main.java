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
    }
}
 
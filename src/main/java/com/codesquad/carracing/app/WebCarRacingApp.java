package com.codesquad.carracing.app;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.Map;

import static spark.Spark.*;


public class WebCarRacingApp {
    public static void main(final String[] args) {
        port(8080);

        get("/", (req, res) -> {
            return render(null, "/index.html");
        });

        post("/name", (req, res) -> {
            return "name";
        });

        post("/result", (req, res) -> {
            return "result";
        });
//        get("/index", (req, res) -> {
//            Map<String, Object> model = new HashMap<>();
//            model.put("name", "pobi");
//            return render(model, "/index.html");
//        });
    }

    private static String render(final Map<String, Object> model, final String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }
}

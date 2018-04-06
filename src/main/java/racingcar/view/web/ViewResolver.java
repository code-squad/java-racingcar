package racingcar.view.web;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sangsik.kim
 */
public class ViewResolver {

    public static String render(Map<String, Object> model, String templatePath) {
        return new HandlebarsTemplateEngine().render(new ModelAndView(model, templatePath));
    }

    public static String render(String templatePath) {
        return render(new HashMap<>(), templatePath);
    }
}

package racingcar.domain;

import racingcar.webview.WebView;

import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

public class WebMain {

    public static void main(String[] args) {
        port(8080);

        WebView webView = new WebView();

        get("/", (req, res)->{
            Map<String, Object> model = new HashMap<>();
            return webView.render(model, "/index.html");
        });

        post("/name", (req, res)->{

           return req.attributes();
        });


    }
}

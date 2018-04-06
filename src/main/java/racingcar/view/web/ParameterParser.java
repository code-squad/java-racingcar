package racingcar.view.web;

import spark.Request;
import spark.utils.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author sangsik.kim
 */
public class ParameterParser {

    public static List<String> getNames(Request req) {
        return Arrays.asList(req.queryParams("names").trim().split(","));
    }

    public static Integer getRunCount(Request req) {
        String count = req.queryParams("count");
        if (StringUtils.isEmpty(count)) {
            return 0;
        }
        return Integer.parseInt(count);
    }
}

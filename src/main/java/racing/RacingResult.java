package racing;

import org.apache.commons.lang3.StringUtils;

import java.text.MessageFormat;

public class RacingResult {
    private static final String RESULT_FORMAT = "{0} : {1}";
    private final String name;
    private final int position;

    public RacingResult(String name, int position) {
        checkArguments(name, position);
        this.name = name;
        this.position = position;
    }

    public String getResult() {
        return MessageFormat.format(RESULT_FORMAT, name, StringUtils.repeat('-', position));
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String getMove() {
        return StringUtils.repeat("&nbsp;", position);
    }

    private void checkArguments(String name, int position) {
        if (position < 0) {
            throw new IllegalArgumentException("position should be bigger than 0");
        }
        if (StringUtils.isEmpty(name)) {
            throw new IllegalArgumentException("name is empty");
        }
    }
}

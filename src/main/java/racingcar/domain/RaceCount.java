package racingcar.domain;


import racingcar.constant.Message;

import java.util.regex.Pattern;

import static racingcar.constant.Constant.MAX_RACE_COUNT;
import static racingcar.constant.Constant.MIN_RACE_COUNT;
import static racingcar.constant.Message.NOT_VALID_NULL;
import static racingcar.constant.Message.ERROR_PARSE_INT;
import static racingcar.constant.Message.ERROR_RACE_COUNT_RAGE;

public class RaceCount {
    private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    private final int count;

    public RaceCount(String count) {
        validateRaceCount(count);
        this.count = Integer.parseInt(count);
    }

    private void validateRaceCount(String count) {
        isEmptyCount(count);
        int parseCount = isNumeric(count);
//        validateRaceCountRange(parseCount);
    }


    private void isEmptyCount(String count) {
        if (Common.isEmpty(count)) {
            throw new IllegalArgumentException(NOT_VALID_NULL);
        }
    }

    private int isNumeric(String strNum) {
        if(!pattern.matcher(strNum).matches()) {
            throw new IllegalArgumentException(ERROR_PARSE_INT);
        }
        return Integer.parseInt(strNum);
    }

    private void validateRaceCountRange(int parseCount) {
        if(parseCount < MIN_RACE_COUNT || parseCount > MAX_RACE_COUNT) {
            throw new IllegalArgumentException(ERROR_RACE_COUNT_RAGE);
        }
    }

    public int getRaceCount() {
        return count;
    }

}

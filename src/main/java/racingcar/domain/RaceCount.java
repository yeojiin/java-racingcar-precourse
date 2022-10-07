package racingcar.domain;

import racingcar.constant.Constant;
import racingcar.constant.Message;

import java.util.regex.Pattern;

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
            throw new IllegalArgumentException(Message.NOT_VALID_NULL);
        }
    }

    private int isNumeric(String strNum) {
        if(!pattern.matcher(strNum).matches()) {
            throw new IllegalArgumentException(Message.ERROR_PARSE_INT);
        }
        return Integer.parseInt(strNum);
    }

    private void validateRaceCountRange(int parseCount) {
        if(parseCount < Constant.MIN_RACE_COUNT || parseCount > Constant.MAX_RACE_COUNT) {
            throw new IllegalArgumentException(Message.ERROR_RACE_COUNT_RAGE);
        }
    }

}

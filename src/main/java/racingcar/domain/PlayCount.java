package racingcar.domain;

import racingcar.constant.Message;

public class PlayCount {
    private final int count;

    public PlayCount(String count) {
        validatePlayCount(count);
        this.count = Integer.parseInt(count);
    }

    private void validatePlayCount(String count) {
        isEmptyCount(String count);
    }

    private void isEmptyCount(String count) {
        if (CommonUtils.isNullOrEmptyString(number)) {
            throw new IllegalArgumentException(Message.ERROR_INPUT_NULL_OR_EMPTY);
        }

    }


}

package racingcar.constant;

public class Message {
    public static final String PARTICIPATING_CAR_NAME_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

    public static final String ERROR_PREFIX = "[ERROR] ";
    public static final String NOT_VALID_NULL = ERROR_PREFIX + " 빈 값은 입력할 수 없습니다.";
    public static final String ERROR_CAR_NAME_LENGTH = ERROR_PREFIX + "1 ~ 5자의 이름을 입력해야 합니다.";
}

package racingcar.view;


import camp.nextstep.edu.missionutils.Console;
import racingcar.constant.Message;

public class InputView {

    public static String getParticipatingCarNames() {
        System.out.println(Message.PARTICIPATING_CAR_NAME_INPUT_MESSAGE);
        return Console.readLine();
    }


}

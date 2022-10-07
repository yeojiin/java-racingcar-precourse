package racingcar.controller;

import racingcar.view.InputView;

public class RacingcarController {

    public void ready() {
        generateCars();

    }

    private void generateCars() {
        while(true) {
            String carNames = InputView.getParticipatingCarNames();
        }
    }
}

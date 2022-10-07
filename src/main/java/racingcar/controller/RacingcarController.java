package racingcar.controller;

import racingcar.domain.PlayCount;
import racingcar.domain.RacingGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingcarController {
    private RacingGame racingGame;
    private PlayCount playCount;

    public void ready() {
        generateCars();
        setPalyCount();

    }

    private void generateCars() {
        while(true) {
            try {
                racingGame = new RacingGame(InputView.getParticipatingCarNames());
                break;
            } catch (IllegalArgumentException illegalArgumentException) {
                OutputView.printMessage(illegalArgumentException.getMessage());
            }
        }
    }

    private void setPalyCount() {
        while(true) {
            try {
                playCount = new PlayCount(InputView.getPlayCount());
                break;
            } catch (IllegalArgumentException illegalArgumentException) {
                OutputView.printMessage(illegalArgumentException.getMessage());
            }
        }
    }
}

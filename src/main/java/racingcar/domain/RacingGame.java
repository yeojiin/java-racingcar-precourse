package racingcar.domain;

public class RacingGame {
    private final Cars cars;

    public RacingGame(String carNames) {
        this.cars = Cars.createParticipatingCars(carNames);
    }


}

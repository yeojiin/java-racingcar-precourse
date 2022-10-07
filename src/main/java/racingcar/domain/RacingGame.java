package racingcar.domain;

import static racingcar.constant.Constant.MAX_RACE_COUNT;
import static racingcar.constant.Constant.MIN_RACE_COUNT;

public class RacingGame {
    private final Cars cars;

    public RacingGame(String carNames) {
        this.cars = Cars.createParticipatingCars(carNames);
    }

    public void play(int count) {
        while(count > 0) {
            moveAllCars();
            count--;
        }
    }

    private void moveAllCars() {
        for(Car car : cars.getPlayCars()) {
            moveEachCar(car);
        }
    }

    private void moveEachCar(Car car) {
        car.move(Common.getRandomNumber(MIN_RACE_COUNT, MAX_RACE_COUNT));
    }
}

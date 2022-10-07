package racingcar.domain;

import racingcar.constant.Constant;
import racingcar.constant.Message;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> playCars;


    public Cars (List<Car> participatingCars) {
        this.playCars = participatingCars;
    }

    public List<Car> getPlayCars() {
        return playCars;
    }


    public static Cars createParticipatingCars(String carNames) {
        validateCarNames(carNames);
        String[] cars = carNames.split(Constant.SEPERATOR);
        return new Cars(setParticipatingCars(cars));
    }

    private static void validateCarNames(String carNames) {
        if(Common.isEmpty(carNames)) {
            throw new IllegalArgumentException(Message.NOT_VALID_NULL);
        }
    }

    private static List<Car> setParticipatingCars(String[] carsNames) {
        List<Car> playCars = new ArrayList<>();
        for (String name : carsNames) {
            playCars.add(Car.createCar(name));
        }
        return playCars;
    }


    public int getWinnerScore() {
        int score = 0;
        for(Car car: playCars) {
            score = score < car.getPosition() ? car.getPosition() : score;

        }
        return score;
    }

    public Cars getWinnerCars(int winnerScore) {
        List<Car> winnerCars = new ArrayList<>();
        for(Car car : playCars) {
            if(winnerScore == car.getPosition()) {
                winnerCars.add(car);
            }
        }
        return new Cars(winnerCars);
    }
}

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


    public static Cars createParticipatingCars(String carNames) {
        validateCarNames(carNames);
        String[] cars = carNames.split(Constant.SEPERATOR);
        return new Cars(setParticipatingCars(cars));
    }

    private static void validateCarNames(String carNames) {
        // 분리
        if(carNames == null || carNames == "") {
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


}

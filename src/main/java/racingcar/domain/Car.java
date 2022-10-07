package racingcar.domain;

public class Car {
    private final CarName carName;
    private int position = 0;

    public Car(CarName carName) {
        this.carName = carName;
    }

    public Car(CarName carName, int position) {
        this.carName = carName;
        this.position = position;
    }


    public static Car createCar(String name) {
        return new Car(new CarName(name));
    }
}

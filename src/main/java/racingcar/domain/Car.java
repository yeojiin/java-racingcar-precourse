package racingcar.domain;

import static racingcar.constant.Constant.MOVE_CONDITION;

public class Car {
    private final CarName carName;
    private int position = 0;

    public Car(CarName carName) {
        this.carName = carName;
    }

//    public Car(CarName carName, int position) {
//        this.carName = carName;
//        this.position = position;
//    }


    public static Car createCar(String name) {
        return new Car(new CarName(name));
    }

    public void move(int randomNumber) {
        if(Common.overMoveCondition(randomNumber)) {
            movePosition();
        }
    }

    private void movePosition() {
        position++;
    }
}

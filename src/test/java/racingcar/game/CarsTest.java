package racingcar.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racingcar.constant.Constant;
import racingcar.domain.Cars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarsTest {
    @ParameterizedTest
    @DisplayName("Cars 생성 테스트")
    @CsvSource(value = {"lim=1", "bba,shong=2", "lim,bba,shong=3"}, delimiter = '=')
    void validateCreateParticipatingCarsTest(String testValue, String count) {
        Cars cars = Cars.createParticipatingCars(testValue.split(Constant.EQUAL)[0]);
        assertEquals(cars.getPlayCars().size(), Integer.parseInt(count));
    }
}

package racingcar.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racingcar.constant.Constant;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.RacingGame;
import static racingcar.constant.Constant.COLON;
import static racingcar.constant.Constant.SEPERATOR;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RacingGameTest {
    private RacingGame racingGame;

    @BeforeEach
    void setUp() {
        racingGame = new RacingGame("one,two");
    }

    @ParameterizedTest
    @DisplayName("우승자 선정 테스트")
    @CsvSource(value = {"3,4:two"}, delimiter = ':')
    void validateWinnerNamesTest(String input, String expected) {
        // given
        String[] splitCarNumber = input.split(COLON)[0].split(SEPERATOR);
        List<Car> resultCar = racingGame.getCars().getCarList();

        // when
        for (int i = 0; i < splitCarNumber.length; i++) {
            Car car = resultCar.get(i % resultCar.size());
            car.move(Integer.parseInt(splitCarNumber[i]));
        }
        String result = Cars.getWinnerCarName(racingGame.getWinner());

        // then
        assertEquals(expected, result);
    }
}

package racingcar.domain;

import java.util.List;

public class GameProcess {
    private final List<Cars> processes;

    public GameProcess(List<Cars> cars) {
        this.processes = cars;
    }
}

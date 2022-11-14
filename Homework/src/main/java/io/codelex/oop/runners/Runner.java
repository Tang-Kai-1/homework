package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(6, Integer.MAX_VALUE),
    INTERMEDIATE(4, 6),
    ADVANCED(0, 4);

    private final int minTime;
    private final int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int time) {
        for (Runner runner : Runner.values()) {
            if (time > runner.minTime && time <= runner.maxTime) {
                return runner;
            }
        }
        return null;
    }
}

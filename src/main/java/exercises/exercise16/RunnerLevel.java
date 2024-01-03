package exercises.exercise16;

public enum RunnerLevel {
    BEGINNER(10, 20),
    INTERMEDIATE(21, 40),
    ADVANCED(41, 100);

    private int minNumberOfMinutes;
    private int maxNumberOfMinutes;

    RunnerLevel(int minNumberOfMinutes, int maxNumberOfMinutes) {
        this.minNumberOfMinutes = minNumberOfMinutes;
        this.maxNumberOfMinutes = maxNumberOfMinutes;
    }
}

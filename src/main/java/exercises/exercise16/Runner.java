package exercises.exercise16;

public class Runner {

    public static RunnerLevel getFitnessLevel(int nrOfMinutes) {
        if (nrOfMinutes >= 10 && nrOfMinutes <= 20) {
            return RunnerLevel.BEGINNER;
        } else if (nrOfMinutes >= 21 && nrOfMinutes <= 40) {
            return RunnerLevel.INTERMEDIATE;
        } return RunnerLevel.ADVANCED;
    }
}

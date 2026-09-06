import java.util.PropertyResourceBundle;

public class WorkoutSession {

    private volatile  int steps;

    private volatile int currentHeartRate = 70;
    private volatile int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getCurrentHeartRate() {
        return currentHeartRate;
    }

    public void setCurrentHeartRate(int heartRate) {
        this.currentHeartRate = heartRate;
    }



}


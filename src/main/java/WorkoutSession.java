

public class WorkoutSession {

    private volatile  int steps;

    private volatile int currentHeartRate = 70; // начальное значение

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


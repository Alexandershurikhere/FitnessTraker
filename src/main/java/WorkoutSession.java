

public class WorkoutSession {


    private volatile int currentHeartRate = 70; // начальное значение

    public int getCurrentHeartRate() {
        return currentHeartRate;
    }

    public void setCurrentHeartRate(int heartRate) {
        this.currentHeartRate = heartRate;
    }



}


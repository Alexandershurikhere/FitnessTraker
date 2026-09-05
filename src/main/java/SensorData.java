import java.time.LocalDate;
import java.time.LocalDateTime;

public class SensorData {
    private LocalDateTime date;
    private  int heartRate;
    private int calories;
    private  int steps;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getCalories() {
        return calories;
    }

    public void setCaalories(int calories) {
        this.calories = calories;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }
}

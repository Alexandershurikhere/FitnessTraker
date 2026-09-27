import java.util.*;

public class WorkoutSession {

    private volatile  int steps;
    private List<Integer> heartHistory= Collections.synchronizedList(new ArrayList<>());

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
        heartHistory.add(heartRate);

    }
    public  List<Integer> getHeartRateHistorySnapshot(){
        List<Integer> result=new ArrayList<>();
        synchronized (heartHistory){
            for(Integer element:heartHistory){
                result.add(element);
            }
        }
        return  result;


    }




}


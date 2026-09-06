import java.util.Random;

public class CaloriesSensor implements  Runnable{
    private WorkoutSession workoutSession;
    private volatile  boolean flag=true;

    public CaloriesSensor(WorkoutSession workoutSession) {
        this.workoutSession = workoutSession;

    }
    public void stop(){
        flag=false;
    }


    @Override
    public void run() {
        Random random=new Random();
        while (flag){
            int current = workoutSession.getCalories();
            int heartRate=workoutSession.getCurrentHeartRate();
            if(heartRate>=90){
                int delta=random.nextInt(60)+30;
                int newValue=delta+current;
                workoutSession.setCalories(newValue);
            }
            if(heartRate<90){
                int delta=random.nextInt(50);
                int newValue=delta+current;
                workoutSession.setCalories(newValue);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}

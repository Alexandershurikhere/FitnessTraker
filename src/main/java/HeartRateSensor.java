import java.util.Random;

public class HeartRateSensor implements Runnable{
    private WorkoutSession workoutSession;
    private volatile boolean flag=true;
    public HeartRateSensor(WorkoutSession workoutSession) {
        this.workoutSession = workoutSession;

    }
    public void  stop(){
        flag=false;

    }


    @Override
    public void run() {
        Random random=new Random();

       while (flag){
           int current = workoutSession.getCurrentHeartRate();
           int delta = random.nextInt(11) - 5;
           int newValue = current + delta;
           if(newValue>180){
                newValue -=15;

           }
           if(newValue<60){
               newValue+=15;
           }
           workoutSession.setCurrentHeartRate(newValue);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }

       }
    }


}

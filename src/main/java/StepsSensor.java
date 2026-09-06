import java.util.Random;

public class StepsSensor implements  Runnable{
    private WorkoutSession workoutSession;
    private volatile  boolean flag=true;

    public StepsSensor(WorkoutSession workoutSession) {
        this.workoutSession = workoutSession;

    }
    public void stop(){
        flag=false;
    }


    @Override
    public void run() {
        Random random=new Random();
        while (flag){
            int current = workoutSession.getSteps();
            int delta = random.nextInt(21);
            int newValue = current + delta;
             workoutSession.setSteps(newValue);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}

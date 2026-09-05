public class Main {
    public static void main(String[] args){
        WorkoutSession workoutSession=new WorkoutSession();
        HeartRateSensor heartRateSensor=new HeartRateSensor(workoutSession);
        Thread t1=new Thread(heartRateSensor);
        t1.start();
        for(int i=0;i<10;i++){
            System.out.println(workoutSession.getCurrentHeartRate());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        heartRateSensor.stop();


    }

}

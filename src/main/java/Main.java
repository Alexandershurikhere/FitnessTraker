public class Main {
    public static void main(String[] args) throws InterruptedException {
        WorkoutSession workoutSession=new WorkoutSession();
        Dashboard dashboard=new Dashboard(workoutSession);
        HeartRateSensor heartRateSensor=new HeartRateSensor(workoutSession);
        StepsSensor stepsSensor=new StepsSensor(workoutSession);
        CaloriesSensor caloriesSensor=new CaloriesSensor(workoutSession);

        Thread t1=new Thread(dashboard);
        Thread t2=new Thread(stepsSensor);
        Thread t3=new Thread(heartRateSensor);
        Thread t4=new Thread(caloriesSensor);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        Thread.sleep(15000);
        heartRateSensor.stop();
        caloriesSensor.stop();
        dashboard.stop();
        stepsSensor.stop();
        t1.join();
        t2.join();
        t3.join();
        t4.join();







    }

}

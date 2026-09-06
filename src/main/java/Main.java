public class Main {
    public static void main(String[] args){
        WorkoutSession workoutSession=new WorkoutSession();
        HeartRateSensor heartRateSensor=new HeartRateSensor(workoutSession);
        StepsSensor stepsSensor=new StepsSensor(workoutSession);
        CaloriesSensor caloriesSensor=new CaloriesSensor(workoutSession);


        Thread t1=new Thread(heartRateSensor);
        Thread t2=new Thread(stepsSensor);
        Thread t3=new Thread(caloriesSensor);
        t1.start();
        t2.start();
        t3.start();

        for(int i=0;i<10;i++){
            System.out.println("HeartRate: "+workoutSession.getCurrentHeartRate());
            System.out.println("Steps: "+workoutSession.getSteps());
            System.out.println("Calories: "+ workoutSession.getCalories());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        heartRateSensor.stop();
        stepsSensor.stop();
        caloriesSensor.stop();


    }

}

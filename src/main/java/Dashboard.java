public class Dashboard implements  Runnable {
    private WorkoutSession workoutSession;
    private  volatile boolean flag=true;

    public Dashboard(WorkoutSession workoutSession) {
        this.workoutSession = workoutSession;
    }
    public void stop(){
        flag=false;
    }


    @Override
    public void run() {

        while (flag){
            int heartRate= workoutSession.getCurrentHeartRate();
            int steps= workoutSession.getSteps();
            int calories= workoutSession.getCalories();
            System.out.println("Пульс: "+ heartRate+" | "+"Шаги: "+ steps+" | "+ "Калории: "+ calories);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkoutSession {
    List<SensorData> sensorDataList = Collections.synchronizedList(new ArrayList<>());

    private volatile int currentHeartRate = 70; // начальное значение

    public int getCurrentHeartRate() {
        return currentHeartRate;
    }

    public void setCurrentHeartRate(int heartRate) {
        this.currentHeartRate = heartRate;
    }

    public void  addDate(SensorData data){
        sensorDataList.add(data);

    }
    public List<SensorData> getSnapshot(){
        List<SensorData> result=new ArrayList<>();
       synchronized (sensorDataList){
           for(SensorData s:sensorDataList){
               result.add(s);
           }
       }

        return  result;

    }


}


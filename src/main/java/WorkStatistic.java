import java.util.List;

public class WorkStatistic {

    public double getAvaregeHeartRate(List<Integer> history){
        double average=history.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        return  average;
    }
    public int getMaxHeartRate(List<Integer> history){
        int max=history.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
        return max;
    }
    public int getDangerZone(List<Integer> history){

        int maxHeartRate=160;
        long countDangerZone=history.stream()
                .mapToInt(Integer::intValue)
                .filter(hr->hr> maxHeartRate)
                .count();
        return (int) countDangerZone;

    }
}

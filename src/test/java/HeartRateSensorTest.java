import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeartRateSensorTest {
    @Test
    public void ShouldStayTheNormal(){
        HeartRateSensor sensor = new HeartRateSensor(new WorkoutSession());
        int result = sensor.calculateNewHeartRate(100, 5);
        assertEquals(105, result);

    }
    @Test
    public void ShouldHiger180(){
        HeartRateSensor sensor = new HeartRateSensor(new WorkoutSession());
        int result = sensor.calculateNewHeartRate(178, 5);
        assertEquals(168, result);

    }
    @Test
    public void ShouldLower60(){
        HeartRateSensor sensor = new HeartRateSensor(new WorkoutSession());
        int result = sensor.calculateNewHeartRate(62, -5);
        assertEquals(72, result);

    }

}

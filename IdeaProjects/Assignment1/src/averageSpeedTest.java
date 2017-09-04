import org.junit.Assert;

public class averageSpeedTest {
    @org.junit.Test
    public void milesPerHour() {
        double expectHours = (45/60) + (30/3600);
        double expectResult = averageSpeed.milesPerHour(14, expectHours);
        System.out.print(expectResult);
    }
}
package aufgabe54;

public class TimeClockTest {
    public static void main(String[] args) {
        TimeClock timeClock = new TimeClock();
        timeClock.register(0, 0);
        timeClock.excel(1, 1);
        timeClock.register(1, 5);
        timeClock.excel(2, 5);
        System.out.println(timeClock.totalTimeMin());
    }
}

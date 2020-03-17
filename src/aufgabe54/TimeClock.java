package aufgabe54;

public class TimeClock {
    private int time;
    private boolean registered = false;
    private int[] lastRegistered = {0, 0};
    private int minutesOnClock = 0;

    public boolean register(int hour, int min) {
        if (registered) return false;
        lastRegistered[0] = hour;
        lastRegistered[1] = min;
        registered = true;
        return true;
    }

    public boolean excel(int hour, int min) {
        if (!registered) return false;
        if (hour < lastRegistered[0]) {
            this.minutesOnClock += (hour + 24 - lastRegistered[0]) * 60;
        } else this.minutesOnClock += (hour - lastRegistered[0]) * 60;
        if (min < lastRegistered[1]) {
            this.minutesOnClock += min + 60 - lastRegistered[1];
        } else this.minutesOnClock += min - lastRegistered[1];
        registered = false;
        return true;
    }

    public int totalTimeMin() {
        return minutesOnClock;
    }

    public int totalTimeHour() {
        return minutesOnClock / 60;
    }
}

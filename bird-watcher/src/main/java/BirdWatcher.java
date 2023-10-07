import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay.clone();
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(this.birdsPerDay).anyMatch(i -> i == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        return Arrays.stream(this.birdsPerDay)
                .limit(numberOfDays)
                .sum();
    }

    public int getBusyDays() {
        return (int) Arrays.stream(this.birdsPerDay)
                .filter(i -> i >= 5)
                .count();
    }
}

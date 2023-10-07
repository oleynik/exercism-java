public class CarsAssemble {

    private static final int CARS_PER_HOUR = 221;

    private static final int MINUTES_PER_HOUR = 60;

    public double productionRatePerHour(int speed) {
        return speed * CARS_PER_HOUR * switch (speed) {
            case 1, 2, 3, 4 -> 1.0;
            case 5, 6, 7, 8 -> 0.9;
            case 9 -> 0.8;
            case 10 -> 0.77;
            default -> 0;
        };
    }

    public int workingItemsPerMinute(int speed) {
        return (int) Math.floor(productionRatePerHour(speed) / MINUTES_PER_HOUR);
    }
}

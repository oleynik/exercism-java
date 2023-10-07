public class Lasagna {

    private static final int TO_GET_DONE = 40;
    private static final int PREPARATION_OF_LAYER = 2;

    public int expectedMinutesInOven() {
        return TO_GET_DONE;
    }

    public int remainingMinutesInOven(int hasInOven) {
        return expectedMinutesInOven() - hasInOven;
    }

    public int preparationTimeInMinutes(int layers) {
        return PREPARATION_OF_LAYER * layers;
    }

    public int totalTimeInMinutes(int layers, int hasInOven) {
        return preparationTimeInMinutes(layers) + hasInOven;
    }
}

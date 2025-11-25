public class Lasagna {
    public static final int EXPECTED_MINUTES_IN_OVEN = 40;
    public static final int MINUTES_ONE_LAYER = 2;
    public int expectedMinutesInOven(){
        return EXPECTED_MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int time){
        return expectedMinutesInOven() - time;
    }

    public int preparationTimeInMinutes(int layerCount){
        return MINUTES_ONE_LAYER*layerCount;
    }

    public int totalTimeInMinutes(int layerCount, int time){
        return preparationTimeInMinutes(layerCount) + time;
    }
}

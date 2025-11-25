public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method

    // TODO: define the 'remainingMinutesInOven()' method

    // TODO: define the 'preparationTimeInMinutes()' method

    // TODO: define the 'totalTimeInMinutes()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int time){
        return expectedMinutesInOven() - time;
    }

    public int preparationTimeInMinutes(int layerCount){
        return 2*layerCount;
    }

    public int totalTimeInMinutes(int layerCount, int time){
        return preparationTimeInMinutes(layerCount) + time;
    }
}

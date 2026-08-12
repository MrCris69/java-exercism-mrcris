public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int x){
        return expectedMinutesInOven()-x;
    }

    public int preparationTimeInMinutes(int capas){
        return 2*capas;
    }

    public int totalTimeInMinutes(int capas,int tiempo){
        return tiempo+preparationTimeInMinutes(capas);
    }
}

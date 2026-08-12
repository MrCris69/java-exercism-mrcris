public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double ratePerHour;
        double successRate=1.0;
        if(speed>=5 && speed<=8){
            successRate=0.9;
        }
        else if(speed==9){
            successRate=0.8;
        }
        else if(speed==10){
            successRate=0.77;
        }
        ratePerHour= speed*221*successRate;
        return ratePerHour;
    }

    public int workingItemsPerMinute(int speed) {
         int itemsPerMinute= (int)(productionRatePerHour(speed)/60);
        return itemsPerMinute;
    }
}

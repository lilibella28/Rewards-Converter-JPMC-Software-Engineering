public class RewardValue {
    private double cash;
    private int miles;
    private static double cashRate = 0.0035;
    public RewardValue(double cash){
        this.cash= cash;

    }
    public RewardValue(int miles){
        this.cash = convertToCash(miles);
    }
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / cashRate);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * cashRate;
    }


    public double getCashValue(){
        return cash;


    }
     public int getMilesValue(){
        return convertToMiles(this.cash);
     }

}

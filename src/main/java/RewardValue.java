public class RewardValue {
    private double cash;
    private int miles;
    private double cashRate = 0.0035;
    public RewardValue(double cash){
        this.cash= cash;
        this.miles = (int) (cash / cashRate);
    }
    public RewardValue(int miles){
        this.miles = miles;
        this.cash = miles * cashRate;
    }

    public double getCashValue(){
        return this.cash;


    }
     public int getMilesValue(){
        return this.miles;
     }

}

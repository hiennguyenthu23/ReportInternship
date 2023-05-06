package ex2;
public class VISACard {
    protected String type;
    protected double amount;
    private int rewardPercentage;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getRewardPercentage() {
        return rewardPercentage;
    }

    public void setRewardPercentage(int rewardPercentage) {
        this.rewardPercentage = rewardPercentage;
    }

    public Double computeRewardPoints(String type, Double amount) {

        //fill code here

        return amount *0.01;
    }


}

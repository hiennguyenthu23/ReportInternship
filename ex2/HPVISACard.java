package ex2;

class HPVISACard extends VISACard {
    public Double computeRewardPoints(String type, Double amount) {

        //fill code here
        // int rewardPoints = (int) (this.getAmount()*((3/100) + 10));
        double rewardpoints = super.computeRewardPoints(type, amount);
        if (type.equalsIgnoreCase("Fuel")) {
            rewardpoints = rewardpoints + 10;

        }
        return rewardpoints;
    }
}


package Current;

public class SavingsAccount extends Account implements MaintainanceCharge {
    public SavingsAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    public double computeMaintainanceCharge(int noOfYears) {
        return (2 * 50 * noOfYears) + 50;
    }
}

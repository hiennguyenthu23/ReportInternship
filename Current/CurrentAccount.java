package Current;

public class CurrentAccount extends Account implements MaintainanceCharge {
    public CurrentAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    public double computeMaintainanceCharge(int noOfYears) {
        return (100 * noOfYears) + 200;
    }
}


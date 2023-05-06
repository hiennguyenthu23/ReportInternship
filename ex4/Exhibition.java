package ex4;

import java.text.DecimalFormat;

public class Exhibition  extends Event {
    DecimalFormat dc = new DecimalFormat("0.00");

    private Integer noOfStalls;
    private Double rentPerStall;
    public Exhibition(String name, String detail, String type, String organiser, int noOfStalls, double rentPerStall) {
        super(name, detail, type, organiser);
        this.noOfStalls = noOfStalls;
        this.rentPerStall = rentPerStall;
    }

    //Fill your code here

    Double calculateAmount() {
        //Fill your code here
        double total = noOfStalls * rentPerStall;
        return total;
    }
    @Override
    public String toString() {
        return "Stage Event Details\nEvent Name:" + name + "\nDetail:"+ detail+ "Type:"+ type+ "\nOrganiser Name:" + organiser + "\nTotal Cost" + dc.format(calculateAmount());
    }

}

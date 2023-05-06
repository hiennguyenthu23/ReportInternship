package ex3;

import java.text.DecimalFormat;

class Exhibition extends Event {
    DecimalFormat dc = new DecimalFormat("0.0");

    private static Integer gst = 5;
    private Integer noOfStalls;

    public static Integer getGst() {
        return gst;
    }

    public static void setGst(Integer gst) {
        Exhibition.gst = gst;
    }

    public Integer getNoOfStalls() {
        return noOfStalls;
    }

    public void setNoOfStalls(Integer noOfStalls) {
        this.noOfStalls = noOfStalls;
    }

    public Exhibition(String name, String type, Double costPerDay, Integer noOfDays, Integer noOfStalls) {
        super(name, type, costPerDay, noOfDays);
        this.noOfStalls = noOfStalls;
    }

    //Fill your code here

    public Double totalCost() {

        //Fill your code here
        double totalAmount = (costPerDay * noOfDays);
        double gstAmount = (totalAmount * gst) / 100;
        double total = (totalAmount + gstAmount);
        return total;
    }

    @Override
    public String toString() {
        //Fill your code here
        return "Event Details\nName:" + name + "\nType:Exhibition\nNumber of stalls:" +
                noOfStalls +"\nTotal amount:" + dc.format(totalCost());

    }
}

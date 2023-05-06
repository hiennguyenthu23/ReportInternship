package ex3;

import java.text.DecimalFormat;

class StageEvent extends Event{
    DecimalFormat dc = new DecimalFormat("0.00");
    private static Integer gst = 15;
    private Integer noOfSeats;

    public static Integer getGst() {
        return gst;
    }

    public static void setGst(Integer gst) {
        StageEvent.gst = gst;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public StageEvent(String name, String type, Double costPerDay, Integer noOfDays, Integer noOfSeats) {
        super(name, type, costPerDay, noOfDays);
            this.noOfSeats = noOfSeats;
    }

    //Fill your code here

    public Double totalCost() {

        //Fill your code here
        double totalAmount = (costPerDay * noOfDays);
        double gstAmount = (totalAmount*gst)/100;
        double total = (totalAmount+gstAmount);
        return total;
    }
    @Override
    public String toString() {
        //Fill your code here

        return "Event Details\nName:" + name + "\nType:Stage Event\nNumber of seats:" + noOfSeats + "\nTotal amount" + dc.format(totalCost());
    }
}

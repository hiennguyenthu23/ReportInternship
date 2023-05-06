
package ex4;

import java.text.DecimalFormat;

public class StageEvent extends Event {
    DecimalFormat dc = new DecimalFormat("0.00");
    //Fill your code here
    private Integer noOfShows;
    private Double costPerShow;

    public StageEvent(String name, String detail, String type, String organiser, int noOfShows, double costPerShow) {
        super(name, detail, type, organiser);
        this.noOfShows = noOfShows;
        this.costPerShow = costPerShow;
    }

    Double calculateAmount() {

        //Fill your code here
        double total = noOfShows * costPerShow;
        return total;
    }

     @Override
     public String toString() {
          return "Exhibition Details\nEvent Name:" + name + "\nDetail:"+ detail+ "Type:"+ type+ "\nOrganiser Name:" + organiser + "\nTotal Cost" + dc.format(calculateAmount());
     }
}

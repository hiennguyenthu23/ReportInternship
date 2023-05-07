package Ex2;

public class PublicAircraft extends Aircraft {
    private Boolean checkinbeforetwohours;
    private int noOfKgsallowed;
    private float additionalFeeperkg;

    public PublicAircraft(String aircraftName, String source, String destination,
                          Boolean checkinbeforetwohours, int noOfKgsallowed, float additionalFeeperkg) {
        super(aircraftName, source, destination);
        this.checkinbeforetwohours = checkinbeforetwohours;
        this.noOfKgsallowed = noOfKgsallowed;
        this.additionalFeeperkg = additionalFeeperkg;
    }

    public void displayDetails() {
        System.out.println("Public Aircraft :");
        super.displayDetails();
        System.out.println("Flight check in before two hours : " + checkinbeforetwohours);
        System.out.println("Number of kgs allowed per person : " + noOfKgsallowed);
        System.out.println("Additional fee charged for extra baggage per Kg : " + additionalFeeperkg);
    }

    // Getters and Setters
    public Boolean getCheckinbeforetwohours() {
        return checkinbeforetwohours;
    }

    public void setCheckinbeforetwohours(Boolean checkinbeforetwohours) {
        this.checkinbeforetwohours = checkinbeforetwohours;
    }

    public int getNoOfKgsallowed() {
        return noOfKgsallowed;
    }

    public void setNoOfKgsallowed(int noOfKgsallowed) {
        this.noOfKgsallowed = noOfKgsallowed;
    }

    public float getAdditionalFeeperkg() {
        return additionalFeeperkg;
    }

    public void setAdditionalFeeperkg(float additionalFeeperkg) {
        this.additionalFeeperkg = additionalFeeperkg;
    }
}
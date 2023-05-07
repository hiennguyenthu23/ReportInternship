package Ex2;


public class PrivateAircraft extends Aircraft {
    private Boolean checkinbeforetwohours;
    private String pilotPreference;
    private String purpose;

    public PrivateAircraft(String aircraftName, String source, String destination,
                           Boolean checkinbeforetwohours, String pilotPreference, String purpose) {
        super(aircraftName, source, destination);
        this.checkinbeforetwohours = checkinbeforetwohours;
        this.pilotPreference = pilotPreference;
        this.purpose = purpose;
    }

    public void displayDetails() {
        System.out.println("Private Aircraft :");
        super.displayDetails();
        System.out.println("Flight check in before two hours : " + checkinbeforetwohours);
        System.out.println("Pilot chose : " + pilotPreference);
    }
}


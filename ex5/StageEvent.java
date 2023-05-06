package ex5;

class StageEvent extends Event{


    //your code here
    private Integer noOfShows;
    private Integer noOfSeatsPerShow;
    public StageEvent(String name, String detail, String ownerName, Integer noOfShows,Integer noOfSeatsPerShow) {
        super(name, detail, ownerName);
        // TODO Auto-generated constructor stub
        this.noOfShows = noOfShows;
        this.noOfSeatsPerShow = noOfSeatsPerShow;
    }


    public Integer getNoOfShows() {
        return noOfShows;
    }


    public void setNoOfShows(Integer noOfShows) {
        this.noOfShows = noOfShows;
    }


    public Integer getNoOfSeatsPerShow() {
        return noOfSeatsPerShow;
    }


    public void setNoOfSeatsPerShow(Integer noOfSeatsPerShow) {
        this.noOfSeatsPerShow = noOfSeatsPerShow;
    }


    @Override
    public Double projectedRevenue() {
        // TODO Auto-generated method stub
        return (double) (getNoOfShows()*getNoOfSeatsPerShow()*50);
    }
}
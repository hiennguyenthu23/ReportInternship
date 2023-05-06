package ex5;


class Exhibition extends Event{
    //Your code here
    private Integer noOfStalls;
    public Exhibition(String name, String detail,
                      String ownerName, Integer noOfStalls) {
        super(name, detail, ownerName);
        // TODO Auto-generated constructor stub
        this.noOfStalls = noOfStalls;
    }
    public Integer getNoOfStalls() {
        return noOfStalls;
    }
    public void setNoOfStalls(Integer noOfStalls) {
        this.noOfStalls = noOfStalls;
    }
    @Override
    public Double projectedRevenue() {
        // TODO Auto-generated method stub
        return (double) (getNoOfStalls()*10000);
    }
}

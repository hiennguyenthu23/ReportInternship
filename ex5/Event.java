package ex5;

abstract class Event{
    //Fill your code here
    protected String name;
    protected String detail;
    protected String ownerName;
    public Event(String name, String detail, String ownerName) {
        super();
        this.name = name;
        this.detail = detail;
        this.ownerName = ownerName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public abstract Double projectedRevenue() ;
}

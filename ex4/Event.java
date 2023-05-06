package ex4;

public abstract class Event {
    //Fill your code here
    protected String name;
    protected String detail;
    protected String type;
    protected String organiser;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrganiser() {
        return organiser;
    }

    public void setOrganiser(String organiser) {
        this.organiser = organiser;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Event(String name, String detail, String type, String organiser) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organiser = organiser;
    }

    abstract Double calculateAmount();

}

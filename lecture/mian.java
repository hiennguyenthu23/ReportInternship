
package lecture;

public class mian {
    public static void main(String args[]) {

// TODO Auto-generated method stub

//Abstract class object cannot be created

//DemoAbstract da1 = new DemoAbstract();

        rectangle re = new rectangle();

        re.setHeight(10);

        re.setLenght(23);

        re.setWidth(12);

        System.out.println("Perimeter: " + re.peri(re.getLenght(), re.getWidth()));
        System.out.println("Area: " + re.area(re.getLenght(), re.getWidth()));

    }
}
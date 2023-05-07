package exercise_3;

import javax.sound.midi.Soundbank;

public class Rectangle {

    //Fill your code
    private int lenght;
   private int width;
   public Rectangle(int lenght, int width) {
       super();
       this.lenght = lenght;
       this.width = width;
   }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Integer area() {

        //Fill your code

        return (getLenght()*getWidth());

    }
    public void display(){

        //Fill your code
        System.out.println("Rectangle Dimension");
        System.out.println("Length:" + getLenght());
        System.out.println("Width:" + getWidth());

    }

    Rectangle dimensionChange(int d){

        // Rectangle rectangleObject = null;
        //Fill your code
        lenght = d*getLenght();
        setLenght(lenght);
        width = d*getWidth();
        setWidth(width);
        return new Rectangle(lenght,width);
    }


}

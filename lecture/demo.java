package lecture;

public abstract class demo {

    int lenght;

    int width;

    int height;

//concrete methods---may not override

    public demo() {

    }

    public demo(int lenght, int width, int height) {

        super();

        this.lenght = lenght;
        this.width = width;

        this.height = height;

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

    public int getHeight() {

        return height;

    }

    public void setHeight(int height) {

        this.height = height;

    }

//abstract methods--must be implemented or overridden

    abstract int peri(int length, int width);

    abstract int area(int length, int width);

    abstract int volume(int length, int width, int height);
}

package tut4;

class Students extends Person {

    String course;

    String nameOfSchool;

    public String getCourse() {

        return course;

    }

    public void setCourse(String course) {
        this.course = course;

    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;

    }

    public Students() {

        super();

    }

    public Students(String name, int age, String gender) {

        super(name, age, gender);

    }

//method overriding---runtime polymorphism

    /* public void display(String name) {

        super.display(name);

        System.out.println("Course: " + this.getCourse());

        System.out.println("School: " + this.getNameOfSchool());

    }

    public void display(String name) {

        super.display(this.getName());

        System.out.println("Course: " + this.getCourse());

    }
*/
}


public class Student {
    // Member variable
    String name;
    String address;
    int age;

    // properties of Constructor:
    // No return type
    // same as class name

    // default constructor
    public Student() {
        System.out.println("Hello there");
    }

    // parameterize constructor
    public Student(String address) {
        this.address = address;
    }

    // Methods/ functions
    public void printDetails() {
        System.out.printf("%s %s %d", name, address, age);
    }

    public String getStudentName(){
        return name;
    }

    public int getStudentAge() {
        return age;
    }

    public void setStudentName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }



    /**
     * consumed/give some
     */
}

public class Employee {
    String name;
    int salary;
    String designation;

    public void printDetails() {
        System.out.printf("%s %d %s", name, salary, designation);
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

}

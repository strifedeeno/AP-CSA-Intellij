package Project5_04;

public class Teacher {
    private String name;
    private int employeeID;
    private double salary;

    //constructor set name to "John Doe", id to 0, and salary to 0.0.
    public Teacher() {
        name = "John Doe";
        employeeID = 0;
        salary = 0.0;
    }

    //constructor
    public Teacher(String n, int id, double sal) {
        name = n;
        employeeID = id;
        salary = sal;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String n) {
        name = n;
    }

    public void setID(int id) {
        employeeID = id;
    }

    public void setSalary(double sal) {
        salary = sal;
    }

    //raise the salary by x%
    public void raiseSalaryByPercent(double x) {
        salary = salary + salary * x / 100;
    }

    //return a string with format:
    //      name:ID:salary
    public String toString() {
        return name + ":" + employeeID + ":" + salary;
    }
}

package sort;

import java.util.Comparator;

public class Employee {

    private int id;
    private double salary;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int compareTo(Employee o) {
//        return (int) (this.salary - o.salary);
//    }

    public String toString(){
        return "[Emp Name: "+name+", Emp id: "+id+", Salary: "+salary+"]";
    }

    public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
        public int compare(Employee o1, Employee o2) {
            return (int)(o1.getSalary()-o2.getSalary());
        }
    };



}

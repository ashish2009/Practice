package newPack.comp;

public class Employee implements Comparable<Employee>{

    private int id;
    private double salary;
    private String name;

    Employee(int id,double salary,String name){
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "[Emp Name: "+name+", Emp id: "+id+", Salary: "+salary+"]";
    }


    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }
}

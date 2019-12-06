package sort;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        return (int)(o1.getSalary()-o2.getSalary());
    }
}

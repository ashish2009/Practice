package sort;

import java.util.Arrays;

public class DriverMethod {

    public static void main(String...args){
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Ashish");
        e1.setSalary(30000);

        Employee e2 = new Employee();
        e2.setId(2);
        e2.setName("Kumar");
        e2.setSalary(20000);

        Employee[] employees = new Employee[]{e2,e1};
        Arrays.sort(employees,new EmployeeComparator());
//        Arrays.sort(employees,Employee.salaryComparator);
        System.out.println(Arrays.asList(employees).toString());
    }
}

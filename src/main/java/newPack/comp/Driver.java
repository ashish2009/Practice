package newPack.comp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Driver {

    public static void main(String[] args){
        int[] arr = {9,5,6,2,3};
        String[] array = {"G","D","E","A"};

        Arrays.sort(arr);
        Arrays.sort(array);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));

        ArrayList<String> strList = new ArrayList<>();
        strList.add("G");
        strList.add("D");
        strList.add("D");
        strList.add("A");

        Collections.sort(strList);
        System.out.println(strList.toString());

        Employee[] employees = new Employee[4];
        employees[0] = new Employee(1,2000,"G");
        employees[1] = new Employee(2,5000,"D");
        employees[2] = new Employee(3,11000,"E");
        employees[3] = new Employee(4,7000,"A");

        Comparator<Employee> salaryComparator = (e1,e2)-> (int)(e1.getSalary() - e2.getSalary());
        Comparator<Employee> nameComparator = (e1,e2)->(int)(e1.getName().compareTo(e2.getName()));

        Collections.sort(Arrays.asList(employees),salaryComparator);

        System.out.println(Arrays.toString(employees));

        Collections.sort(Arrays.asList(employees),nameComparator);

        System.out.println(Arrays.toString(employees));

        System.out.println("=================================");
//        Collections.sort(Arrays.asList(employees));
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));
    }
}

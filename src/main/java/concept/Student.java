package concept;

import java.io.Serializable;

public class Student implements Serializable {

    private int rollNo;
    private String name;
    private String std;

    public Student(int rollNo,String name,String std){
        this.rollNo = rollNo;
        this.name = name;
        this.std = std;
    }

}

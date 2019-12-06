package concept;

import java.io.*;

public class StudentImpl {

    public static void main(String[] args){
        try {
            Student s = new Student(10,"Ashish","12th");
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/ashishkumar/Documents/QuikrAutomation/CucumeberProject/src/main/java/concept/StudentInfo");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s.toString());
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

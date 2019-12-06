package Multithreading_1.assignment;

public class RelayRacerDemo {

    public  static Thread firstOfGroup1;
    public  static Thread secondOfGroup1;

    public  static Thread firstOfGroup2;
    public  static Thread secondOfGroup2;

    public  static Thread firstOfGroup3;
    public  static Thread secondOfGroup3;

    public  static Thread firstOfGroup4;
    public  static Thread secondOfGroup4;

    public  static Thread firstOfGroup5;
    public  static Thread secondOfGroup5;

    public static void main(String[] args) {
        RelayRacer racer = new RelayRacer();
        ThreadGroup group1 = new ThreadGroup("group1");
        ThreadGroup group2 = new ThreadGroup("group2");
        ThreadGroup group3 = new ThreadGroup("group3");
        ThreadGroup group4 = new ThreadGroup("group4");
        ThreadGroup group5 = new ThreadGroup("group5");

        firstOfGroup1 = new Thread(group1,racer,"firstOfGroup1");
        secondOfGroup1 = new Thread(group1,racer,"secondOfGroup1");

        firstOfGroup2 = new Thread(group2,racer,"firstOfGroup2");
        secondOfGroup2 = new Thread(group2,racer,"secondOfGroup2");

        firstOfGroup3 = new Thread(group3,racer,"firstOfGroup3");
        secondOfGroup3 = new Thread(group3,racer,"secondOfGroup3");

        firstOfGroup4 = new Thread(group4,racer,"firstOfGroup4");
        secondOfGroup4 = new Thread(group4,racer,"secondOfGroup4");

        firstOfGroup5 = new Thread(group5,racer,"firstOfGroup5");
        secondOfGroup5 = new Thread(group5,racer,"secondOfGroup5");

        firstOfGroup1.start();
        firstOfGroup2.start();
        firstOfGroup3.start();
        firstOfGroup4.start();
        firstOfGroup5.start();
    }
}

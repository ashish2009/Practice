package Multithreading_1;

import static java.lang.Thread.*;
public class JoinDemo {

    public static Thread firstThread;
    public static Thread secondThread;

    public static void main(String[] args) {
        JoinThreads joinThreads = new JoinThreads();
        firstThread = new Thread(joinThreads,"First Thread");
        secondThread = new Thread(joinThreads,"Second Thread");

        firstThread.start();

        while (true){
            State firstThreadStatus = firstThread.getState();
            State secondThreadStatus = secondThread.getState();
            System.out.println("First Thread is in "+firstThreadStatus);
            System.out.println("Second Thread is in "+secondThreadStatus);

            if(firstThreadStatus.equals(State.TERMINATED) && secondThreadStatus.equals(State.TERMINATED)){
                break;
            }
        }
    }
}

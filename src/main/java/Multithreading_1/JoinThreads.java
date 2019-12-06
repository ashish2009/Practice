package Multithreading_1;

public class JoinThreads implements Runnable {
    @Override
    public void run() {
        System.out.println("Begining Thread "+Thread.currentThread().getName());

        if(Thread.currentThread().getName().equals("First Thread")){
            System.out.println(System.nanoTime()+" inside join condition");
            JoinDemo.secondThread.start();
            try {
                JoinDemo.secondThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

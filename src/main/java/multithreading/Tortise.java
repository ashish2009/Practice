package multithreading;

public class Tortise implements Runnable {

    public void run() {
        for(int i = 0;i<=500;i++){
            if(i==500) System.out.println("Tortise Won");
            System.out.println("Tortise covered "+i+"m");
        }
    }
}

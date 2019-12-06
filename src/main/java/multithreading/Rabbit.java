package multithreading;

public class Rabbit implements Runnable {

    public void run() {
        int i;
        for(i=1;i<=500;i++){
            try{
                if(i==250) Thread.sleep(1000);
            }catch (Exception e){

            }

            if(i==500) System.out.println("Rabbit Won");
            System.out.println("Rabbit covered "+i+"m");
        }

    }
}

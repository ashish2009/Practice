package Multithreading_1;

public class Racer implements Runnable{

    public static String winner;

    public void race(){
        for(int distance = 1;distance<101;distance++){
            System.out.println("Distance covered by "+Thread.currentThread().getName()+" is "+distance+"m");
            if(Thread.currentThread().getName().equals("Tortoise") && distance == 30){
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            boolean isRaceWon = this.isRaceWon(distance);
            if(isRaceWon){
                break;
            }
        }
    }

    private boolean isRaceWon(int distanceCovered){
        boolean isRaceWon = false;

        if((Racer.winner == null) && (distanceCovered == 100)){
            String winnerName = Thread.currentThread().getName();
            Racer.winner = winnerName;
            System.out.println("Winner is "+ Racer.winner);
            isRaceWon = true;
        }else if(Racer.winner == null){
            isRaceWon = false;
        }else if(Racer.winner != null){
            isRaceWon = true;
        }

        return isRaceWon;
    }

    @Override
    public void run() {
        this.race();
    }
}

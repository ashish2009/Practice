package Multithreading_1.assignment;


public class RelayRacer implements Runnable {
    public static String winner;

    public void race(){
        for(int distance = 1;distance<401;distance++){
            System.out.println("Distance covered by "+Thread.currentThread().getName()+" is "+distance+"m");

                try {
                    if(Thread.currentThread().getName().equals("firstOfGroup1") && distance == 200){
                        RelayRacerDemo.secondOfGroup1.start();
                        RelayRacerDemo.secondOfGroup1.join();
                    }

                    if(Thread.currentThread().getName().equals("firstOfGroup2") && distance == 200){
                        RelayRacerDemo.secondOfGroup2.start();
                        RelayRacerDemo.secondOfGroup2.join();
                    }

                    if(Thread.currentThread().getName().equals("firstOfGroup3") && distance == 200){
                        RelayRacerDemo.secondOfGroup3.start();
                        RelayRacerDemo.secondOfGroup3.join();
                    }

                    if(Thread.currentThread().getName().equals("firstOfGroup4") && distance == 200){
                        RelayRacerDemo.secondOfGroup4.start();
                        RelayRacerDemo.secondOfGroup4.join();
                    }

                    if(Thread.currentThread().getName().equals("firstOfGroup5") && distance == 200){
                        RelayRacerDemo.secondOfGroup5.start();
                        RelayRacerDemo.secondOfGroup5.join();
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            boolean isRaceWon = this.isRaceWon(distance);
            if(isRaceWon){
                break;
            }
        }
    }

    private boolean isRaceWon(int distanceCovered){
        boolean isRaceWon = false;

        if((RelayRacer.winner == null) && (distanceCovered == 400)){
            String winnerName = Thread.currentThread().getThreadGroup().getName();
            RelayRacer.winner = winnerName;
            System.out.println("Winner is "+ RelayRacer.winner);
            isRaceWon = true;
        }else if(RelayRacer.winner == null){
            isRaceWon = false;
        }else if(RelayRacer.winner != null){
            isRaceWon = true;
        }

        return isRaceWon;
    }

    @Override
    public void run() {
        this.race();
    }
}

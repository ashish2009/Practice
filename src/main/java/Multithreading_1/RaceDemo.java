package Multithreading_1;

public class RaceDemo {

    public static void main(String[] args) {
        Racer racer = new Racer();

        Thread tortoise = new Thread(racer,"Tortoise");
        Thread rabbit = new Thread(racer,"rabbit");

        tortoise.start();
        rabbit.start();
    }
}

package multithreading;

public class Race {

    public static void main(String[] args){
        Rabbit rabbit = new Rabbit();
        Tortise tortise = new Tortise();
        Thread r = new Thread(rabbit);
        Thread t = new Thread(tortise);
        r.start();
        t.start();
    }

}

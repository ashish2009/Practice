package generics;

public class Guest {

    public static void main(String[] args){
        Bartender bartender = new Bartender();
        bartender.mix(new Juice(),new Water());
    }
}

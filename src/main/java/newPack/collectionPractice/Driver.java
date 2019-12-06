package newPack.collectionPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Driver {

    public static void main(String[] args) {
        ArrayList<Car> list = new ArrayList<>();

        for(int i=0;i<5;i++){
            list.add(new Car("H"+i));
        }



        list.add(3,new Car("H7"));
        System.out.println(list.toString());

        System.out.println(list.contains(new Car("H7")));


    }
}

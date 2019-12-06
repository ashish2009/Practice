package newPack.collectionPractice;

import java.util.ArrayList;

public class SyncColl {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list.size());
        list.add(2,5);
        System.out.println(list.size());
    }
}

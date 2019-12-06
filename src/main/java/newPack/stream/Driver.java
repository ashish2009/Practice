package newPack.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

    static Comparator<String> comparator = (s1,s2)-> (int)(s1.compareTo(s2));


    public static void main(String[] args){
        List<String>  list = new ArrayList<>();
        list.add("G");
        list.add("E");
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("G");

        Stream<String> stringStream = list.stream();

        System.out.println(stringStream.min(comparator).toString());
//        long c = stringStream.distinct().count();
//        List<String> list1 = stringStream.distinct().collect(Collectors.toList());
//        System.out.println(c);
//        System.out.println(list1.toString());
    }
}

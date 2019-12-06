package newPack;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Stream;

public class Assignment {

    public static void main(String[] args){
        LinkedHashMap<String,String> hashMap = new LinkedHashMap<>();
        hashMap.put("JEE","Your application has been accepted and your registration number is 093467 and your hall ticket number is BNG32016");
        hashMap.put("VIT","Application number 9823019348 has been accepted. 0955693 is your hall ticket number.");
        hashMap.put("NEET","Hall ticket is generated with number 39458 for the application AB123XZ");

        for(String s:hashMap.keySet()){
            Stream<String> stringStream;
            String[] s1 = hashMap.get(s).split("[Aa]pplication");
            if(s1[0].startsWith("Application")){
                stringStream = Arrays.asList(s1[0].split(" ")).stream();
            }else {
                stringStream = Stream.concat(Arrays.asList(s1[1].split(" ")).stream(),
                        Arrays.asList(s1[0].split(" ")).stream());

            }

            Stream<String> stringStream1 = stringStream.filter(value->value.matches(".*\\d.*"));
            Object[] strings = stringStream1.toArray();
            System.out.println(s+"======>"+Arrays.toString(strings));

        }
    }
}

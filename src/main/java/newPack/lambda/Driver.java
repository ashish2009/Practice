package newPack.lambda;

public class Driver {

    public static void main(String[] args){
        MyFunctionalInterface1 functionalInterface1 = ()-> System.out.println("Hi Lambda");
        functionalInterface1.apply();

        MyFunctionalInterface2 functionalInterface2 = s-> "Hi "+s;

        String value = functionalInterface2.apply("Ashish");
        System.out.println(value);

        MyFunctionalInterface3 functionalInterface3 = (s1, s2) -> System.out.println(s1+"  "+s2);
        functionalInterface3.apply("Ashish","Kumar");
    }




}

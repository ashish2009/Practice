package newPack.lambda;

public class DriverClass {

    /*
       To use local variable in lambda expression,it has to be final or effectively final.
        Static and instance variable has no restriction,it can be changed
     */

    static String var1 = "Hello";

    public static void main(String[] args){
        String var = "Hi";
        MyInterface myInterface = (text)->System.out.println(var1+" "+text);
        myInterface.printIt("Ashish");
        var1 = "HaHa";
        myInterface.printIt("Ashish");
//        MyFunctionalInterface1 functionalInterface1 = ()->System.out.println("I am lambda");
//        MyFunctionalInterface1.m1();
////        functionalInterface1.apply();
//        functionalInterface1.m2();


    }
}

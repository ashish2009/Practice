package newPack.lambda;


public interface MyFunctionalInterface1 {

     void apply();

     static void m1(){
          System.out.println("Hi I am static");
     }

     default void m2(){
          System.out.println("I am default");
     }
}

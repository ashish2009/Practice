package generics;

public class Glass<T> {

    public T liquid;

    public void addLiquid(T liquid){
        this.liquid = liquid;
        System.out.println(liquid.toString());
    }

}

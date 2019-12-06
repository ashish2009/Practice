package generics;

public class Bartender {

    public <J,W> void mix(J j,W w){
        Glass<J> glass = new Glass<J>();
        glass.addLiquid(j);
        Glass<W> glass1 = new Glass<W>();
        glass1.addLiquid(w);
    }
}

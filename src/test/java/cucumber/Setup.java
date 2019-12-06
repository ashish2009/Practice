package cucumber;

import org.testng.annotations.BeforeMethod;

public class Setup {

    @BeforeMethod
    public void setup(){
        System.out.println("----------setup-----------");
    }
}

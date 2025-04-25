package praktikum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static praktikum.ConfigConst.MOZART;
import static praktikum.ConfigConst.PRICE;

public class BunTest {

    Bun bun;
    @Before
    public void setUp () {
        bun = new Bun(MOZART,PRICE);}

    @Test
    public void getPriceTest() {
        assertEquals(35.0f,bun.getPrice(),1);

    }
    @Test
    public void getNameTest() {
        assertEquals("mozart",bun.getName());
    }

}

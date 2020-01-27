import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTests{

    private WaterBottle waterbottle1;

    @Before
    public void before() {
        waterbottle1 = new WaterBottle(100);
    }

    @Test
    public void getVolume() {
        assertEquals(100.00, waterbottle1.getVolume(),0.0);
    }

    @Test
    public void drink(){
        waterbottle1.drink();
        waterbottle1.drink();
        assertEquals(80, waterbottle1.getVolume(), 0.0);
    }

    @Test
    public void empty() {
        waterbottle1.empty();
        assertEquals(0, waterbottle1.getVolume(), 0.0);
    }

    @Test
    public void fill() {
        waterbottle1.fill();
        assertEquals(100, waterbottle1.getVolume(), 0.0);
    }


}
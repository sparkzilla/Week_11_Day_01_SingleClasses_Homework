import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTests {

        private Calculator calculator1;

        @Before
        public void before(){
            calculator1 = new Calculator (3.3, 2.2); }

        @Test
        public void add(){
            assertEquals(5.5, calculator1.add(), 0.0);
        }

        @Test
        public void subtract() {
            assertEquals(1.1, calculator1.subtract(), 0.01);
        }

        @Test
        public void multiply() {
            assertEquals(7.26, calculator1.multiply(), 0.0);
        }
        @Test
        public void divide() {
            assertEquals(1.5, calculator1.divide(), 0.01);
        }
    }


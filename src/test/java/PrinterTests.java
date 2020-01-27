import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class PrinterTests{

        private Printer printer1;

        @Before
        public void before() {
            printer1 = new Printer(100, 1000);
        }

        @Test
        public void sheetsLeft(){
            assertEquals(100, printer1.getSheetsLeft());
        }

        @Test
        public void print() {
            printer1.print(10, 6);
            assertEquals(40, printer1.getSheetsLeft());
        }

        @Test
        public void getTonerVolume(){
            printer1.print(20, 2);
            assertEquals(960, printer1.getTonerVolume());
        }

    }

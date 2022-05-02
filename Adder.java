import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class Adder
{

        public int add() {
                    return 1 + 1;
                        }

            @Test 
                public void testAdd() {
                            assertEquals(add(), 1);
                                }

}



import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTest {
    @Test
    public void multiply(){
        assertEquals(0, skillDemo.multiply(1,0)); //meant to fail
    }
}

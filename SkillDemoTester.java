import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    
    @Test
    public void multiplication() {
        assertEquals(4, SkillDemo.multiply(2,2)); //should fail
    }
}

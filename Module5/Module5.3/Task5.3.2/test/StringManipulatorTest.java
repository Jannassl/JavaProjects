import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {
    @Test
    public void testConcatenate() {
        StringManipulator manipulator = new StringManipulator();
        String result = manipulator.concatenate("Hello", "World");
        assertEquals("HelloWorld", result);
        System.out.println("Test testConcatenate passed.");
    }
    @Test
    public void testFindLength() {
        StringManipulator manipulator = new StringManipulator();
        int result = manipulator.findLength("Hello");
        assertEquals(5, result);
        System.out.println("Test testFindLength passed.");
    }
    @Test
    public void testConvertToUpperCase() {
        StringManipulator manipulator = new StringManipulator();
        String result = manipulator.convertToUpperCase("Hello");
        assertEquals("HELLO", result);
        System.out.println("Test testConvertToUpperCase passed.");
    }
    @Test
    public void testConvertToLowerCase(){
        StringManipulator manipulator = new StringManipulator();
        String result = manipulator.convertToLowerCase("HELLO");
        assertEquals("hello",result);
        System.out.println("Test ConvertToLowerCase passed");
    }
    @Test
    public void testContainsSubString(){
        StringManipulator manipulator = new StringManipulator();
        boolean result = manipulator.containsSubString("Talviurheilu","urheilu");

        assertTrue(result);
        System.out.println("Test ContainsSubString passed");

    }
}

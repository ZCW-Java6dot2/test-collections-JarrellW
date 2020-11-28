package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void stackTestPop() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.pop();
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void stackTestPeek() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals("Hello world", stack.peek());
    }
    @Test
    public void stackTestisEmpty(){
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        Boolean expected = false;
        Boolean actual = stack.isEmpty();
        assertEquals(expected, actual);
    }
}

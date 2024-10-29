package datastructures;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

/**
 * ITSC 2214 Melody.
 * Instructor-provided code.
 */
public class LinkedStackTest {
    LinkedStack<Integer> stack;

    /**
     * Initialize the LinkedStack instance.
     */
    @Before
    public void setup() {
        stack = new LinkedStack<Integer>();
    }

    /**
     * Test of isEmpty method, of class LinkedStack.
     */
    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(6);
        assertFalse(stack.isEmpty());
        assertEquals(6, stack.topValue().intValue());
    }

    /**
     * Test of peek method, of class LinkedStack.
     */
    @Test
    public void testTopValue1() throws Exception {
        
        stack.clear();
        assertEquals(null, stack.topValue());
    }

    /**
     * Test of peek method, of class LinkedStack.
     */
    @Test
    public void testTopValue2() {
       
        stack.push(8);
        assertTrue(stack.topValue().equals(8));
        
    }
    
    /**
     * Test of pop method, of class LinkedStack.
     */
    @Test
    public void testPop1() {
        
        stack.clear();
        assertEquals(null, stack.pop());

    }
    /**
     * Test of pop method, of class LinkedStack.
     */
    @Test
    public void testPop2() {
        
        stack.push(8);
        stack.push(9);
        stack.push(10);
        int num = stack.pop();
        assertEquals(10, num);
        
        
    }
    
    /**
     * Test of push method, of class LinkedStack.
     */
    @Test
    public void testPush() {
       
        stack.push(4);
        assertEquals(1, stack.size());
        assertEquals(4, stack.topValue().intValue());
        stack.push(6);
        assertEquals(2, stack.size());
        assertEquals(6, stack.topValue().intValue());
        stack.pop();
        assertEquals(4, stack.topValue().intValue());
    }

    /**
     * Test of size method, of class LinkedStack.
     */
    @Test
    public void testSize() {
        stack.push(4);
        assertEquals(1, stack.size());
        stack.pop();
        assertEquals(0, stack.size());
    }
    
    /**
     * Test of clear() method of class LinkedStack.
     */
    @Test
    public void testClear() {
        stack.push(4);
        stack.push(6);
        stack.clear();
        assertEquals(0, stack.size());
        assertNull(stack.topValue());
    }
}

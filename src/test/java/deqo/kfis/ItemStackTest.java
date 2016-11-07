package deqo.kfis;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class ItemStackTest {

    //Given
    SimpleStack s = new ItemStack();

    @Test
     public void usualTest() throws Exception {

        //When
        s.push( new Item(5));
        s.pop();
        //Then
        assertTrue(s.isEmpty());
        assertEquals(0, s.getSize());
    }


    @Test(expected = EmptyStackException.class)
    public void isEmpty() throws EmptyStackException {

        s.pop();
        //Then
        assertFalse(s.isEmpty());
        assertEquals(1, s.getSize());
    }


    @Test
    public void peekValue() throws Exception {

        Item i = new Item(10);
        s.push(i);
        //Then
        assertSame(s.peek(), i);
    }



}
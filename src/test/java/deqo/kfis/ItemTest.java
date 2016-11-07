package deqo.kfis;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    private Item item = new Item();

    @Test
    public void testGetValue() throws Exception {
        item.setValue(5);
        assertTrue(item.getValue() == 5);
    }
}
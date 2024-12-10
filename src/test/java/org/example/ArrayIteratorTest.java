package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayIteratorTest {
    @Test
    void testIterator() {
        Integer[] numbers = {1, 2, 3};
        ArrayIterator<Integer> iterator = new ArrayIterator<>(numbers);

        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertEquals(2, iterator.next());
        assertEquals(3, iterator.next());
        assertFalse(iterator.hasNext());
    }
}
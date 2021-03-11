package pro.kwongsui.offer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import pro.kwongsui.offer.Solution09.CQueue;

class Solution09Test {

    @Test
    void test() {
        CQueue queue = new CQueue();
        assertEquals(-1, queue.deleteHead());
        queue.appendTail(5);
        queue.appendTail(2);
        assertEquals(5, queue.deleteHead());
        assertEquals(2, queue.deleteHead());
    }

}
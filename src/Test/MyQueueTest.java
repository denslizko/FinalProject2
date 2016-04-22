package test;

import com.company.MyQueue;
import com.company.Queue;
import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest extends MyQueue {
    @Test
    public void testStartingSize() throws Exception {
        Queue queue = new Queue();
        int expected = 0;
        int sizeStart = queue.getSize();
        Assert.assertEquals(expected, sizeStart);
    }

    @Test
    public void testIsEmpty() throws Exception {
        Queue queue = new Queue();
        boolean expected = true;
        boolean queueIsEmpty = queue.isEmpty();
        Assert.assertEquals(expected, queueIsEmpty);

    }
}
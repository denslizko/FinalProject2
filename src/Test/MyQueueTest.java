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

    @Test
    public void testFirstElementInQueue() throws Exception {
        Queue queue = new Queue();
        int expected = 0;
        int firstElement = queue.getFront();
        Assert.assertEquals(expected, firstElement);

    }
    @Test
    public void testTheQueueIsFull() throws Exception {
        Queue queue = new Queue();
        boolean expected = false;
        boolean fullQueue = queue.isFull();
        Assert.assertEquals(expected, fullQueue);
    }

    @Test
    public void testRemoveElement() throws Exception {
        Queue queue = new Queue();
        int expected = 0;
        int removeElement = queue.remove();
        Assert.assertEquals(expected, removeElement);
    }

    @Test
    public void testRemoveElements() throws Exception{
        Queue queue = new Queue();
        queue.addElement(6);
        int expected = 0;
        queue.removeElement(6);
        int number = queue.getSize();
        int element = queue.getElement(number);
        Assert.assertEquals(expected, element);
    }

}
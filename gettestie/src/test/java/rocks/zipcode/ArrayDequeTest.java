package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;


public class ArrayDequeTest {

    @Test
    public void arrayDequeTestAddFirst(){
        Deque<Integer> arrayDeque = new ArrayDeque<Integer>(2);

        arrayDeque.add(2);
        arrayDeque.add(4);
        arrayDeque.add(5);

        arrayDeque.addFirst(100);

        Integer expected = 100;
        Integer actual = arrayDeque.getFirst();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void arrayDequeTestAddLast(){
        Deque<Integer> arrayDeque = new ArrayDeque<Integer>(2);

        arrayDeque.add(2);
        arrayDeque.add(4);
        arrayDeque.add(5);

        arrayDeque.addLast(100);

        Integer expected = 100;
        Integer actual = arrayDeque.getLast();

        Assert.assertEquals(expected, actual);
    }
}

package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;


public class PriorityQueueTest {

    @Test
    public void priorityQueueTest(){
        PriorityQueue<String> pQ = new PriorityQueue<String>();

        pQ.add("Food");
        pQ.add("Water");
        pQ.add("Shelter");


        Boolean expected = false;
        Boolean actual = pQ.isEmpty();

        Assert.assertEquals(expected, actual);
    }

}

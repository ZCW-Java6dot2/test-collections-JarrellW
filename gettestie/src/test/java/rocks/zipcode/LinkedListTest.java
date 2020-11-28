package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void linkedListTestContains(){
        LinkedList<String> list = new LinkedList<String>();
        list.add("James");
        list.add("John");
        list.add("Newman");

        Boolean expected = true;
        Boolean actual = list.contains("John");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void linkedListTestRemove(){
        LinkedList<String> list = new LinkedList<String>();
        list.add("James");
        list.add("John");
        list.add("Newman");

        Boolean expected = true;
        Boolean actual = list.remove("James");

        Assert.assertEquals(expected, actual);


    }
}

package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {

    @Test
    public void arrayListTestAdd(){
        ArrayList<String> people = new ArrayList<>();
        String expected = "Drew";
        people.add("Tom");
        people.add("Drew");
        people.add("Aaron");


        people.set(0, "Drew");
        String actual = people.get(0);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void arrayListTestRemove(){
        ArrayList<String> people = new ArrayList<>();
        Integer expected = 2;
        people.add("Tom");
        people.add("Drew");
        people.add("Aaron");
        people.remove("Tom");

        Integer actual = people.size();

        Assert.assertEquals(expected, actual);
    }
}

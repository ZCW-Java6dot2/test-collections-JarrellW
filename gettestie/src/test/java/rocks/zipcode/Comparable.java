package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class Comparable {

    @Test
    public void comparableTest(){
        TreeSet<String> tall =new TreeSet<String>();

        tall.add("Rome");
        tall.add("Victor");
        tall.add("Jax");
        tall.add("Apple");

        String expected = "Apple";
        String actual = tall.first();

        Assert.assertEquals(expected, actual);
    }
}

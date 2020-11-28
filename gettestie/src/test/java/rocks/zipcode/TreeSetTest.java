package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TreeSetTest {

    @Test
    public void treeSetTestIsEmpty(){
        TreeSet<String> tall =new TreeSet<String>();

        tall.add("Rome");
        tall.add("Victor");
        tall.add("Jax");

        Boolean expected = false;
        Boolean actual = tall.isEmpty();

        Assert.assertEquals(expected, actual);
    }
}

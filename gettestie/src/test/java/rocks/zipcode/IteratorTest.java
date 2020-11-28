package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;

public class IteratorTest {

    @Test
    public void IteratorTest(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

       Boolean expected = true;
       Boolean actual = list.iterator().hasNext();

        Assert.assertEquals(expected, actual);
    }
}

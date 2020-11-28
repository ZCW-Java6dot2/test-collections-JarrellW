package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {

    @Test
    public void vectorTestCapacity(){
        Vector v = new Vector(3, 2);

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);

        Integer expected = 3;
        Integer actual = v.capacity();

        Assert.assertEquals(expected, actual);
    }
}

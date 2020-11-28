package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {

    @Test
    public void hashMapTestGet(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(40,"Max");
        map.put(50, "Rome");
        map.put(60, "Clone");

        String expected = "Rome";
        String actual = map.get(50);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void hashMapTestKey(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(40,"Max");
        map.put(50, "Rome");
        map.put(60, "Clone");

        Boolean expected = false;
        Boolean actual = map.containsKey(2);

        Assert.assertEquals(expected, actual);

    }
}

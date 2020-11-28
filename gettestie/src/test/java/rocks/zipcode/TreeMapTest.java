package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {

    @Test
    public void treeMapTest(){
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(100,"Amy");
        map.put(102,"Ray");
        map.put(101,"Jay");
        map.put(103,"Clay");

        map.remove(100);

        Integer expected = 3;
        Integer actual = map.size();

        Assert.assertEquals(expected, actual);

    }
}

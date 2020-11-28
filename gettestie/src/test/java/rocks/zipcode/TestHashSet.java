package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class TestHashSet {


    @Test
    public void TestHashsetsize(){
        //given
        HashSet<String> set = new HashSet();
        Integer expected = 3;
        set.add("One");
        set.add("Two");
        set.add("Three");

        //when
        Integer actual = set.size();

        //then
        Assert.assertEquals(expected, actual);

    }
    @Test

    public void TestHashsetRemove(){
        //Given
        HashSet<String> set = new HashSet<>();
        Integer expected = 2;
        set.add("one");
        set.add("Two");
        set.add("Three");
        set.remove("one");

        //when
        Integer actual = set.size();

        //then
        Assert.assertEquals(expected, actual);
    }
}

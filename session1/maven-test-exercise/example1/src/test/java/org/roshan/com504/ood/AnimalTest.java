package org.roshan.com504.ood;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTest {
    @Test
    public void testGetName()
    {
        Dog a1 = new Dog("ABCD");
        assertEquals("Wrong Name","ABCD", a1.getName());
    }
}

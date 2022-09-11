package org.roshan.com504.ood;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {
    @Before

    @Test (timeout = 1000)
    public void testGetRegNo() {
        Car c = new Car("1A12121B");
        assertEquals("1A12121B", c.getRegNo());
    }

    @After
    
}

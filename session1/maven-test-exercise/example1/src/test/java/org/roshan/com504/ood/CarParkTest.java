package org.roshan.com504.ood;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarParkTest {

    @Test
    public void testAddCar()
    {
        Car c1 = new Car("123abc");
        CarPark cp = new CarPark();

        assertTrue(cp.addCar(c1));
    }

    @Test
    public void testRemoveCar()
    {
        CarPark cp = new CarPark();
        Car c =  new Car("123xyz");
        cp.addCar(c);

        assertTrue(cp.removeCar(c));
    }
}

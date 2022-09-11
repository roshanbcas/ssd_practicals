package org.roshan.com504.ood;

import java.util.ArrayList;
import java.util.List;

public class CarPark {
    List<Car> cars;

    public CarPark()
    {
        cars = new ArrayList<Car>();
    }

    public boolean addCar(Car c)
    {
        cars.add(c);
        if (cars.contains(c))
            return true;
        else
            return false;
    }

    public boolean removeCar(Car c)
    {
        cars.remove(c);
        if (cars.contains(c))
            return false;
        else
            return true;
    }
}

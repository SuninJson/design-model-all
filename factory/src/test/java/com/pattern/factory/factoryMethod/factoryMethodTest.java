package com.pattern.factory.factoryMethod;

import com.pattern.factory.IVehicle;
import com.pattern.factory.method.BicycleFactory;
import com.pattern.factory.method.CarFactory;
import com.pattern.factory.method.IVehicleFactory;
import com.pattern.factory.method.MotorcycleFactory;
import org.junit.Test;

/**
 * @author Evan Huang
 * @date 2019/3/13
 */
public class factoryMethodTest {
    @Test
    public void create() throws Exception {
        IVehicleFactory bicycleFactory = new BicycleFactory();
        IVehicleFactory motorcycleFactory = new MotorcycleFactory();
        IVehicleFactory carFactory = new CarFactory();

        IVehicle bicycle = bicycleFactory.create();
        IVehicle motorcycle = motorcycleFactory.create();
        IVehicle car = carFactory.create();

        bicycle.drive();
        motorcycle.drive();
        car.drive();
    }
}
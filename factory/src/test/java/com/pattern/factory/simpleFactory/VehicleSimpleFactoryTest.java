package com.pattern.factory.simpleFactory;

import com.pattern.factory.Bicycle;
import com.pattern.factory.Car;
import com.pattern.factory.IVehicle;
import com.pattern.factory.Motorcycle;
import com.pattern.factory.simple.VehicleSimpleFactory;
import org.junit.Test;

/**
 * @author Evan Huang
 * @date 2019/3/12
 */
public class VehicleSimpleFactoryTest {
    @Test
    public void test() throws Exception {
        VehicleSimpleFactory vehicleSimpleFactory = new VehicleSimpleFactory();
        IVehicle bicycle = vehicleSimpleFactory.create(Bicycle.class);
        IVehicle motorcycle = vehicleSimpleFactory.create(Motorcycle.class);
        IVehicle car = vehicleSimpleFactory.create(Car.class);

        bicycle.drive();
        motorcycle.drive();
        car.drive();
    }

}
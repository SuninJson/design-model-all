package com.pattern.factory.method;

import com.pattern.factory.Car;
import com.pattern.factory.IVehicle;

/**
 * @author Evan Huang
 * @date 2019/3/13
 */
public class CarFactory implements IVehicleFactory {
    @Override
    public IVehicle create() {
        return new Car();
    }
}

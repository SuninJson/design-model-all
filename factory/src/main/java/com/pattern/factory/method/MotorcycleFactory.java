package com.pattern.factory.method;

import com.pattern.factory.IVehicle;
import com.pattern.factory.Motorcycle;

/**
 * @author Evan Huang
 * @date 2019/3/13
 */
public class MotorcycleFactory implements IVehicleFactory {
    @Override
    public IVehicle create() {
        return new Motorcycle();
    }
}

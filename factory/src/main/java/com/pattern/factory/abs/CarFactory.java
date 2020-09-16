package com.pattern.factory.abs;


import com.pattern.factory.IVehicle;

/**
 * @author Evan Huang
 * @date 2019/3/13
 */
public class CarFactory implements IVehicleFactory {

    @Override
    public IVehicle createFamily() {
        return new SedanCar();
    }

    @Override
    public IVehicle createCompetitive() {
        return new SportsCar();
    }
}

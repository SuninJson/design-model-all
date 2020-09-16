package com.pattern.factory.abstractFactory;

import com.pattern.factory.abs.CarFactory;
import com.pattern.factory.abs.IVehicleFactory;
import com.pattern.factory.abs.MotorcycleFactory;
import org.junit.Test;

/**
 * @author Evan Huang
 * @date 2019/3/13
 */
public class AbstractFactoryTest {

    @Test
    public void test(){
        IVehicleFactory carFactory = new CarFactory();
        carFactory.createFamily().drive();
        carFactory.createCompetitive().drive();

        IVehicleFactory motorcycleFactory = new MotorcycleFactory();
        motorcycleFactory.createFamily().drive();
        motorcycleFactory.createCompetitive().drive();
    }

}
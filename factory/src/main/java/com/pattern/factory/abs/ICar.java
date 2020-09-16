package com.pattern.factory.abs;

import com.pattern.factory.IVehicle;

/**
 * @author Evan Huang
 * @date 2019/3/13
 */
public interface ICar extends IVehicle{
    @Override
    void drive();
}

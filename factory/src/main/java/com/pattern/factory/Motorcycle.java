package com.pattern.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 摩托车
 *
 * @author Evan Huang
 * @date 2019/3/12
 */
@Slf4j
public class Motorcycle implements IVehicle {
    @Override
    public void drive() {
        log.info("摩托车行驶...");
    }
}

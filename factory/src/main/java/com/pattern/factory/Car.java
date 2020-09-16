package com.pattern.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 小汽车
 *
 * @author Evan Huang
 * @date 2019/3/12
 */
@Slf4j
public class Car implements IVehicle {
    @Override
    public void drive() {
        log.info("小汽车行驶...");
    }
}

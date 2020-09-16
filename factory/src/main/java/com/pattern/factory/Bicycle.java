package com.pattern.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 自行车
 *
 * @author Evan Huang
 * @date 2019/3/12
 */
@Slf4j
public class Bicycle implements IVehicle {
    @Override
    public void drive() {
        log.info("自行车行驶...");
    }
}

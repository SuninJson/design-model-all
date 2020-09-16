package com.pattern.factory.abs;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Evan Huang
 * @date 2019/3/13
 */
@Slf4j
public class SportsCar implements ICar {
    @Override
    public void drive() {
        log.info("行驶跑车...");
    }
}

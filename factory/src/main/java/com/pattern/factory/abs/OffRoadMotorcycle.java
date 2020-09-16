package com.pattern.factory.abs;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Evan Huang
 * @date 2019/3/13
 */
@Slf4j
public class OffRoadMotorcycle implements IMotorcycle {
    @Override
    public void drive() {
        log.info("行驶越野摩托车...");
    }
}

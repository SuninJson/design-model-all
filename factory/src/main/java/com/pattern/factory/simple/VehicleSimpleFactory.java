package com.pattern.factory.simple;

import com.pattern.factory.IVehicle;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Evan Huang
 * @date 2019/3/12
 */
@Slf4j
public class VehicleSimpleFactory {

    public IVehicle create(Class<? extends IVehicle> car) {
        try {
            return car.newInstance();
        } catch (Exception e) {
            log.info("简单车辆工厂创建{}失败！", car.getSimpleName());
        }
        return null;
    }
}

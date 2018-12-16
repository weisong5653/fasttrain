package service;

import entity.Driver;

/**
 * 司机业务
 */
public interface DriverService {
    int addDriver(Driver driver);
    void updateDriver(Driver driver);
}

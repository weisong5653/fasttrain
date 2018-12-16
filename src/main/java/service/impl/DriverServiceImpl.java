package service.impl;

import dao.DriverDao;
import entity.Driver;
import exceptions.DriverException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {
    @Autowired
    DriverDao driverDao;

    Logger logger = LoggerFactory.getLogger(this.getClass());
    public int addDriver(Driver driver) {
        int mark = 0;
            if(driver == null){
                throw new DriverException("司机信息为空");
            } else {
                mark = driverDao.addDriver(driver);
                logger.debug("创建了一个司机信息");
            }

        return mark;
    }

    public void updateDriver(Driver driver) {
        if(driver == null){
            throw new DriverException("司机信息为空");
        } else {
            driverDao.updateDriver(driver);
            logger.debug("更新了一个司机信息");
        }

    }
}

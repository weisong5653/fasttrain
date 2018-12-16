package service.impl;

import dao.PassengerDao;
import entity.Passenger;
import exceptions.PassengerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.PassengerService;


@Service
public class PassengerServiceImpl implements PassengerService {
    @Autowired
    PassengerDao passengerDao;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    public int addPassenger(Passenger passenger) {
        int mark = 0;
        if(passenger == null){
            throw new PassengerException("乘客信息为空");
        } else {
            mark = passengerDao.addPassenger(passenger);
            logger.debug("创建了一个乘客信息");
        }
        return mark;
    }
}

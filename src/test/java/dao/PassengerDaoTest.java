package dao;

import entity.Passenger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class PassengerDaoTest {
    @Autowired
    PassengerDao passengerDao;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Test
    public void addPassenger() {
//        Passenger passenger = new Passenger();
//        passenger.setEvalution("11");
//        passenger.setId(1);
//        passenger.setName("lws");
//        passenger.setPhone("12334323");
//        passenger.setSex("man");
//        int a = passengerDao.addPassenger(passenger);
//        System.out.println(a);
    }
}
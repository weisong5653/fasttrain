package dao;

import entity.Driver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class DriverDaoTest {
    @Autowired
    DriverDao driverDao;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Test
    public void addDriver() {
//        Driver driver = new Driver();
//        driver.setCarType("小车");
//        driver.setId(1);
//        driver.setPhone("2132334");
//        driver.setColor("blue");
//        driver.setGrade(88);
//        driver.setOrders(4444);
//        driver.setPlateNumber("粤A666");
//        driver.setProofIdentity("450821100939102310");
//        int a = driverDao.addDriver(driver);
//        System.out.println(a);
    }

    @Test
    public void updateDriver(){
//        Driver driver = new Driver();
//        driver.setId(1);
//        driver.setGrade(90);
//        driverDao.updateDriver(driver);
    }
}
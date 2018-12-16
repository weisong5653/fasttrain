package dao;

import entity.Pay;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author weisong
 * @date 2018/11/22 1:41 PM
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class PayDaoTest {
    @Autowired
    PayDao payDao;
    @Test
    public void savePay() {
//        Pay pay = new Pay();
//        pay.setOrderId(1);
//        pay.setDriverId(1);
//        pay.setPayWay("微信");
//        pay.setTime(new Date());
//        pay.setPassengerId(1);
//        pay.setAmount(99);
//        System.out.println(pay);
//        payDao.savePay(pay);
    }
}
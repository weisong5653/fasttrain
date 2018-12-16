package dao;

import entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.ORB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.OrderService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author weisong
 * @date 2018/11/21 9:36 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class OrderDaoTest {
    @Autowired
    OrderDao orderDao;

    @Test
    public void addOrder() {
//        Order order = new Order();
//        order.setId(1);
//        order.setPassengerId(1);
//        order.setDriverId(1);
//        orderDao.addOrder(order);
    }

    @Test
    public void updateOrder() {
//        SimpleDateFormat sdf = new SimpleDateFormat();
//        Date date = new Date();
//        String time = sdf.format(date);
//        Order order = new Order();
//        System.out.println(date);
//        order.setId(1);
//        order.setPassengerId(1);
//        order.setDriverId(1);
//        order.setState(1);
//        order.setCreateTime(time);
//        order.setEndTime(time);
//        order.setScore(90);
//        order.setevalution("满分满分");

//        orderDao.updateOrder(order);
//        orderDao.updateEvalution(1,"好好");
    }

    @Test
    public void listOreders(){
        List<Order> list = orderDao.listOreders(1);
        System.out.println(list);
    }
}
package service;

import dto.ResultDto;
import entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author weisong
 * @date 2018/11/21 11:08 PM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class OrderServiceTest {

    @Autowired
    OrderService orderService;

    @Test
    public void addOrder() {
    }

    @Test
    public void updateOrder() {
    }

    @Test
    public void listOrders() {
        ResultDto<Order> list = orderService.listOrders(1);
        System.out.println(list);
    }
}
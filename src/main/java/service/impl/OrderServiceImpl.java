package service.impl;

import dao.OrderDao;
import dto.ResultDto;
import entity.Order;
import exceptions.OrderException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.OrderService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    OrderDao orderDao;
    public void addOrder(Order order) {
        if (order == null){
            throw new OrderException("订单对象为空");
        } else {
            orderDao.addOrder(order);
            logger.debug("创建ID为"+order.getId()+"的订单");
        }
    }

    public void updateOrder(Order order) {
        if (order == null){
            throw new OrderException("订单对象为空");
        } else {
            orderDao.updateOrder(order);
            logger.debug("更新了Id为"+order.getId()+"的订单");
        }
    }


    public ResultDto<Order> listOrders(int state){
        List<Order> list = orderDao.listOreders(state);
        return new ResultDto<Order>(list);
    }
}

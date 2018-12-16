package service;

import dto.ResultDto;
import entity.Order;

/**
 * 订单业务接口
 */
public interface OrderService {
    void addOrder(Order order);
    void updateOrder(Order order);
//    封装Order集合
    ResultDto<Order> listOrders(int state);
}

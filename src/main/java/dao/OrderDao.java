package dao;

import entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单Dao
 * 2018.11.21
 */
public interface OrderDao {
    int addOrder(@Param("order") Order order);
    int updateOrder(@Param("order") Order order);
    int updateState(@Param("id") int id,@Param("state") int state);
    int updateScore(@Param("id") int id,@Param("score") int score);
    int updateEvalution(@Param("id") int id,@Param("evalution") String evalution);

    List<Order> listOreders(int state);
}

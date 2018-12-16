package web;

import entity.Driver;
import entity.Order;
import entity.Passenger;
import entity.Path;
import enums.StateEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.socket.TextMessage;
import service.OrderService;
import service.PathService;
import websocket.WebSockerDo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    PathService pathService;
    @Autowired
    WebSockerDo webSockerDo;
    @RequestMapping(value = "/createOrder",method = RequestMethod.POST)
    public String  createOrder(Order order, @RequestBody Path path, Passenger passenger, Driver driver, HttpServletRequest request){
        SimpleDateFormat sdf = new SimpleDateFormat();
//      由于没有设置主键自增，也没有生成主键的关系，所有每次都要更改一次主键
        String number = UUID.randomUUID().toString();
        HttpSession session = request.getSession();
        if(session.getAttribute("order") != null){
            order = (Order)session.getAttribute("order");
            driver = (Driver) session.getAttribute("driver");
            order.setDriverId(driver.getId());
            order.setState(StateEnum.ORDER_DEAL.getState());
            try {
                webSockerDo.sendMessageToUser(StateEnum.ORDER_DEAL.getMessage(),order);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            Date time = new Date();
            String createTime = sdf.format(time);
            passenger = (Passenger) session.getAttribute("passenger");
//          不存在订单则创建
            order.setPassengerId(passenger.getId());
            order.setCreateTime(createTime);
            order.setId(number);
            order.setState(StateEnum.ORDER_AWAIT.getState());
            orderService.addOrder(order);

//          创建路径
            path.setId(number);
            path.setOrderId(order.getId());
            pathService.savePath(path);

            session.setAttribute("path",path);
            session.setAttribute("order",order);
        }

        return null;
    }


}

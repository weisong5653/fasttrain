package web;

import dto.PayEndDto;
import dto.TemporaryPyDrOrdDto;
import entity.Driver;
import entity.Order;
import entity.Passenger;
import entity.Pay;
import enums.StateEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.socket.TextMessage;
import service.DriverService;
import service.OrderService;
import service.PayService;
import websocket.WebSockerDo;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author weisong
 * @date 2018/12/14 9:04 PM
 */
@Controller
public class PayController {
    @Autowired
    PayService payService;
    @Autowired
    DriverService driverService;
    @Autowired
    OrderService orderService;
    @Autowired
    WebSockerDo webSockerDo;
    @RequestMapping(value = "/createPay", method = RequestMethod.POST)
    public String createPay(@RequestBody TemporaryPyDrOrdDto temporaryPyDrOrdDto, HttpSession session, Order order,
                            Driver driver, Passenger passenger, Pay pay){
        Date date = new Date();
        passenger = (Passenger) session.getAttribute("passenger");
        SimpleDateFormat sdf = new SimpleDateFormat();
//        更新driver

        driver = (Driver) session.getAttribute("driver");
        driver.setGrade(temporaryPyDrOrdDto.getScore());
        driverService.updateDriver(driver);
//        更新order
        order = (Order) session.getAttribute("order");
        order.setState(StateEnum.ORDER_SUCCESS.getState());
        order.setScore(temporaryPyDrOrdDto.getScore());
        order.setevalution(temporaryPyDrOrdDto.getEvalution());
        order.setEndTime(sdf.format(date));
        orderService.updateOrder(order);
//        创建pay
        pay.setId(UUID.randomUUID().toString());
        pay.setAmount(temporaryPyDrOrdDto.getAmount());
        pay.setPayWay(temporaryPyDrOrdDto.getPayWay());
        pay.setTime(date);
        pay.setOrderId(order.getId());
        pay.setPassengerId(passenger.getId());
        pay.setDriverId(driver.getId());
        payService.savePay(pay);

//        创建支付结果Dto
        PayEndDto payEndDto = new PayEndDto(temporaryPyDrOrdDto.getAmount(),temporaryPyDrOrdDto.getScore(),
                temporaryPyDrOrdDto.getEvalution());
        try {
            webSockerDo.sendMessageToUser(StateEnum.PAY_END.getMessage(),payEndDto);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        return null；不知道为什么会跳转到createPay.jsp而导致404;
        return "createPassenger";
    }
}

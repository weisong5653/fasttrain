package web;

import entity.Driver;
import entity.Order;
import enums.StateEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.DriverService;
import service.OrderService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;

/**
 * @author weisong
 * @date 2018/12/14 11:35 PM
 */
@Controller
public class DriverController {
    @Autowired
    DriverService driverService;
    @Autowired
    OrderService orderService;
    @RequestMapping(value = "/createDriver",method = RequestMethod.POST)
    public String  createDriver(@RequestBody Driver driver, HttpServletRequest request, Model model){
        driver.setId(UUID.randomUUID().toString());
        driverService.addDriver(driver);
        HttpSession session = request.getSession();
        List<Order> list = orderService.listOrders(StateEnum.ORDER_AWAIT.getState()).getData();
//        List<Order> list = orderService.listOrders(1).getData();

//        model填充数据在前端无法获取
//        model.addAttribute("listOrders",list);

        session.setAttribute("listOrders",list);
        session.setAttribute("driver",driver);
        return null;
    }

}

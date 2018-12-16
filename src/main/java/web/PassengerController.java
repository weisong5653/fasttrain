package web;

import entity.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.PassengerService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * @author weisong
 * @date 2018/12/14 9:03 PM
 */
@Controller
public class PassengerController {
    @Autowired
    PassengerService passengerService;

    @RequestMapping(value = "/createPassenger",method = RequestMethod.POST)
    public String  createPassenger(@RequestBody Passenger passenger, HttpServletRequest request){
        passenger.setId(UUID.randomUUID().toString());
        passengerService.addPassenger(passenger);
        HttpSession session = request.getSession();
        session.setAttribute("passenger",passenger);
        return null;
    }

}

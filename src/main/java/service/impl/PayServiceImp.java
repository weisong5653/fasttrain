package service.impl;

import dao.PayDao;
import entity.Pay;
import exceptions.PayException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.PayService;

/**
 * @author weisong
 * @date 2018/11/22 2:16 PM
 */
@Service
public class PayServiceImp implements PayService {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    PayDao payDao;
    public void savePay(Pay pay) throws PayException{
        if(pay == null){
            throw new PayException("pay为null");
        } else {
            payDao.savePay(pay);
            logger.debug("创建了一条pay记录");
        }
    }
}

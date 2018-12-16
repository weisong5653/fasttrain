package dao;

import entity.Path;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author weisong
 * @date 2018/11/22 8:50 AM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class PathDaoTest {
    @Autowired
    PathDao pathDao;
    @Test
    public void savePath() {
//        Path path = new Path();
//        path.setId(111);
//        path.setOrderId(1);
//        path.setOrigin("BNUZ");
//        path.setTerminus("BNU");
//        pathDao.savePath(path);
    }
}
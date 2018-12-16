package service.impl;

import dao.PathDao;
import entity.Path;
import exceptions.PathException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.PathService;

/**
 * @author weisong
 * @date 2018/11/22 8:45 AM
 */
@Service
public class PathServiceImpl implements PathService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PathDao pathDao;
    public void savePath(Path path) throws PathException{
        if(path==null){
            throw new PathException("路径为空");
        } else {
            pathDao.savePath(path);
            logger.debug("创建了ID为"+path.getId()+"路径信息");
        }
    }
}

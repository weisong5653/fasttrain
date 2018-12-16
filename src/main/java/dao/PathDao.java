package dao;

import entity.Path;
import org.apache.ibatis.annotations.Param;

/**
 * @author weisong
 * @date 2018/11/22 8:46 AM
 */
public interface PathDao {
    int savePath(@Param("path")Path path);
}

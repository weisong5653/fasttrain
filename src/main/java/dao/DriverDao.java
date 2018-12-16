package dao;

import entity.Driver;
import org.apache.ibatis.annotations.Param;

/**
 * 司机Dao
 */
public interface DriverDao {
    int addDriver(@Param("driver") Driver driver);
    int updateDriver(@Param("driver") Driver driver);
}

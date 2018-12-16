package dao;

import entity.Passenger;
import org.apache.ibatis.annotations.Param;

/**
 * 乘客Dao
 */
public interface PassengerDao {
    int addPassenger(@Param("passenger") Passenger passenger);
}

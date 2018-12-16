package dao;

import entity.Pay;
import org.apache.ibatis.annotations.Param;

/**
 * @author weisong
 * @date 2018/11/22 1:37 PM
 */
public interface PayDao {
    void savePay(@Param("pay") Pay pay);
}

package com.zq.service.imp;/**
 * @Author: YourName
 * @Date: Created in 2020/12/21 17:33
 * @Description: TODO
 * @Version: 1.0
 */

import com.zq.dao.RentBicycle;
import com.zq.utils.SqlSessionUti;
import org.apache.ibatis.session.SqlSession;

/**
 *@author LZQ
 *@date 2020/12/21 17:33
 */
public class RentBicycleImp implements com.zq.service.RentBicycleService {


    @Override
    public  void rentBicycle(String username, double price) {

        SqlSession sqlSession = SqlSessionUti.getSqlSession();
        RentBicycle mapper = sqlSession.getMapper(RentBicycle.class);
        mapper.rentBicycle(username, price);
       /* if (i==1) {
            return true;
        } else {
            return false;
        }*/
    }
}

package com.zq.service.imp;/**
 * @Author: YourName
 * @Date: Created in 2020/12/6 18:11
 * @Description: TODO
 * @Version: 1.0
 */

import com.zq.bean.Bicycle;
import com.zq.bean.User;
import com.zq.dao.BicycleDao;
import com.zq.dao.UserDao;
import com.zq.service.BicycleService;
import com.zq.utils.SqlSessionUti;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 *@author LZQ
 *@date 2020/12/6 18:11
 */
public class BicyclesImp implements BicycleService {

    @Override
    public List<Bicycle> getAllbicycles() {
        BicycleDao bicycleDao = SqlSessionUti.getSqlSession().getMapper(BicycleDao.class);

        List<Bicycle> bicyclesList = bicycleDao.selectBicycles();

        return  bicyclesList;
    }

    @Override
    public Bicycle getBicycleById(int id) {
        SqlSession sqlSession = SqlSessionUti.getSqlSession();
        BicycleDao mapper = sqlSession.getMapper(BicycleDao.class);
        Bicycle bicycle = mapper.getBicycleById(id);
        return bicycle;
    }

}

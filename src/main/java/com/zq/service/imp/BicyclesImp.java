package com.zq.service.imp;/**
 * @Author: YourName
 * @Date: Created in 2020/12/6 18:11
 * @Description: TODO
 * @Version: 1.0
 */

import com.zq.bean.Bicycle;
import com.zq.bean.OwnBicycle;
import com.zq.bean.User;
import com.zq.dao.BicycleDao;
import com.zq.dao.RentBicycle;
import com.zq.dao.UserDao;
import com.zq.service.BicycleService;
import com.zq.utils.GetNumber;
import com.zq.utils.SqlSessionUti;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *@author LZQ
 *@date 2020/12/6 18:11
 */
@Service
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

    @Override
    public void addBicycleIntoCar(String name,String path,String date,double price) {
        SqlSession sqlSession = SqlSessionUti.getSqlSession();
        BicycleDao mapper = sqlSession.getMapper(BicycleDao.class);
        mapper.addBicycleIntoCar(name,path, date,price);

    }

    @Override
    public void rentBicycle(String username, double price) {
        SqlSession sqlSession = SqlSessionUti.getSqlSession();
        RentBicycle mapper = sqlSession.getMapper(RentBicycle.class);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

        String dingdan = GetNumber.genRandomNum();
        mapper.rentBicycle(dingdan,username, price,df.format(new Date()));
    }

    @Override
    public void addbicycleInf(String owner, String path) {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String time = df.format(new Date());

        SqlSession sqlSession = SqlSessionUti.getSqlSession();
        BicycleDao mapper = sqlSession.getMapper(BicycleDao.class);


        mapper.addbicycleInf(owner,path,time,0);


    }

    @Override
    public List<OwnBicycle> getOwnBicycles(String name) {

        SqlSession sqlSession = SqlSessionUti.getSqlSession();
        BicycleDao mapper = sqlSession.getMapper(BicycleDao.class);

        List<OwnBicycle> ownBicycles = mapper.getOwnBicycles(name);

        return ownBicycles;
    }

}

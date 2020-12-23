package zq.test;/**
 * @Author: YourName
 * @Date: Created in 2020/11/7 20:15
 * @Description: TODO
 * @Version: 1.0
 */

import com.zq.bean.Bicycle;
import com.zq.bean.Dingdan;
import com.zq.bean.User;
import com.zq.dao.BicycleDao;
import com.zq.dao.DingdanDao;
import com.zq.dao.UserDao;
import com.zq.service.BicycleService;
import com.zq.service.imp.BicyclesImp;
import com.zq.utils.SqlSessionUti;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *@author LZQ
 *@date 2020/11/7 20:15
 */
public class TestDao {
    @Test
    public void testInsertStudent(){
        org.apache.ibatis.session.SqlSession sqlSession = SqlSessionUti.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        /*User zhansan = new User();
        zhansan.setName("张三");
        zhansan.setPassword("123");
        mapper.insertUser(zhansan);*/
//        User useryang = mapper.login("gouchuang", "123");
//        System.out.println(useryang);
       /* User user = mapper.selectUser("张三");
        System.out.println(user);*/
        BicyclesImp bicyclesImp = new BicyclesImp();
        List<Bicycle> allbicycles = bicyclesImp.getAllbicycles();
        System.out.println(allbicycles);
    }

    @Test
    public void getBicycleById(){

        BicycleService bicycleService = new BicyclesImp();
        Bicycle bicycle = bicycleService.getBicycleById(1);
        System.out.println(bicycle);

    }
    @Test
    public void getDate()
    {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
    }

    @Test
    public void getDingdanByusername(){
        SqlSession sqlSession = SqlSessionUti.getSqlSession();
        DingdanDao mapper = sqlSession.getMapper(DingdanDao.class);
        List<Dingdan> list = mapper.getAlldingdanByUsername("志强");
        System.out.println(list);
    }

}

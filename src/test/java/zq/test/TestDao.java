package zq.test;/**
 * @Author: YourName
 * @Date: Created in 2020/11/7 20:15
 * @Description: TODO
 * @Version: 1.0
 */

import com.zq.bean.Bicycle;
import com.zq.bean.User;
import com.zq.dao.BicycleDao;
import com.zq.dao.UserDao;
import com.zq.service.imp.BicyclesImp;
import com.zq.utils.SqlSessionUti;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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


}

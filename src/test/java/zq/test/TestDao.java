package zq.test;/**
 * @Author: YourName
 * @Date: Created in 2020/11/7 20:15
 * @Description: TODO
 * @Version: 1.0
 */

import com.zq.bean.User;
import com.zq.dao.UserDao;
import com.zq.util.SqlSessionGeter;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 *@author LZQ
 *@date 2020/11/7 20:15
 */
public class TestDao {
    @Test
    public void testInsertStudent(){
        SqlSession sqlSession = SqlSessionGeter.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        /*User zhansan = new User();
        zhansan.setName("张三");
        zhansan.setPassword("123");
        mapper.insertUser(zhansan);*/

        User user = mapper.selectUser("张三");
        System.out.println(user);
    }


}

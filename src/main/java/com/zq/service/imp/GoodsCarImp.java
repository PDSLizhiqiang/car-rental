package com.zq.service.imp;/**
 * @Author: YourName
 * @Date: Created in 2020/12/22 21:53
 * @Description: TODO
 * @Version: 1.0
 */

import com.zq.bean.GoodsCar;
import com.zq.dao.GoodsCarDao;
import com.zq.service.GoodsCarService;
import com.zq.utils.SqlSessionUti;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@author LZQ
 *@date 2020/12/22 21:53
 */
@Service
public class GoodsCarImp  implements GoodsCarService {

    @Override
    public List<GoodsCar> findAllGoodsCar(String username) {

        SqlSession sqlSession = SqlSessionUti.getSqlSession();
        GoodsCarDao mapper = sqlSession.getMapper(GoodsCarDao.class);
        List<GoodsCar> allGoodsCar = mapper.findAllGoodsCar(username);
        return allGoodsCar;
    }

    @Override
    public void removeBicycle(int id) {
        SqlSession sqlSession = SqlSessionUti.getSqlSession();
        GoodsCarDao mapper = sqlSession.getMapper(GoodsCarDao.class);
        mapper.removeBicycle(id);

    }
}

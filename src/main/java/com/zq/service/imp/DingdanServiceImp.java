package com.zq.service.imp;/**
 * @Author: YourName
 * @Date: Created in 2020/12/22 15:20
 * @Description: TODO
 * @Version: 1.0
 */

import com.zq.bean.Dingdan;
import com.zq.dao.DingdanDao;
import com.zq.service.DingdanService;
import com.zq.utils.SqlSessionUti;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@author LZQ
 *@date 2020/12/22 15:20
 */
@Service
public class DingdanServiceImp implements DingdanService {



    @Override
    public List<Dingdan> getAlldingdanByUsername(String username) {

        SqlSession sqlSession = SqlSessionUti.getSqlSession();
        DingdanDao mapper = sqlSession.getMapper(DingdanDao.class);
        List<Dingdan> dingdanlist = mapper.getAlldingdanByUsername(username);
        return dingdanlist;
    }
}

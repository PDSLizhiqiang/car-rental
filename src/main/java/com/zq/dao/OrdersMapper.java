package com.zq.dao;

import java.util.List;
import java.util.Map;


public interface OrdersMapper{
    public List<Map<String,String>> tongji(Map<String,String> params);
}

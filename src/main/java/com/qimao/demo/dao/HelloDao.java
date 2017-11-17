package com.qimao.demo.dao;


import com.qimao.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HelloDao{

    int save(User user);
}

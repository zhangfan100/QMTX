package com.qimao.dao;


import com.qimao.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HelloDao{

    int save(User user);
}

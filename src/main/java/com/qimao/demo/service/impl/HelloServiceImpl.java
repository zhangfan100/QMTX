package com.qimao.demo.service.impl;

import com.qimao.demo.dao.HelloDao;
import com.qimao.demo.domain.User;
import com.qimao.demo.service.HelloService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * web-api
 *
 * @author zhangfan
 * @date 2017/10/25 18:56
 * @function
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Resource
    private HelloDao helloDao;

    @Override
    public int save(User user) {
        return helloDao.save(user);
    }
}

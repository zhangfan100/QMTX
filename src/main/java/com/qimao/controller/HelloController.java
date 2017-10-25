package com.qimao.controller;

import com.qimao.domain.User;
import com.qimao.service.HelloService;
import com.qimao.utils.QMConstants;
import com.qimao.utils.QMUtils;
import com.qimao.utils.ResponseData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
@ApiModel(description = "hello")
public class HelloController {

    private static final Logger logger= LoggerFactory.getLogger(HelloController.class);

    @Resource
    private HelloService helloService;

    @PostMapping("hello")
    @ApiOperation(value = "hello 接口",notes = "保存用户")
    public ResponseData<String> hello(@RequestBody User user) {
        logger.info("hello--- {} ",user);
        try {
            return QMUtils.getResultInfo(helloService.save(user)+"");
        } catch (Exception e) {
            logger.error("Exception:{}", e.getMessage());
            return QMUtils.getResultInfo(QMConstants.FAIL);
        }
    }
}

package com.sparksys.test.interfaces.controller;

import com.github.sparkzxl.log.annotation.WebLog;
import com.github.sparkzxl.web.annotation.ResponseResult;
import com.github.sparkzxl.authority.api.UserService;
import com.github.sparkzxl.authority.dto.UserDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author: zhouxinlei
 * @date: 2020-09-04 15:08:58
 */
@RestController
@RequestMapping("/user")
@ResponseResult
@WebLog
@Api(tags = "测试管理")
public class TestController {

    @DubboReference(version = "1.0.0",protocol = "dubbo",mock = "true")
    private UserService userService;

    @GetMapping("/test")
    @ApiOperation("test dubbo")
    public UserDTO testDubbo(@RequestParam("userId") Long userId) {
        return userService.getById(userId);
    }
}

package com.github.sparkzxl.authority.api;

import com.github.sparkzxl.authority.dto.UserDTO;
import com.github.sparkzxl.core.support.SparkZxlExceptionAssert;

/**
 * description: 服务降级处理
 *
 * @author: zhouxinlei
 * @date: 2020-11-27 16:26:11
*/
public class UserServiceMock implements UserService{
    @Override
    public UserDTO getById(Long id) {
        SparkZxlExceptionAssert.serviceDegrade();
        return null;
    }
}

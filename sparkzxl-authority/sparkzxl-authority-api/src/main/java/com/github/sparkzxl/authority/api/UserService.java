package com.github.sparkzxl.authority.api;

import com.github.sparkzxl.authority.dto.UserDTO;

/**
 * description:
 *
 * @author: zhouxinlei
 * @date: 2020-09-04 13:27:07
 */
public interface UserService {

    /**
     * 根据用户id查询用户信息
     *
     * @param id 用户id
     * @return UserDTO
     */
    UserDTO getById(Long id);
}


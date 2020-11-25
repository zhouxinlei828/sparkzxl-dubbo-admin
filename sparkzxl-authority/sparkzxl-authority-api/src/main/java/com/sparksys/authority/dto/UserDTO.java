package com.sparksys.authority.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * description: 用户DTO
 *
 * @author: zhouxinlei
 * @date: 2020-09-04 13:26:44
 */
@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = -3979285947838947206L;

    private Long id;
    private String account;
    private String password;
    private String name;

    private Long orgId;

    private Long stationId;

    private String email;

    private String mobile;

    private String sex;

    private Boolean status;

    private String avatar;

    private String nation;

    private String education;

    private String positionStatus;

    private String workDescribe;

    private LocalDateTime passwordErrorLastTime;

    private Integer passwordErrorNum;

    private LocalDateTime passwordExpireTime;

    private LocalDateTime lastLoginTime;

}

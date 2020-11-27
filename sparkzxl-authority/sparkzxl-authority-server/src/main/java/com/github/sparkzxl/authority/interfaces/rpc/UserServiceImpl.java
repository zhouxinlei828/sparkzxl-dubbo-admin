package com.github.sparkzxl.authority.interfaces.rpc;

import com.github.sparkzxl.authority.api.UserService;
import com.github.sparkzxl.authority.infrastructure.convert.AuthUserConvert;
import com.github.sparkzxl.authority.infrastructure.entity.AuthUser;
import com.github.sparkzxl.authority.domain.repository.IAuthUserRepository;
import com.github.sparkzxl.authority.dto.UserDTO;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * description: dubbo 用户实现类
 *
 * @author: zhouxinlei
 * @date: 2020-09-04 13:35:39
 */
@Service(protocol = "dubbo", version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Autowired
    private IAuthUserRepository userRepository;

    @Override
    public UserDTO getById(Long id) {
        AuthUser authUser = userRepository.selectById(id);
        return AuthUserConvert.INSTANCE.convertUserDTO(authUser);
    }
}

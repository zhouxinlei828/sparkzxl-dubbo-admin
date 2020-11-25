package com.sparksys.authority.interfaces.rpc;

import com.sparksys.authority.api.UserService;
import com.sparksys.authority.domain.repository.IAuthUserRepository;
import com.sparksys.authority.dto.UserDTO;
import com.sparksys.authority.infrastructure.convert.AuthUserConvert;
import com.sparksys.authority.infrastructure.entity.AuthUser;
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

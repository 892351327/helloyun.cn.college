package hellhoyun.cn.college.service.impl;

import helloyun.cn.college.entity.Users;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    int loginFind(String phone,String pasword);
    int insertUser(Users users);
    int findUser(String user_phone);
}

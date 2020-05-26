package helloyun.cn.college.service;


import helloyun.cn.college.entity.Users;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    int create(Users users);
    Users getUserId(int User_Id);
}

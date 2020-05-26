package helloyun.cn.college.service.impl;

import helloyun.cn.college.dao.UsersDao;
import helloyun.cn.college.entity.Users;
import helloyun.cn.college.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersDao usersDao;

    public int create(Users users){
        return usersDao.create(users);
    }
    public Users getUserId(int User_Id){
        return  usersDao.getUserId(User_Id);
    }

}

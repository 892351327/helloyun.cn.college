package hellhoyun.cn.college.service.impl.service.impl;

import hellhoyun.cn.college.dao.LoginDao;
import hellhoyun.cn.college.service.impl.LoginService;
import helloyun.cn.college.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService {
    @Autowired
    private LoginDao loginDao;
    @Override
    public int loginFind(String phone,String pasword) {

        Users pas = loginDao.selectUser(phone);
        if(pas==null){//判断用户是否存在
            return 0;
        }else if(pas.getUser_Password().equals(pasword)){//判断密码是否正确
            return 1;
        }
        else {//密码不正确
            return 2;
        }

    }
    @Override
    public int insertUser(Users users) {
        return loginDao.insertUsers(users);
    }
    @Override
    public int findUser(String user_phone) {
        System.out.println(user_phone);
       Users users =  loginDao.selectUser(user_phone);
        System.out.println(loginDao.selectUser(user_phone));
       if (users == null){
           return 0;
       }else return 1;

    }
}

package hellhoyun.cn.college.controller;

import hellhoyun.cn.college.service.impl.LoginService;
import helloyun.cn.college.entity.CommonResult;
import helloyun.cn.college.entity.Users;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RefreshScope //支持nacos的动态刷新功能
public class LoginController {
    @Autowired
    private LoginService loginService;
    //登录
    @RequestMapping(value = "/user/login")
    public CommonResult Login(String phone,String pasword) {
        System.out.println(phone);
        System.out.println(pasword);
        //判断账号密码是否为空
        if(phone ==null){
            return new CommonResult(444,"账号不能为空");
        }else if (pasword==null){
            return new CommonResult(444,"密码不能为空");
        }
        //根据传递的值进行登录
        int state = loginService.loginFind(phone,pasword);
        if (state==0){
            return new CommonResult(222,"登录失败,用户不存在！");
        }else if(state == 1){
            return new CommonResult(444,"登录成功！");
        }else{
            return new CommonResult(222,"密码不正确！");
        }
    }
    //注册
    @RequestMapping(value = "/user/register")//127.0.0.1:8002/user/register?User_Name=test&User_Password=test&User_Phone=test&User_Unit=test&User_StatusId=test&School_Id=1
    public CommonResult register( Users users){
        System.out.println(users);
        System.out.println(users.getUser_Phone());
        //判读注册信息是否存在空值
        if(users.getUser_Password()!=null &&  users.getUser_Phone()!=null
                && users.getUser_Name()!=null && users.getUser_Unit()!=null
                && users.getUser_StatusId()!=null && users.getSchool_Id()!=0){
            String  phone = users.getUser_Phone();
            //用于判断用户是否已注册（0表示没有该用户）
            int state2 = loginService.findUser(phone);
            if (state2==0){
                //添加用户
                int state = loginService.insertUser(users);
                return  new CommonResult(222,"完成注册");
            }else return  new CommonResult(222,"用户已注册");

        }
        else {
            return  new CommonResult(444,"参数缺失");
        }
    }
}

package helloyun.cn.college.controller;

import helloyun.cn.college.entity.CommonResult;
import helloyun.cn.college.entity.Users;
import helloyun.cn.college.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RefreshScope //支持nacos的动态刷新功能
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/user/create")   //127.0.0.1:8001/user/create?User_Name=test&User_Password=test&User_Phone=test&User_Unit=test&User_StatusId=test&School_Id=1
    public CommonResult create(@RequestBody Users users){
        int result = userService.create(users);
        log.info("******插入结果*******"+result);
        if (result > 0){
            return new CommonResult(222,"插入数据库成功",null);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }
    @RequestMapping(value = "/user/get")
    public CommonResult getUserId(@RequestParam("User_Id")int User_Id){
        log.info(User_Id+"传值");
        Users users = userService.getUserId(User_Id);
        log.info("******查询结果*******"+users);
        if (users != null){
            return new CommonResult(222,"查询数据库成功",users);
        }else {
            return new CommonResult(444,"查询数据库失败",null);
        }
    }
    @Value("${config.info}")
    private String configInfo;

    @RequestMapping("/config/Info")
    public String getConfigInfo(){
        return configInfo;
    }
}

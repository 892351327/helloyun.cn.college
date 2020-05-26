package hellhoyun.cn.college.controller;


import hellhoyun.cn.college.api.ComUserService;
import helloyun.cn.college.entity.CommonResult;
import helloyun.cn.college.entity.Users;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@ResponseBody
public class OrderController {
    @Autowired
    private ComUserService comUserService;

    @PostMapping(value = "/feign/user/create")
    public CommonResult create(@RequestBody Users users){
        log.info("参数"+users);
        return comUserService.create(users);
    }

    @RequestMapping(value = "/feign/user/get")
    public CommonResult getUserId(int User_Id){
        log.info(User_Id+"传值");
        return comUserService.getUserId(User_Id);
    }
}

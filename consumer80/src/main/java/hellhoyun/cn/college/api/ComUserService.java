package hellhoyun.cn.college.api;

import helloyun.cn.college.entity.CommonResult;
import helloyun.cn.college.entity.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value ="payment-service")
public interface ComUserService {
    @PostMapping(value = "/user/create")
    CommonResult<Users> create(@RequestBody Users users);

    @RequestMapping("/user/get")
    CommonResult getUserId(@RequestParam("User_Id") int User_Id);
}
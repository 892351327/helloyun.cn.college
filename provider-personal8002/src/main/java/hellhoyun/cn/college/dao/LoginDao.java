package hellhoyun.cn.college.dao;

import helloyun.cn.college.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LoginDao {
    //查询
    Users selectUser(@Param("User_Phone") String phone);
    //插入
    int insertUsers(Users users);
}

package helloyun.cn.college.dao;

import helloyun.cn.college.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author  Gaojunlun
 * @create 2020-5-22 22:09:38
 * */
@Mapper
@Repository
public interface UsersDao {
    int create(Users users);
    Users getUserId(@Param("User_Id") int User_Id);
}

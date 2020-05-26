package helloyun.cn.college.entity;

import lombok.*;

import java.io.Serializable;
/**
 * @author  Gaojunlun
 * @create 2020-5-22 22:09:38
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users implements Serializable {
    private int User_Id;
    private String User_Name;
    private String User_Password;
    private String User_Phone;
    private String User_Unit;
    private String User_StatusId;
    private int School_Id;
}

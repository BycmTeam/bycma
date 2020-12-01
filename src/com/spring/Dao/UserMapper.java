package com.spring.Dao;

import com.spring.entity.Home;
import com.spring.entity.Student;
import com.spring.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import java.util.List;
@Component("userMapper")

public interface UserMapper {
    @Select("select * from user")
    public List<User> GetAllUsers();
    @Select("select * from home")
    @Results({
            @Result(column = "home_name", property = "home_name"),
            @Result(column = "home_address",property = "home_address"),
            @Result(
                    property = "student", javaType = Student.class,
                    column = "home_id",
                    one = @One(select = "com.spring.Dao.StudentMapper.GetAllStudent")
            )
    })
    public List<Home> GetAllHome();
    @Insert("insert into home values(#{address},#{name},#{id})")
    public Integer AddAllHome(@Param("address") String address,@Param("name") String name,@Param("id") Integer id);
    //,@Param("id") Integer id
}

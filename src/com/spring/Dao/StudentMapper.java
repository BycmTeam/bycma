package com.spring.Dao;

import com.spring.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import sun.misc.Contended;

import java.util.List;

@Component("studentMapper")
public interface StudentMapper {
    @Select("select * from student where stu_id=#{id}")
    public List<Student> GetAllStudent(Integer id);
    /* private Integer id;
    private String stuname;
    private Integer stuage;
    private String stuclass;
    private Integer stunumber;
    private Integer stu_id;*/
    @Insert("insert into student values(#{id},#{stuname},#{stuage},#{stuclass},#{stunumber},#{stu_id})")
    public Integer InsertStudent(Student student);
    //@Param("id") Integer id, @Param("name") String name,@Param("age") Integer age, @Param("stuclass") String stuclass,@Param("number") Integer number,@Param("stuid") Integer stuid
}

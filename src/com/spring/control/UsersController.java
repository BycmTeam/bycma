package com.spring.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.spring.Dao.StudentMapper;
import com.spring.Dao.UserMapper;
import com.spring.entity.Home;
import com.spring.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.spring.entity.User;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
//@RestController("/user")
public class UsersController {
    //@Resource
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StudentMapper studentMapper;
    public UsersController(){}
     @RequestMapping("/home")
     @ResponseBody
     public  List<Map<String,Object>> GetAllhome(Student student){
        //[{"home_id":1,"home_name":"博雅家园","home_address":"河北省保定市","student":{"id":1,"stuname":"张星烁","stuage":18,"stuclass":"Java班","stunumber":41170417,"stu_id":1}}]
         Integer integer = studentMapper.InsertStudent(student);
         if (integer>0){
             System.out.println("成功");
         }else{
             System.out.println("失败");
         }
         List<Home> homeList = userMapper.GetAllHome();
         List<Map<String,Object>> list =
                 new ArrayList<>();
         for (Home home: homeList
              ) {
             Map<String,Object> map =
                 new HashMap<>();
         map.put("home_id",home.getHome_id());
         map.put("home_address",home.getHome_address());
         map.put("home_name",home.getHome_name());
         map.put("stuage",home.getStudent().getStuage());
         map.put("stuclass",home.getStudent().getStuclass());
         map.put("stuname",home.getStudent().getStuname());
         map.put("stunumber",home.getStudent().getStunumber());
         list.add(map);
     }
        return list;
     }
}

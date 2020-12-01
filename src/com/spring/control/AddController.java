package com.spring.control;

import com.spring.Dao.StudentMapper;
import com.spring.Dao.UserMapper;
import com.spring.entity.Home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/add")
public class AddController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StudentMapper studentMapper;
     @RequestMapping("/addHome")
     @ResponseBody
    public void Addnew(HttpServletRequest request, HttpServletResponse response){
         int a = 3;
        /* String stuname = request.getParameter("stuname");
         String stuage = request.getParameter("stuage");
         int age= Integer.parseInt(stuage);
         String stuclass = request.getParameter("stuclass");
         String stunumber = request.getParameter("stunumber");
         int number= Integer.parseInt(stunumber);
         Integer integer = studentMapper.InsertStudent(number,stuname, age, stuclass, number,number);
         if (integer>0){
             System.out.println("成功stu");
         }else{
             System.out.println("失败stu");
         }*/

         String home_address = request.getParameter("home_address");
         String home_name = request.getParameter("home_name");

         /*int homes = userMapper.AddAllHome(home_address, home_name,number);
         if (homes>0){
             System.out.println("添加成功");
         }else{
             System.out.println("添加失败");
         }*/
       a++;
     }
}

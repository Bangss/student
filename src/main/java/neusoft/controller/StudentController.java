package neusoft.controller;

import neusoft.pojo.Student;
import neusoft.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.util.Date;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

//    @GetMapping("/register")
//    public void get(){}



    @PostMapping("/register")
    public String register( Student student , Model model ) {
        if(studentService.getByEmail(student.getEmail()) != null)
        {
            model.addAttribute("msg" , "邮箱已被注册");
            return "forward:../register.jsp";
        }
//        获取系统时间，YY-MM-DD作为注册时间
        String date = String.valueOf(LocalDate.now());
        student.setRegTime(date);
      boolean flag = studentService.insert(student);
        if (flag)
        {
//            //注册成功
            System.out.println("register succeeded");
            return "forward:../login.jsp";
        }
        else
        {
//            注册失败
            System.out.println("register failed");
            model.addAttribute("msg" , "注册失败");
            return "forward:../register.jsp";
        }
    }

}

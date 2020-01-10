package lingnan.controller;

import neusoft.pojo.Login;
import neusoft.pojo.Student;
import neusoft.service.LoginService;
import neusoft.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;


@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private LoginService loginService;

//    @GetMapping("/register")
//    public void get(){}



    @PostMapping("/register")
    public String register( Login login , Student student , Model model ) {
        if(studentService.getByEmail(student.getEmail()) != null)
        {
            model.addAttribute("msg" , "邮箱已被注册");
            return "forward:../register.jsp";
        }
//        获取系统时间，YY-MM-DD作为注册时间
        String date = String.valueOf(LocalDate.now());
        student.setRegTime(date);
//        login.setId(student.getStuId());
//        System.out.println(student.getStuId());
        boolean flag = studentService.insert(student);
        if (flag)
        {
            //注册成功
            //获取学生id，默认密码000000，权限1
            login.setId(studentService.getByEmail(student.getEmail()).getStuId());
            login.setPassword("000000");
            login.setSup(1);
            loginService.insert(login);
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

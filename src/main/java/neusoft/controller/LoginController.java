package neusoft.controller;

import neusoft.pojo.Login;
import neusoft.pojo.Student;
import neusoft.service.LoginService;
import neusoft.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpSession;
import java.time.LocalDate;

@Controller
@RequestMapping("/unknown")
public class LoginController {

    @Autowired
    private LoginService loginService;
    @Autowired
    private StudentService studentService;

    @PostMapping ( value = "/login")
    public String login( Integer id , String password , Model model ,  HttpSession session)
    {
        Login bean = loginService.login(id,password);
        if(bean != null)
        {
//            登录成功
//            session保存id
            session.setAttribute("id" , id);
            //每次登录都更新一次登录时间
            String date = String.valueOf(LocalDate.now());
            System.out.println(id + "  " + date);
            studentService.updateLastLogTime(id,date);
           if(loginService.getSup(id) == 1)
           {
               return "student";
           }
            else if (loginService.getSup(id) == 2)
           {
               return "teacher";
           }
            else
           {
               return "admin";
           }
        }
        else
        {
//            登录失败
            model.addAttribute("msg" , "用户名或密码错误");
            return "forward:../login.jsp";
        }
    }

    //注销
    @RequestMapping("/logout")
    public String logOut ( HttpSession session){
        session.invalidate();
        return "redirect:../login.jsp";
    }

    //修改密码
    @PutMapping("/updatepass")
    public String updatePassword(String password , String cfmPassword , HttpSession session , Model model) {
        Integer id = (Integer) session.getAttribute("id");
        boolean passFlag = true;
        if(!cfmPassword.equals(password))
        {
            model.addAttribute("msg" , "两次密码不一致");
            passFlag = false;
        }
        boolean flag = loginService.updatePass(id , password);
        if (flag && passFlag)
        {
            model.addAttribute("msg" , "修改成功，重新登录");
            session.invalidate();
            return "redirect:../login.jsp";
        }
        else
        {
            model.addAttribute("msg" , "修改失败");
            return "redirect:../updatepass.jsp";
        }
    }

}

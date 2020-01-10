package lingnan.controller;



import lingnan.pojo.Teacher;
import lingnan.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    //获取一个老师信息
    @PostMapping("/teainfor")
    public String getTeaInformation ( HttpSession session , Model model ) {
        Integer teaId = (Integer) session.getAttribute("id");
        Teacher teacher = teacherService.getById(teaId);
        System.out.println(teacher);
        if(teacher != null)
        {
            model.addAttribute("teaId" , teacher.getTeaId());
            model.addAttribute("teaName" , teacher.getTeaName());
            model.addAttribute("gender" , teacher.getGender());
            model.addAttribute("age" , teacher.getAge());
            model.addAttribute("depId" , teacher.getDepId());
            model.addAttribute("email" , teacher.getEmail());
            model.addAttribute("regTime" , teacher.getRegTime());
            model.addAttribute("lastLogTime" , teacher.getLastLogTime());
           return "forward:../teainfor.jsp";
        }
        else
        {
            return "error";
        }
    }

    //获取所有老师信息
    @PostMapping("/getalltea")
    public String getAll( Model model ) {
        List<Teacher> list = teacherService.getAll();
        if (list != null)
        {
            for (Teacher tea : list) {
                model.addAttribute("teaId" , tea.getTeaId());
                model.addAttribute("teaName" , tea.getTeaName());
                model.addAttribute("gender" , tea.getGender());
                model.addAttribute("age" , tea.getAge());
                model.addAttribute("depId" , tea.getDepId());
                model.addAttribute("email" , tea.getEmail());
                model.addAttribute("regTime" , tea.getRegTime());
                model.addAttribute("lastLogTime" , tea.getLastLogTime());
            }
            return "forward:../getalltea.jsp";
        }
        else
        {
            return "error";
        }
    }

    //删除老师信息
    @DeleteMapping("/deltea")
    public String deleteTeacher( Integer teaId , Model model )  {
        boolean flag = teacherService.deleteById(teaId);
        if( flag )
        {
            model.addAttribute("msg" , "删除成功");
            return "forward:../allteainfor.jsp";
        }
        else
        {
            model.addAttribute("msg" , "删除失败");
            return "error";
        }
    }
}

package neusoft.controller;

import neusoft.pojo.Ask;
import neusoft.service.AskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/ask")
public class AskController {
    @Autowired
    private AskService askService;

    //学生提交请假申请
    @PostMapping("/ask")
    public String ask( Ask ask , HttpSession session , Model model ) {
        Integer stuId = (Integer) session.getAttribute("id");
        System.out.println(stuId);
        ask.setStuId(stuId);
        boolean flag = askService.insert(ask);
        if(flag)
        {
            model.addAttribute("msg" , "已申请，等待审核");
            return "forward:../ask.jsp";
        }
        model.addAttribute("msg" , "申请失败，请重试");
        return "forward:../ask.jsp";
    }

//    学生修改请假原因
    @PutMapping("/updaterea")
    public String updateReason(HttpSession session , Ask ask , Model model) {
        Integer stuId = (Integer) session.getAttribute("id");
        ask.setStuId(stuId);
        boolean flag = askService.updateReason(ask);
        if (flag)
        {
            model.addAttribute("msg" , "修改成功");
            return "forward:../ask.jsp";
        }
        else {
            model.addAttribute("msg" , "修改失败");
            return "forwar:../ask.jsp";
        }

    }

//    取消/删除 请假记录
    @DeleteMapping("/cancel")
    public String cancelAsk(HttpSession session , Model model) {
        Integer stuId = (Integer) session.getAttribute("id");
        List<Integer> list = new ArrayList<Integer>();
        list.add(stuId);
        boolean flag = askService.delete(list);
        if (flag)
        {
            model.addAttribute("msg" , "删除请假记录成功");
            return "forward:../ask.jsp";
        }
        else
        {
            model.addAttribute("msg" , "删除请假记录失败");
            return "forwar:../ask.jsp";
        }
    }

    //老师处理请假申请
    //accept
    @PutMapping(value = "/accept")
    public String acAsk( HttpSession session , Model model) {
        Integer stuId = (Integer) session.getAttribute("id");
        //        sta = 1 表示接受申请
        boolean flag = askService.updateSta(stuId , 1);
        if (flag)
        {
           return "/handleask.jsp";
        }
        return "/handleask.jsp";
    }

    //refuse
    @PutMapping("/refuse")
    public String reAsk(HttpSession session , Model model) {
        Integer stuId = (Integer) session.getAttribute("id");
//        sta = 0 表示拒绝申请
        boolean flag = askService.updateSta(stuId , 0);
        if (flag)
        {
            return "/handleask.jsp";
        }
        return "/handleask.jsp";
    }

    //查询请假记录
    //查询一个
    //老师用
    @GetMapping("/get")
    public String get(Integer stuId , HttpSession session , Model model) {
        Ask ask = askService.getByStuId(stuId);
        if( ask != null )
        {
            return "/handleask.jsp";
        }
        else
        {
            model.addAttribute("msg" , "未能查询到结果");
            return "/handleask.jsp";
        }
    }
    @GetMapping("/getall")
    public String getAll( Model model) {
        List<Ask> askList = askService.getAll();
        for (Ask ask: askList) {
            model.addAttribute("msg" , askList);
        }
        return "/handleask.jsp";
    }

    //查询一个
    //学生用
    @GetMapping("getmine")
    public String getBySession(HttpSession session , Model model) {
        Integer stuId = (Integer) session.getAttribute("id");
        Ask ask = askService.getByStuId(stuId);
        if( ask != null)
        {
            return "forward:../ask.jsp";
        }
        else
        {
            model.addAttribute("msg" , "无请假记录");
            return "error";
        }
    }

}

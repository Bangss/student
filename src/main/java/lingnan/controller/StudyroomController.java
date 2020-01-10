package lingnan.controller;
import lingnan.pojo.Studyroom;
import lingnan.service.StudyroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

@Controller
@RequestMapping("/styroom")
public class StudyroomController {
    @Autowired
    //获取老师的tid和学生的sid
    private StudyroomService studyroomService;
    private static Integer middle;
    private static Integer tid=1;
    private static Integer sid;

    //测试deleteOne  重定向到方法再查询
//    @RequestMapping(value = "/deleteOne")
//    public String deleteOne(@RequestParam Integer rid){
//        boolean flag = studyroomService.deleteOne(rid);
//        System.out.println(flag);
//        return "redirect:selAll";
//    }

    //查找全部科室
    @RequestMapping(value = "/selAll")
    public String selectAllStudyroom(Model model){
        List<Studyroom> l = new ArrayList<Studyroom>();
        l = studyroomService.selectAllStudyroom();
        for (Studyroom a: l) {
            System.out.println(a);
        }
        model.addAttribute("selAll",l);
        return "Studyroom";
    }

    //查找空科室
    @RequestMapping(value = "/selByEmpty0")
    public String selectNotEmpty(Model model){
        List<Studyroom> l = new ArrayList<Studyroom>();
        l = studyroomService.selectNotEmpty();
        for (Studyroom a: l) {
            System.out.println(a);
        }
        model.addAttribute("selEmpty",l);
        return "notEmpty";
    }

    //老师查找待处理科室
    @RequestMapping(value = "/selByEmpty3")
    public String selectDealRoom(Model model){
        List<Studyroom> l = new ArrayList<Studyroom>();
        l = studyroomService.teacherSelectApplyRoom();
        for (Studyroom a: l) {
            System.out.println(a);
        }
        model.addAttribute("dealRoom",l);
        return "dealRoom";
    }

    //学生查找自己申请科室   获取学生的sid
    @RequestMapping(value = "/selBySid")
    public String studentAlreadySel(Integer sid,Model model) {
        List<Studyroom> l = new ArrayList<Studyroom>();
        l = studyroomService.studentAlreadySel(this.sid);
        for (Studyroom a : l) {
            System.out.println(a);
        }
        model.addAttribute("selSid", l);
        return "stuAlreadySel";
    }

    //获取中间值-->辅助函数  对于学生申请科室
    @RequestMapping(value="/middle")
    public  String getMedium(Model model,@RequestParam(value="rid",required=true) Integer rid) {
        middle = rid;
        model.addAttribute("middle",middle);
        System.out.println(middle);
        return "applyRoom";
    }

    //学生申请科室  获取自己sid
    @RequestMapping(value = "/applyRoom")
    public String studentApplyForRoom(@RequestParam(value="rid",required=true) Integer rid,
                                      @RequestParam(value="sid",required=true)Integer sid,
                                      @RequestParam(value="applyTime",required = true)Date applyTime,
                                      @RequestParam(value="returnTime",required=true)Integer returnTime){
        this.sid = sid;
        System.out.println(this.sid);
        boolean flag = studyroomService.studentApplyForRoom(sid,rid,applyTime,returnTime);
        return "redirect:selBySid";
    }

    //学生取消申请科室   获取自己sid
    @RequestMapping(value = "/cancelRoom")
    public String studentCancelRoom(@RequestParam(value="rid",required=true) Integer rid) {
        System.out.println(rid);
        boolean flag = studyroomService.studentCancelRoom(rid);
        System.out.println(flag);
        return "redirect:selBySid";
    }

    //学生查找自己被批准的科室  获取自己sid
    @RequestMapping(value = "/usedRoom")
    public String studentAlreadyUse(Integer sid,Model model) {
        List<Studyroom> l = new ArrayList<Studyroom>();
        l = studyroomService.studentAlreadyUse(this.sid);
        for (Studyroom a: l) {
            System.out.println(a);
        }
        model.addAttribute("returnRoom",l);
        return "returnRoom";
    }

    //学生确认归还科室  获取自己sid
    @RequestMapping(value = "/returnRoom")
    public String studentLeaveStudyroom(@RequestParam(value="sid",required=true)Integer sid) {
        boolean flag = studyroomService.studentLeaveStudyroom(this.sid);
        return "redirect:usedRoom";
    }

    //老师处理科室   有误   获取老师自己的tid
    @RequestMapping(value = "/teaDeal")
    public String teacherDealRoom(@RequestParam(value="isEmpty",required=true) Integer isEmpty,
                                  @RequestParam(value="rid",required=true) Integer rid,
                                  @RequestParam(value="Tid",required=false)Integer tid){
        boolean flag = false;
        //测试假设tid是1  事后获取
        if (isEmpty==1)  {
            flag = studyroomService.teacherDealRoom(1,this.tid,rid);
        }
        else {
            flag = studyroomService.teacherDealRoom(0, null, rid);
        }
        return "redirect:selByEmpty3";
    }

}

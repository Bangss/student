package neusoft.controller;
import neusoft.pojo.Studyroom;
import neusoft.service.StudyroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/styroom")
public class StudyroomController {
    @Autowired
    private StudyroomService studyroomService;

    @RequestMapping(value = "/selAll")
    public String selectAllStudyroom(Model model){
        List<Studyroom> l = new ArrayList<Studyroom>();
        l = studyroomService.selectNotEmpty();
        for (Studyroom a: l) {
            System.out.println(a);
        }
        model.addAttribute("result",l);
        return "Studyroom";
    }

}

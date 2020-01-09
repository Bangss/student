package neusoft.service.impl;

import neusoft.mapper.StudyroomMapper;
import neusoft.pojo.Studyroom;
import neusoft.service.StudyroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StudyroomServiceImpl implements StudyroomService{
    @Autowired
    private StudyroomMapper studyroomMapper;

    //查找全部科室
    public List<Studyroom> selectAllStudyroom() {
        return  studyroomMapper.selectStudyroomByMethod(null,null);
    }

    //查找空科室
    public List<Studyroom> selectNotEmpty() {
        return studyroomMapper.selectStudyroomByMethod(0,null);
    }

    //查找学生自己申请的科室
    public List<Studyroom> studentAlreadyUse(Integer Sid) {
        return studyroomMapper.selectStudyroomByMethod(null,Sid);
    }

    //学生申请科室
    public int studentApplyForRoom(Integer Sid, String Rid, Date ApplyTime, Integer ReturnTime) {
        List<Studyroom> l = new ArrayList<>();
        l = studyroomMapper.selectStudyroomByMethod(0,null);
        return studyroomMapper.studentApplyForRoom(Sid,Rid,new Date(),ReturnTime);
    }

    //学生确认离开科室
    public boolean studentLeaveStudyroom(Integer Sid) {
        return studyroomMapper.studentLeaveStudyroom(Sid);
    }

    //老师查看需要批准的科室
    public List<Studyroom> teacherSelectApplyRoom() {

        return studyroomMapper.selectStudyroomByMethod(3,null);
    }

    //老师处理科室
    public boolean teacherDealRoom(Integer IsEmpty, String Tid, Integer Rid) {

        return studyroomMapper.teacherDealRoom(IsEmpty,Tid,Rid);
    }
}

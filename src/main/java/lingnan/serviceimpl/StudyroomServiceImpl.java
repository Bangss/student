package lingnan.serviceimpl;

import lingnan.mapper.StudyroomMapper;
import lingnan.pojo.Studyroom;
import lingnan.service.StudyroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Date;
import java.util.List;

@Service
public class StudyroomServiceImpl implements StudyroomService{
    @Autowired
    private StudyroomMapper studyroomMapper;

    //测试deleteOne
//    public boolean deleteOne(Integer rid) {
//        return studyroomMapper.deleteOne(rid);
//    }

    //查找全部科室
    public List<Studyroom> selectAllStudyroom() {
        return  studyroomMapper.selectStudyroomByMethod(null,null);
    }

    //查找空科室
    public List<Studyroom> selectNotEmpty() {
        return studyroomMapper.selectStudyroomByMethod(0,null);
    }//

    //查找学生自己申请的科室
    public List<Studyroom> studentAlreadySel(Integer sid) {
        return studyroomMapper.selectStudyroomByMethod(null,sid);
    }

    //学生查找被比准的科室
    public List<Studyroom> studentAlreadyUse (Integer sid) {
        return studyroomMapper.selectStudyroomByMethod(1,sid);
    }
    //学生申请科室
    public boolean studentApplyForRoom(Integer sid, Integer rid, Date applyTime, Integer returnTime) {
        return studyroomMapper.studentApplyForRoom(sid,rid,3,applyTime,returnTime);
    }

    //学生取消申请科室
    public  boolean studentCancelRoom(Integer rid){
        return studyroomMapper.studentApplyForRoom(null,rid,0,null,null);
    }

    //学生确认离开科室
    public boolean studentLeaveStudyroom(Integer sid) {
        return studyroomMapper.studentLeaveStudyroom(sid);
    }

    //老师查看需要批准的科室
    public List<Studyroom> teacherSelectApplyRoom() {
        return studyroomMapper.selectStudyroomByMethod(3,null);
    }

    //老师处理科室
    public boolean teacherDealRoom(Integer isEmpty, Integer tid, Integer rid) {
        return studyroomMapper.teacherDealRoom(isEmpty,tid,rid);
    }
}

package neusoft.service;
import neusoft.pojo.Studyroom;
import java.util.Date;
import java.util.List;

public interface StudyroomService {

        //查找全部科室
        List<Studyroom> selectAllStudyroom();

        //查找全部空科室
        List<Studyroom> selectNotEmpty();

        //查看学生自己已经申请的科室
        List<Studyroom> studentAlreadyUse(Integer Sid);

        //学生申请科室
        int studentApplyForRoom (Integer Sid, String Rid, Date ApplyTime, Integer ReturnTime);

        //学生确认离开科室
        boolean studentLeaveStudyroom(Integer Sid);

        //老师查看需要批准的科室
        List<Studyroom> teacherSelectApplyRoom();

        //老师处理科室
        boolean teacherDealRoom(Integer IsEmpty,String Tid, Integer Rid);
}

package lingnan.service;
import lingnan.pojo.Studyroom;
import java.sql.Date;
import java.util.List;

public interface StudyroomService {
        //测试deleteOne
//        boolean deleteOne(Integer rid);

        //查找全部科室
        List<Studyroom> selectAllStudyroom();

        //查找全部空科室
        List<Studyroom> selectNotEmpty();

        //查看学生自己已经申请的科室
        List<Studyroom> studentAlreadySel(Integer sid);

        //学生查找已经被批准的科室
        List<Studyroom> studentAlreadyUse(Integer sid);

        //学生申请科室
        boolean studentApplyForRoom (Integer sid, Integer rid, Date applyTime, Integer returnTime);

        //学生取消申请科室
        boolean studentCancelRoom(Integer rid);

        //学生确认离开科室
        boolean studentLeaveStudyroom(Integer sid);

        //老师查看需要批准的科室
        List<Studyroom> teacherSelectApplyRoom();

        //老师处理科室
        boolean teacherDealRoom(Integer isEmpty,Integer tid, Integer rid);
}

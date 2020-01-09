package neusoft.mapper;

import neusoft.pojo.Studyroom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface StudyroomMapper {
        //无参查找全部科室 查找空科室  老师查看需要批准的科室 查看学生自己已经申请的科室
        List<Studyroom> selectStudyroomByMethod(@Param("IsEmpty") Integer IsEmpty,@Param("Sid") Integer Sid);

        //学生申请科室
        int studentApplyForRoom (@Param("Sid")Integer Sid, @Param("Rid") String Rid, @Param("ApplyTime") Date ApplyTime,@Param("ReturnTime") Integer ReturnTime);

        //学生确认离开科室
        boolean studentLeaveStudyroom(Integer Sid);

        //老师处理科室
        boolean teacherDealRoom(@Param("IsEmpty") Integer IsEmpty,@Param("Tid") String Tid, @Param("Rid") Integer Rid);
    }


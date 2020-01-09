package lingnan.mapper;

import lingnan.pojo.Studyroom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Mapper
@Repository
public interface StudyroomMapper {
        //无参查找全部科室 查找空科室  老师查看需要批准的科室 查看学生自己已经申请的科室
        List<Studyroom> selectStudyroomByMethod(@Param("isEmpty") Integer isEmpty,@Param("sid") Integer sid);

        //学生申请/取消科室
        boolean studentApplyForRoom (@Param("sid")Integer sid, @Param("rid") Integer rid, @Param("isEmpty") Integer isEmpty,@Param("applyTime") Date applyTime,@Param("returnTime") Integer returnTime);

        //学生确认离开科室
        boolean studentLeaveStudyroom(Integer sid);

        //老师处理科室
        boolean teacherDealRoom(@Param("isEmpty") Integer isEmpty,@Param("tid") Integer tid, @Param("rid") Integer rid);

//        boolean deleteOne(Integer rid);
    }


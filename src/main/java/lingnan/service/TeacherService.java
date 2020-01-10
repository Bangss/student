package lingnan.service;

import lingnan.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherService {
    Teacher getByEmail ( String email );
    boolean updateLastLogTime ( @Param("teaId") Integer teaId, @Param("lastLogTime") String lastLogTime );
    Teacher getById ( Integer teaId );
    List<Teacher> getAll ( );
    boolean deleteById ( Integer teaId );
    boolean delete ( List<Integer> list );
    boolean insert ( Teacher teacher );
    boolean update (Teacher teacher);
}

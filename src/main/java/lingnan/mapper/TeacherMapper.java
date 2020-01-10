package lingnan.mapper;


import lingnan.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherMapper {
    Teacher getByEmail ( String email );
    boolean updateLastLogTime ( @Param("teaId") Integer teaId, @Param("lastLogTime") String lastLogTime );
    Teacher getById ( Integer teaId );
    List<Teacher> getAll ();
    boolean deleteById ( Integer teaId );
    boolean delete ( List<Integer> list );
    boolean insert ( Teacher teacher );
    boolean update (Teacher teacher);
}

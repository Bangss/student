package lingnan.mapper;

import lingnan.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentMapper {
    boolean insert ( Student student );
    Student getByEmail ( String email );
    boolean updateLastLogTime ( @Param("stuId") Integer stuId, @Param("lastLogTime") String lastLogTime );
}

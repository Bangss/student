package lingnan.service;


import lingnan.pojo.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentService {
    boolean insert ( Student student );
    Student getByEmail ( String email );
    boolean updateLastLogTime ( @Param("stuId") Integer stuId, @Param("lastLogTime") String lastLogTime );

}

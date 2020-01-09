package neusoft.mapper;

import neusoft.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentMapper {
    boolean insert(Student student);
    Student getByEmail(String email);
    boolean updateLastLogTime( @Param ("id") Integer id , @Param("lastLogTime") String lastLogTime);
}

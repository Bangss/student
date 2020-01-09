package lingnan.mapper;
import lingnan.pojo.Login;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LoginMapper {
    Login login(@Param("id") Integer id, @Param("password") String password);
    Login getById(Integer id);
    List<Login> getAll();
    boolean updatePass(@Param("id") Integer id, @Param("password") String password);
    boolean deleteById(Integer id);
    boolean delete(List<Integer> list);
    boolean insert(Login login);
    Integer getSup(Integer id);
}

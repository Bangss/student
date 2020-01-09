package neusoft.service;


import neusoft.pojo.Login;
import neusoft.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoginService {
    Login login( Integer id , String password);
    Login getById(Integer id);
    List<Login> getAll();
    boolean updatePass( @Param("id") Integer id , @Param("password") String password);
    boolean deleteById(Integer id);
    boolean delete(List<Integer> list);
    boolean insert(Login login);
    Integer getSup(Integer id);
}

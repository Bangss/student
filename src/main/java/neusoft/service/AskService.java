package neusoft.service;

import neusoft.pojo.Ask;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AskService {
    boolean insert ( Ask ask);
    Ask getByStuId (Integer stuId);
    List<Ask> getAll();
    boolean delete (List<Integer> list);
    boolean updateReason (Ask ask);
    boolean updateSta( @Param("stuId") Integer stuId , @Param("sta") Integer sta);
}

package lingnan.mapper;

import neusoft.pojo.Ask;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AskMapper {
    boolean insert ( Ask ask );
    Ask getByStuId ( Integer stuId );
    List<Ask> getAll ( );
    boolean delete ( List<Integer> list );
    boolean updateReason ( Ask ask );
    boolean updateSta ( @Param("stuId") Integer stuId, @Param("sta") Integer sta );
}

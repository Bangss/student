package neusoft.service.impl;

import neusoft.mapper.AskMapper;
import neusoft.pojo.Ask;
import neusoft.service.AskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AskServiceImpl implements AskService {
    @Autowired
    private AskMapper askMapper;
    @Override
    public boolean insert ( Ask ask ) {
        return askMapper.insert(ask);
    }

    @Override
    public Ask getByStuId ( Integer stuId ) {
        return askMapper.getByStuId(stuId);
    }

    @Override
    public List<Ask> getAll ( ) {
        return askMapper.getAll();
    }

    @Override
    public boolean delete ( List<Integer> list) {
        return askMapper.delete(list);
    }

    @Override
    public boolean updateReason ( Ask ask ) {
        return askMapper.updateReason(ask);
    }

    @Override
    public boolean updateSta ( Integer stuId, Integer sta ) {
        return askMapper.updateSta(stuId , sta);
    }
}

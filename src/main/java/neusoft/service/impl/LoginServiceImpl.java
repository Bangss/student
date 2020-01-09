package neusoft.service.impl;

import neusoft.mapper.LoginMapper;
import neusoft.pojo.Login;

import neusoft.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
    public Login login ( Integer id, String password ) {
        return loginMapper.login(id,password);
    }

    @Override
    public Login getById ( Integer id ) {
        return loginMapper.getById(id);
    }

    @Override
    public List<Login> getAll ( ) {
        return loginMapper.getAll();
    }

    @Override
    public boolean updatePass ( Integer id, String password ) {
        return loginMapper.updatePass(id , password);
    }

    @Override
    public boolean deleteById ( Integer id ) {
        return loginMapper.deleteById(id);
    }

    @Override
    public boolean delete ( List<Integer> list ) {
        return loginMapper.delete(list);
    }

    @Override
    public boolean insert ( Login login ) {
        return loginMapper.insert(login);
    }

    @Override
    public Integer getSup ( Integer id ) {
        return loginMapper.getSup(id);
    }
}

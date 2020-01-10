package lingnan.service.impl;

import lingnan.mapper.TeacherMapper;
import lingnan.pojo.Teacher;
import lingnan.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public Teacher getByEmail ( String email ) {
        return teacherMapper.getByEmail(email);
    }

    @Override
    public boolean updateLastLogTime ( Integer teaId, String lastLogTime ) {
        return teacherMapper.updateLastLogTime(teaId , lastLogTime);
    }

    @Override
    public Teacher getById ( Integer teaId ) {
        return teacherMapper.getById(teaId);
    }

    @Override
    public List<Teacher> getAll ( ) {
        return teacherMapper.getAll();
    }

    @Override
    public boolean deleteById ( Integer teaId ) {
        return teacherMapper.deleteById(teaId);
    }

    @Override
    public boolean delete ( List<Integer> list ) {
        return teacherMapper.delete(list);
    }

    @Override
    public boolean insert ( Teacher teacher ) {
        return teacherMapper.insert(teacher);
    }

    @Override
    public boolean update ( Teacher teacher ) {
        return teacherMapper.update(teacher);
    }
}

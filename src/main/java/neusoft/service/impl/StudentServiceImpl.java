package neusoft.service.impl;

import neusoft.mapper.StudentMapper;
import neusoft.pojo.Student;
import neusoft.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public boolean insert ( Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public Student getByEmail ( String email ) {
        return studentMapper.getByEmail(email);
    }

    @Override
    public boolean updateLastLogTime ( Integer id, String lastLogTime ) {
        return studentMapper.updateLastLogTime(id , lastLogTime);
    }

}

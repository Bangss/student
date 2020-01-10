package lingnan.service.impl;

import lingnan.mapper.StudentMapper;
import lingnan.pojo.Student;
import lingnan.service.StudentService;
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
    public boolean updateLastLogTime ( Integer stuId, String lastLogTime ) {
        return studentMapper.updateLastLogTime(stuId , lastLogTime);
    }

}

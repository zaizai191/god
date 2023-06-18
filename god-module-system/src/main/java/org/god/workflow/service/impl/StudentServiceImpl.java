package org.god.workflow.service.impl;

import org.god.workflow.bean.Student;
import org.god.workflow.mapper.StudentMapper;
import org.god.workflow.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int add(Student student) {
        return studentMapper.add(student);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public int deleteBysno(String sno) {
        return studentMapper.deleteByIds(sno);
    }

    @Override
    public Student queryStudentBySno(String sno) {
        return studentMapper.queryStudentById(sno);
    }
}

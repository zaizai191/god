package org.god.workflow.service;

import org.god.workflow.bean.Student;

public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    Student queryStudentBySno(String sno);
}

package com.toni.PeeperSpringbootReactBackend.Service;

import com.toni.PeeperSpringbootReactBackend.Repository.StudentRepository;
import com.toni.PeeperSpringbootReactBackend.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}

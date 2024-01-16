package com.question4.Question4.Services;

import com.question4.Question4.Entities.Student;
import com.question4.Question4.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public List<Student> getAllStudent(){
       List<Student> students = studentRepo.findAll();
       return students;
    }
    public void addStudent(Student student){
        studentRepo.save(student);
    }
    public void updateStudent(int id , Student student){
        student.setId(id);
        studentRepo.save(student);
    }
    public void deleteStudent(int id){
        studentRepo.deleteById(id);
    }
}

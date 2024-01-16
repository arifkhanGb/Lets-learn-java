package com.question4.Question4.Controllers;

import com.question4.Question4.Entities.Student;
import com.question4.Question4.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class studentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public List<Student> getAllStudent(){
       List<Student> students= studentService.getAllStudent();
       return students;
    }

    @PostMapping("/add")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PutMapping("/update/{id}")
    public void updateStudent(@PathVariable String id, @RequestBody Student student){
        studentService.updateStudent(Integer.parseInt(id), student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id){
        studentService.deleteStudent(Integer.parseInt(id));

    }
}

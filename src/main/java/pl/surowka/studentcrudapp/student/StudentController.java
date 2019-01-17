package pl.surowka.studentcrudapp.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/")
    public List<Student> getAll(){
        Student tempStudent = new Student(1,"Jan","Szybki","3");
        studentRepository.save(tempStudent);

        return studentRepository.findAll();
    }

}

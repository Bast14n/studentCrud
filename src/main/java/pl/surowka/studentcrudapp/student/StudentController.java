package pl.surowka.studentcrudapp.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.surowka.studentcrudapp.mongodb.Student;
import pl.surowka.studentcrudapp.mongodb.StudentRepositoryMongo;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepositoryMongo studentRepository;

    @GetMapping("/")
    public List<Student> getAll(){
        Student tempStudent = new Student(1,"Jan","Szybki","3");
        studentRepository.save(tempStudent);

        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Integer id){
        return studentRepository.findById(id).orElseThrow(()-> new RuntimeException("no such student"));
    }

    @PostMapping("/")
    public void createStudent(@RequestBody Student student){
        studentRepository.save(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Integer id){
        studentRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void updateStudent(@PathVariable Integer id, @RequestBody Student student){
        Student tempStudent = studentRepository.findById(id).orElseThrow(()-> new RuntimeException("no such student"));

        tempStudent.setFirstName(student.getFirstName());
        tempStudent.setLastName(student.getLastName());
        tempStudent.setYearOfStudy(student.getYearOfStudy());

        studentRepository.save(tempStudent);

    }

}

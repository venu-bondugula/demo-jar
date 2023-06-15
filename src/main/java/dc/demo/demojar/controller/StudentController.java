package dc.demo.demojar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dc.demo.demojar.models.Student;
import dc.demo.demojar.services.StudentService;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") long id) {
        return ResponseEntity.of(service.getStudentById(id));
    }

    @GetMapping()
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @PostMapping
    public void createStudent(@RequestBody Student student) {
        service.createStudent(student);
    }

}

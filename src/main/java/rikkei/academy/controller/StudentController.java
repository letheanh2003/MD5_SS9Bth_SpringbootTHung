package rikkei.academy.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import rikkei.academy.model.Student;
import rikkei.academy.service.student.IStudentService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/student")
@CrossOrigin(origins = "*")
public class StudentController {

    private IStudentService studentService;
    @GetMapping
    public List<Student> findAll(){
        List<Student> list = (List<Student>) studentService.findAll();
        return list;
    }
    @PostMapping("/create")
    public Student create(@RequestBody Student student){
        return studentService.save(student);
    }
    @PutMapping("/update")
    public Student update(@RequestBody Student s) {
        Student update = studentService.findById(s.getId()).get();
        if(update != null){
            return studentService.save(s);
        }else {
            return null;
        }
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        studentService.deleteById(id);
    }
}
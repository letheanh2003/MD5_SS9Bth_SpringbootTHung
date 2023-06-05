package rikkei.academy.service.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rikkei.academy.dao.IStudentRepository;
import rikkei.academy.model.Student;

import java.util.Optional;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student save(Student student) {
        studentRepository.save(student);
        return student;
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }
}

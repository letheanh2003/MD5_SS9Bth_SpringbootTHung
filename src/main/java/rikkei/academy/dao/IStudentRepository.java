package rikkei.academy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import rikkei.academy.model.Student;

public interface IStudentRepository extends JpaRepository<Student, Long> {
}

package dc.demo.demojar.respositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dc.demo.demojar.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByName(String name);

    @Query(value = "SELECT SUM(fee), max(fee), min(fee), avg(fee) FROM student", nativeQuery = true)
    Object[] sumOfFee();

}

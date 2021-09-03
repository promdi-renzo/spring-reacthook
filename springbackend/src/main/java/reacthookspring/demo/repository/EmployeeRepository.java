package reacthookspring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import reacthookspring.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

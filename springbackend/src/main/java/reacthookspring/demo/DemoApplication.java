package reacthookspring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reacthookspring.demo.entity.Employee;
import reacthookspring.demo.repository.EmployeeRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private EmployeeRepository repository;

	@Override
	public void run(String... args) throws Exception {

		// Builder Pattern
		// refer to  lombok
		Employee e1 = Employee.builder()
				.firstname("Renzo")
				.lastname("Cabarios")
				.email("sample@gmail.com")
				.build();

		Employee e2 = Employee.builder()
				.firstname("Mairene")
				.lastname("Cabarios")
				.email("sample@gmail.com")
				.build();

		Employee e3 = Employee.builder()
				.firstname("Amos")
				.lastname("Cabarios")
				.email("sample@gmail.com")
				.build();

		repository.save(e1);
		repository.save(e2);
		repository.save(e3);
	}
}

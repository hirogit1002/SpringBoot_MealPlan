package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.entity.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = Employee.builder()
				.firstname("Ramesh")
				.lastname("Fedat")
				.email("Ramesh@gmail.com")
				.build();

		Employee employee2 = Employee.builder()
				.firstname("Tony")
				.lastname("Stark")
				.email("Tony@gmail.com")
				.build();

		Employee employee3 = Employee.builder()
				.firstname("John")
				.lastname("Sena")
				.email("John@gmail.com")
				.build();
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		
	}

}

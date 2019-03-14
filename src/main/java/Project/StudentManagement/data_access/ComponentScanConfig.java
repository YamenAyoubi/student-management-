package Project.StudentManagement.data_access;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan("Project.StudentManagement")
public class ComponentScanConfig {
	
	@Bean
	public Scanner in() {
		return new Scanner(System.in);
	}
	
}
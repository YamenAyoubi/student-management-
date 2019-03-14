package Project.StudentManagement.util;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import Project.StudentManagement.data_access.StudentDao;
import Project.StudentManagement.models.Student;

@ComponentScan
@Service
public class ScannerInputService implements UserInputService{

	private StudentDao dao ;
	
	private List<Student> newList = new ArrayList<>();
	Scanner in = new Scanner (System.in);
	
	@Autowired
	public Student addStudent(int id, String Name) {
		
		for (Student std:newList) {
			
			std.setId(in.nextInt());
			std.setName(in.nextLine());
			return std;
		}
		return dao.save(new Student(id,Name));
	}

}

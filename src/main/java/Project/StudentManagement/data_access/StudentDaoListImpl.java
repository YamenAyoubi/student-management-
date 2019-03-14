package Project.StudentManagement.data_access;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import Project.StudentManagement.models.Student;


@Component
public class StudentDaoListImpl implements StudentDao{

	private List<Student> studentList = new ArrayList<Student>();
	Scanner in = new Scanner (System.in);
	
	public Student find(int id) {
		
		for (Student std : studentList) {
			if (std.getId() == id) {
				return std;
			}
		}
		return null;
	}

	public Student save(Student student) {
			
		if (student == null) {
			throw new IllegalArgumentException();

		} else {
			studentList.add(student);
			System.out.println(student);
			return student;
		}
	}

	
	public void delete(int id) {
		for (Student std : studentList) {
			studentList.remove(std);
			System.out.println("Student Has been Removed");
		}
	}

	public List<Student> findAll() {
		
		return studentList;
	}

}

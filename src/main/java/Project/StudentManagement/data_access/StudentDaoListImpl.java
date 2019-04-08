package Project.StudentManagement.data_access;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import Project.StudentManagement.models.Student;



@Component
public class StudentDaoListImpl implements StudentDao{


	private List<Student> students = new ArrayList<>();
	
	@Override
	public List<Student> find(int id) {
		
		 List<Student> result = new ArrayList<>();
		
		result.stream().filter(x->x.getId()==id);
		
		return result;
	}

	@Override
	public Student save(Student student) {
		students.add(student);
		return student;
	}

	@Override
	public void delete(int id) {
		students = students.stream()
				.filter(s->s.getId()!=id)
				.collect(Collectors.toList());

		
	}

	@Override
	public List<Student> findAll() {
		
		return students;
	}
	
	
}

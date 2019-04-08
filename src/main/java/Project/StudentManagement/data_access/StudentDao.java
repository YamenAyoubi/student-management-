package Project.StudentManagement.data_access;

import java.util.List;

import Project.StudentManagement.models.Student;

public interface StudentDao {
	
	List<Student> find(int id);
	Student save(Student student);
	void delete(int id);
	List<Student> findAll();
}
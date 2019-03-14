package Project.StudentManagement.data_access;

import java.util.List;

import Project.StudentManagement.models.Student;

public interface StudentDao {
	
	Student find(int id);
	Student save(Student student);
	void delete(int id);
	List<Student> findAll();
}
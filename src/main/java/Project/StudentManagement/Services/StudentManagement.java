package Project.StudentManagement.Services;

import java.util.List;

import Project.StudentManagement.models.Student;

public interface StudentManagement {

	Student create();
	Student save(Student student);
	List<Student>  find(int id);
	Student remove(int id);
	List<Student> findAll();
	Student edit(Student student);
}



package Project.StudentManagement.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project.StudentManagement.data_access.StudentDao;
import Project.StudentManagement.models.Student;
import Project.StudentManagement.util.UserInputService;


public class StudentManagementConsoleImpl implements StudentManagement{
	
	UserInputService scannerService;
	StudentDao studentDao;
	
	@Override
	public Student create() {
		
		return null;
	}
	@Override
	public Student save(Student student) {
		
		return studentDao.save(student);
	}
	@Override
	public Student find(int id) {
		
		return studentDao.find(id);
	}
	@Override
	public Student remove(int id) {
		studentDao.find(id);
		studentDao.delete(id);
		
		return (Student) studentDao.findAll();

	}
	@Override
	public List<Student> findAll() {
		
		return studentDao.findAll();
	}
	@Override
	public Student edit(Student student) {
		
		return null;
	}
	
	
	

}

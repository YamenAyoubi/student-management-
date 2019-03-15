package Project.StudentManagement.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import Project.StudentManagement.data_access.StudentDao;
import Project.StudentManagement.models.Student;
import Project.StudentManagement.util.UserInputService;

@Component
public class StudentManagementConsoleImpl implements StudentManagement{
	
	UserInputService scannerService;
	StudentDao studentDao;
	
	@Override
	public Student create() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Student find(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Student remove(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Student edit(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}

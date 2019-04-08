package Project.StudentManagement.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Project.StudentManagement.data_access.StudentDao;
import Project.StudentManagement.models.Student;
import Project.StudentManagement.util.UserInputService;

@Service
public class StudentManagementConsoleImpl implements StudentManagement{
	
	private UserInputService scannerService;
	private StudentDao studentDao;
	
	@Autowired
	public StudentManagementConsoleImpl(UserInputService scannerService, StudentDao studentDao) {
		super();
		this.scannerService = scannerService;
		this.studentDao = studentDao;
	}
	@Override
	public Student create() {
		
		return studentDao.save(new Student(scannerService.getInt(), scannerService.getString()));
	}
	@Override
	public Student save(Student student) {
		
		return studentDao.save(student);
	}
	@Override
	public List<Student> find(int id) {
		
		return studentDao.find(id);
	}
	@Override
	public Student remove(int id) {
		Student std = (Student) find(id);
		studentDao.delete(id);
		return std;
	}
	@Override
	public List<Student> findAll() {
		
		return studentDao.findAll();
	}
	@Override
	public Student edit(Student student) {
		student.setName(scannerService.getString());
		return student;
	}

}

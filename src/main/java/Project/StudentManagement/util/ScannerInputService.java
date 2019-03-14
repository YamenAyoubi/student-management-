package Project.StudentManagement.util;


import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import Project.StudentManagement.data_access.StudentDao;
import Project.StudentManagement.models.Student;

@Component
public class ScannerInputService implements UserInputService{

	private Scanner in;
	
	@Autowired
	public ScannerInputService(Scanner in) {
		this.in=in;
	}

	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return in.nextLine();
	}

	@Override
	public int getInt() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
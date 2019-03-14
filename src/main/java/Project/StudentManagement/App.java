package Project.StudentManagement;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Project.StudentManagement.data_access.ComponentScanConfig;
import Project.StudentManagement.data_access.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	AnnotationConfigApplicationContext context = 
    			new AnnotationConfigApplicationContext(ComponentScanConfig.class);
    	
    	StudentDao studentDao = context.getBean(StudentDao.class);
    	
    }
}

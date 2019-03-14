package Project.StudentManagement.models;

public class Student {

	int id;
	String Name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	public int getId() {
		return id;
	}

	public int setId(int id) {
		return this.id = id;
	}

	public String getName() {
		return Name;
	}

	public String setName(String name) {
		return Name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + "]";
	}
	
}
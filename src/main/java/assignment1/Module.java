package assignment1;

public class Module {
	private String name;
	private int id;
	private Student[] studentList;
	
	public Module(String name, int id, Student[] students) {
		this.setName(name);
		this.setId(id);
		this.setStudentsList(students);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student[] getStudentsList() {
		return studentList;
	}

	public void setStudentsList(Student[] studentsList) {
		this.studentList = studentsList;
	}
}

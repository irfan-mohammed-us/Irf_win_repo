package packMobileAccount;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
	private String className ;private int roomNumber;
	private List<Studen2> students = new ArrayList<>();
	
	public Classroom(String className,int roomNumber) {
		this.className = className; this.roomNumber=roomNumber;}
	
	public void addStudent(Studen2 student) {
		students.add(student);
		for(Studen2 st:students) {
			st.displayStudentInfo();
		}
	}

}

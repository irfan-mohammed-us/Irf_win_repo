package practiceChatgpt;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String companyName;
	private List<Employee> employees = new ArrayList<>();
	public Company(String cmp) {this.companyName = cmp;}
	public void addEmployee(Employee emp) {
		employees.add(emp);
			}
	public void displayAllEmployees() {
		for(Employee e:employees) {
			e.displayEmployeeInfo();
		}
	}
}


package inheritance_2_10;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		customer.age = 12;
		employee.age = 25;

		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		customerManager.Add();
		employeeManager.Add();

	}

}

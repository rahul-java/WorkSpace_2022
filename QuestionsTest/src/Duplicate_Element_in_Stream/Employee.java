package Duplicate_Element_in_Stream;

public class Employee {

	private int id;
	private long salary;
	private String name;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, long salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	
	
	
	
}

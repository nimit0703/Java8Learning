package Java8;

public class Employee {
	
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", joiningMonth=" + joiningMonth + ", joiningYear="
				+ joiningYear +"\n";
	}
	public Employee(int id, String name, String joiningMonth, String joiningYear) {
		super();
		this.id = id;
		this.name = name;
		this.joiningMonth = joiningMonth;
		this.joiningYear = joiningYear;
	}
	private int id;
	private String name;
	private String joiningMonth;
	private String joiningYear;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJoiningMonth() {
		return joiningMonth;
	}
	public void setJoiningMonth(String joiningMonth) {
		this.joiningMonth = joiningMonth;
	}
	public String getJoiningYear() {
		return joiningYear;
	}
	public void setJoiningYear(String joiningYear) {
		this.joiningYear = joiningYear;
	}


}

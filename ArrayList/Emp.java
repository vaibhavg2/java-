package ArrayList;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Emp {
	private int id;
	private String name;
	private double salary;
	private Depatment dept;
	private Date joinDate;
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	
	public Emp(int id, String name,double salary, Depatment dept, Date joinDate) {
		super();
		this.id = id;
		this.name=name;	
		this.salary = salary;
		this.dept = dept;
		this.joinDate = joinDate;
	}
	public Emp(int id) {
		super();
		this.id=id;
	}
	@Override
	public String toString() {
		return "Emp [id=%.2" + id + ", name="+name+ ", salary=" + salary + ", dept=" + dept + ", joinDate=" + sdf.format(joinDate) + "]";
	} 
	public boolean equals(Object o) {
		System.out.println("in emo equals");
		if(o instanceof Emp)
			return this.id==((Emp)o).id;
		return false;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Depatment getDept() {
		return dept;
	}
	public void setDept(Depatment dept) {
		this.dept = dept;
	}
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
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public static SimpleDateFormat getSdf() {
		return sdf;
	}
	public static void setSdf(SimpleDateFormat sdf) {
		Emp.sdf = sdf;
	}
	
}

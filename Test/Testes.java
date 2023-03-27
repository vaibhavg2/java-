package Test;

import java.util.ArrayList;
import java.util.Scanner;
import ArrayList.Emp;
import static ArrayList.Depatment.valueOf;
import static ArrayList.Emp.sdf;


public class Testes {
public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in)) {
		ArrayList<Emp> empList=new  ArrayList<>();
		   
		System.out.println("Enter emp details: id,name,salary,deptId,joinDate(day-mon-yr)");
		empList.add(new Emp(sc.nextInt(), sc.next(), sc.nextDouble(),valueOf(sc.next().toUpperCase()),sdf.parse(sc.next())));
		System.out.println("Emp List content"+empList);
	}catch (Exception e) {
		// TODO: handle exception
	e.printStackTrace();
	}
	
}
}

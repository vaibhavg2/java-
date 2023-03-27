package Test;

import static utils.CollectionUtils.populatedEmpData;

import java.util.ArrayList;
import java.util.Scanner;

import ArrayList.Emp;

public class RemoveEmp {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Emp> list = populatedEmpData();
			System.out.println("Employee list is:");
			for (Emp e : list)
				System.out.println(e);

			System.out.println("Enter salery limit to remove employee");
			double sal = sc.nextDouble();
			for (Emp emp : list)
			{
				System.out.println("each="+emp.getName());
				if (emp.getSalary() > sal)
				{
					list.remove(emp);//not able to do throw for each loop
					System.out.println("Employee removed=" + emp.getName());
				}
			}
			System.out.println("list after removel of employee");
			for (Emp emp : list)
				System.out.println(emp);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

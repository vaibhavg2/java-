package Test;

import static utils.CollectionUtils.populatedEmpData;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import ArrayList.Emp;

public class RemoveEmp2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Emp> list = populatedEmpData();
			System.out.println("Employee list is:");
			
			for (Emp e : list)
				System.out.println(e);

			System.out.println("Enter salery limit to remove employee");
			double sal = sc.nextDouble();
			Iterator<Emp> itr=list.iterator();
			
			while(itr.hasNext()) {
				var s=itr.next();
				System.out.println(s.getName());
				if(s.getSalary()>sal) {
					itr.remove();
					System.out.println("removed employee from organization=" +s.getName());
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

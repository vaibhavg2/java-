package Test;

import java.util.ArrayList;
import java.util.Scanner;

import ArrayList.Depatment;
import ArrayList.Emp;
import static ArrayList.Depatment.valueOf;
import static ArrayList.Emp.sdf;
import static utils.CollectionUtils.populatedEmpData;
import Test.*;
import coustem_exception.EmpHandlingException;


public class EmpManagement {
public static void main(String[] args) throws EmpHandlingException {
	try(Scanner sc=new Scanner(System.in)) {
		ArrayList<Emp> empList=populatedEmpData();
		   boolean exit=false;
		   while(!exit) {
			   System.out.println("Output: 1.Add Emp Details 2.Display All emp Detalis 3.Get Specified Emp details 4.Pramotion 5.Delete employee 0.exit");
		   try {
			   switch(sc.nextInt()) {
			   case 1:
			   System.out.println("Enter emp details: id,name,salary,deptId,joinDate(day-mon-yr)");
			   empList.add(new Emp(sc.nextInt(),sc.next(),sc.nextDouble(), valueOf(sc.next().toUpperCase()),sdf.parse(sc.next())));
			   break;
			   
			   case 2:
				   System.out.println("Employ deatails");
				   for(Emp e:empList)
					   System.out.println(e);
				   break;
				   
			   case 3:
				   System.out.println("Enter emp Id ,to fatch details");
				   int index=empList.indexOf(new Emp(sc.nextInt()));
				   if(index==-1) {
					   
					   throw new EmpHandlingException("Data is not found!!!!");
				   }
				   System.out.println("Emp detailsd"+empList.get(index));
				   break;
				   
			   case 4:
				   System.out.println("Enter Employee Id, salery and increment Dept");
				   int id=sc.nextInt();
				   double salInc=sc.nextDouble();
				   Depatment dept=valueOf(sc.next().toUpperCase());
				   index=empList.indexOf(new Emp(id));
				   if(index==-1) 
					   throw new EmpHandlingException("Data is not found!!!!");
				   Emp emp=empList.get(index);
				   emp.setSalary(emp.getSalary()+salInc);
				   emp.setDept(dept);
				   System.out.println("Updated record");
				   break;
				   
			   case 5:
				   System.out.println("Give Employee details to remove from record");
				   int remId=sc.nextInt();
				   index=empList.indexOf(new Emp(remId));
//				   if(empList.size()!=0)
				   
				   if(index==-1) 
					   throw new EmpHandlingException("Data is not found!!!!");
				   System.out.println("deta removed"+empList.remove(index));;
			   
			   break;
				   
			   case 0:
				   System.out.println("Thanku!!!!!");
				   exit=true;
			    break;
			   }
		   }catch(Exception e) {
			   e.printStackTrace();
		   }
		   sc.nextLine();
		   }
		   }
	catch(Exception el) {
		el.printStackTrace();
	}
}
	
}

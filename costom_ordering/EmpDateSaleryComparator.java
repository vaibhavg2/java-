package costom_ordering;

import java.util.Comparator;
import ArrayList.*;

public class EmpDateSaleryComparator implements Comparator<Emp> {
	public int compare(Emp o1,Emp o2) {
		
	System.out.println("compre by date");
	
//	if(o1.getJoinDate().before(o1.getJoinDate()))
//		return -1;
//	if(o1.getJoinDate().after(o1.getJoi nDate()))
//		return 1;
//	return 0;
//	insted of using comapre to fun
	int  retVal=o1.getJoinDate().compareTo(o2.getJoinDate());
	if(retVal==0)
	{
//		if(o1.getSalary()<o2.getSalary())
//			return -1;
//		if(o1.getSalary()==o2.getSalary())
//			return 0;
//		return 1;
		retVal=((Double)o1.getSalary()).compareTo(o2.getSalary());
	
	}
	return  retVal;
	}

}

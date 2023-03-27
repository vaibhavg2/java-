package costom_ordering;

import java.util.Comparator;
import ArrayList.*;

public class EmpSaleryComparetor implements Comparator<Emp> {
	
	public int compare(Emp e1, Emp e2) {
		System.out.println("E1="+e1.getSalary());
		System.out.println("E2="+e2.getSalary());
		System.out.println("in Compare");
		if(e1.getSalary()<e2.getSalary())
			return -1;
		if(e1.getSalary()==e2.getSalary())
			return 0;
			return 1;
	}

}

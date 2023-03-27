package Test;

//import java.ArrayList.Emp;


import ArrayList.Emp;
//import utils.CollectionUtils.*;
import static utils.CollectionUtils.populatedEmpData;

import java.util.ArrayList;
import java.util.Iterator;

public class TestItretor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ArrayList<Emp> list = populatedEmpData();
//			ArrayList<Emp> list=populetedEmpData();
			System.out.println(list);
			Iterator<Emp> itr=list.iterator();
			while(itr.hasNext()) 
				System.out.println(itr.next()); 
				System.out.println("end of list....");
				System.out.println(itr.next());
//			}			
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		
	}



}

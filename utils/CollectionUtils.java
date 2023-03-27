package utils;

import java.text.ParseException;
import java.util.ArrayList;
import ArrayList.Depatment;
import ArrayList.Emp;
import static ArrayList.Depatment.*;

import static ArrayList.Emp.sdf;;


public class CollectionUtils {
	//add static method to return populated list
//	(int id, String name,double salary, Depatment dept, Date joinDate)
	public static ArrayList<Emp> populatedEmpData()throws ParseException{
		ArrayList<Emp> list=new ArrayList<>();
		list.add(new Emp(15, "Vaibhav", 220000 , Depatment.SALES,sdf.parse("1-1-2022") ));
		list.add(new Emp(16, "Sourabh", 220001 , Depatment.HR,sdf.parse("2-1-2022") ));
		list.add(new Emp(17, "Ashish", 220002, Depatment.MARKETING,sdf.parse("3-1-2022") ));
		list.add(new Emp(18, "Rushi", 220003, Depatment.RAN,sdf.parse("4-1-2022") ));
		list.add(new Emp(19, "Kalyan", 220004 , Depatment.SALES,sdf.parse("5-1-2022") ));
		list.add(new Emp(20, "Akshay", 220005 , Depatment.MARKETING,sdf.parse("6-1-2022") ));
		
		return list;
	}
	
}

package Test;
import ArrayList.Depatment;
import ArrayList.Emp;
import static ArrayList.Emp.sdf;
import static utils.CollectionUtils.populatedEmpData;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class TestItretor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc= new Scanner(System.in)) {
			
			ArrayList<Emp> list = populatedEmpData();
			System.out.println("list content");
			for(Emp e:list) 
				System.out.println(e);
			System.out.println("enter depatrment n join date");
			Depatment dept=Depatment.valueOf(sc.next().toUpperCase());
			Date joinDate=sdf.parse(sc.next());
			System.out.println("Emp name form"+dept+"join date"+sdf.format(joinDate));
			Iterator<Emp> itr=list.iterator();
//			while(itr.hasNext()) {
//				Emp e=itr.next();
//				if(e.getDept().equals(dept)&&e.getJoinDate().after(joinDate))
//				System.out.println(e.getName());		
//			}
			for(Emp s:list) {
				if(s.getDept().equals(dept)&&s.getJoinDate().after(joinDate))
					System.out.println(s.getName());
			}
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		
	}



}

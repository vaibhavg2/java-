package Genric_method;

import java.util.List;
import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList();
		System.out.println(list1);
		Integer[] data = { 10, 20, 30, 40 };
		List<Integer> list2 = Arrays.asList(data);
		System.out.println(list2);
//		list2.remove(0);
		List<Integer> list3 = Arrays.asList(10,20,30,40);
		list3.set(0, 3333);
		System.out.println(list3);
		
		
	}
}

package java_20190730;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		         //<Generic>선언
		list.add(1);
		list.add(2);
		list.add(3);
		//list.add("4");
		
		for(int i =0; i<list.size();i++) {
			Integer temp = list.get(i);//Generic을 선언하면 (Integer)list.get(i); Integer빼도 됨.
			System.out.println(temp);
		}
	}

}

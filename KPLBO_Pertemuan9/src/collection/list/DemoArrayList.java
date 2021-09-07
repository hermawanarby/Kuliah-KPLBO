package collection.list;

import java.util.ArrayList;

public class DemoArrayList {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>(); 
		ar.add("A");
		ar.add("B");
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
	}
}

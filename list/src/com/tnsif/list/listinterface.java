package com.tnsif.list;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
public class listinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		List<Integer> ll=new ArrayList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(3);
		//ll.add("SriIndu");
		//ll.add(3.4f);
		//ll.add("true");
		for(int i:ll) {
		System.out.println("elements in List interface"+i);
		}
		//LinkedList
		List<Integer> l=new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(3);
		System.out.println("Before Deletion");
		for(int i:l) {
		System.out.println(i);
		}
		l.remove(1);
		System.out.println("After Deletion");
		for(int i:l) {
		System.out.println(i);
		}
	}
}

	
		

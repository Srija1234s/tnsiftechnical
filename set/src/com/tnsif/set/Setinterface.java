package com.tnsif.set;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;
public class Setinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> ll=new HashSet<Integer>();
				ll.add(1);
				ll.add(2);
				ll.add(3);
				ll.add(3);
				for(int i:ll) {
				System.out.println("elements in Set interface"+i);
				}
				System.out.println("exceution using LinkedHashset");
				Set<Integer> l=new LinkedHashSet<Integer>();
				l.add(1);
				l.add(2);
				l.add(3);
				l.add(3);
				for(int i:l) {
				System.out.println(i);
				}
				System.out.println("exceution using Treeset");
				SortedSet<Integer> ts=new TreeSet<Integer>();
				ts.add(1);
				ts.add(2);
				ts.add(3);
				ts.add(3);
				for(int i:ts) {
				System.out.println(i);
				}
				}

}

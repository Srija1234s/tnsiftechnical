package com.tnsif.memoryequalling;

public class Memory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String poolString1 = "sriindu";
		String poolString2 = "sriindu";
		String heapString = new String("sriindu");
		String internedString = heapString.intern();
		System.out.println("poolString1 == poolString2: " + (poolString1 == poolString2)); 
		System.out.println("poolString1 == heapString: " + (poolString1 == heapString));  
		System.out.println("poolString1 == internedString: " + (poolString1 == internedString)); 
		System.out.println("poolString1.equals(heapString): " + poolString1.equals(heapString)); 


			}

	}


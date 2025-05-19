package com.tnsif.variable;

import com.tnsif.variables.Var;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Var object=new Var();
		object.numone=4;
		object.number=5;
		int result=object.numone=6;
		System.out.println("instance variable output"+result);
		object.display();
		System.out.println("static variable output"+Var.numthree);
				

}

}

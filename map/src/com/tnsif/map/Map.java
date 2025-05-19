package com.tnsif.map;
import java.util.HashMap;
public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,Integer> a=new HashMap<String,Integer>();
a.put("ECE",80);
a.put("CSE",56);
a.put("EEE",69);
a.put("CIVIL",70);
System.out.println("Subject Marks");
for(HashMap.Entry<String, Integer>entry:a.entrySet()) {
System.out.println(entry.getKey()+","+entry.getValue());
}
}

}

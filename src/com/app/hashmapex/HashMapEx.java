package com.app.hashmapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(1,"Grapes"); 
		   
//		   Set set = map.entrySet();
//		   Iterator itr = set.iterator();
//		   while(itr.hasNext()) {
//			   Map.Entry<Integer, String> m = (Entry<Integer, String>) itr.next();
//			   System.out.println(m.getKey()+" "+m.getValue());
//		   }
//	
//		   for(Map.Entry<Integer, String> m : map.entrySet()) {
//			   System.out.println(m.getKey()+" "+m.getValue());
//		   }

		   String s1= "x";
		   String s2 = new String("x");
		   System.out.println(s1 == s2);
		   System.out.println(s1.equals(s2));
	}
}

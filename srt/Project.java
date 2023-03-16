package org.srt;

import java.util.Scanner;



import java.util.ArrayList;
import java.util.Iterator;

public class Project{

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("Size "+list.size());
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		list.add("apple");
		list.add(null);
		
		System.out.println("After adding elements "+list.size());
		System.out.println(list);
		System.out.println("elemnt at Index 4: "+list.get(4));
		list.add(4, "pizza");
		System.out.println(list);
		System.out.println("List contains apple? "+list.contains("apple"));
		
		list.remove(0);
		list.remove(null);
		System.out.println(list);
		
		//foreach loop
		for(String s:list)
		{
			System.out.println("Item:"+s);
		}
		System.out.println("Foreach end");
		
		//iterate using iterator	
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
}

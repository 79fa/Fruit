package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Fruit> fl=new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		
		
		Fruit s1=new Fruit(101,"Apple",10);
		fl.add(s1);
		
		Fruit s2=new Fruit(101,"Orange",500);
		fl.add(s2);
		
		Fruit s3=new Fruit(101,"Peach",700);
		fl.add(s3);
		
		Fruit s4=new Fruit(101,"Banana",80);
		fl.add(s4);
		
		Fruit s5=new Fruit(101,"Melon",90);
		fl.add(s5);
		
		Fruit s6=new Fruit(101,"Pineapple",101);
		fl.add(s6);
		
		Fruit s7=new Fruit(101,"Applemango",1030);
		fl.add(s7);
		
		Fruit s8=new Fruit(101,"Mango",1200);
		fl.add(s8);
		
		Fruit s9=new Fruit(101,"Strawberry",10090);
		fl.add(s9);
		
		Fruit s10=new Fruit(101,"Blueberry",2000);
		fl.add(s10);
		
		Collections.sort(fl,new FruitComparator());
		
		for(Fruit s:fl) {
			System.out.println(s.toString());
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}

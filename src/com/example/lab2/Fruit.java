package com.example.lab2;
import java.util.Comparator;

public class Fruit {
	int no;
	String name;
	int price;
	
	public Fruit(int no1,String name1,int price1) {
		no=no1;
		name=name1;
		price=price1;
	}
	
	public String toString() {
		
		String a=""+this.no+" "+name+" "+price;
		return a;
	}
	
	

	

}

class FruitComparator implements Comparator<Fruit>{
	public int compare(Fruit o1,Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
}
/*
class FruitComparatorDesc implements Comparator<Fruit>{
	public int compare(Fruit o1,Fruit o2) {
		return o2.name.compareTo(o1.name);
	}
}
*/
package Basics;

import java.util.ArrayList;

class Main 
{

	public static int square(int a)
	{
		return a*a;
	}

public static void main(String[] args) 
	{
	ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
	for(int num: numbers)
	{
	System.out.println(square(num));
	}
System.out.println("Before Update: "+numbers);
	for(int i=0;i<=numbers.size()-1;i++)
	{
		numbers.set(i,square(numbers.get(i)));
	}
System.out.println("Updated list: "+numbers);
}
}
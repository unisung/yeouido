package ch02;

import java.util.Arrays;

public class MyCloneEx {
	public static void main(String[] args) {
		Car[] mycars= { new Car(),new Car(),new Car()};
		Car[] newcars =mycars.clone();
		newcars[0].model="±×·»Àú";
		for(int i=0;i<newcars.length;i++)
			System.out.println(newcars[i]);
		
		for(int i=0;i<mycars.length;i++)
			System.out.println(mycars[i]);
	}
}
class Car{
	String model="sonata";
	int[] arr = {1,2,3,4};
	
	@Override
	public String toString() {
		return model+Arrays.toString(arr);
	}
}
package ch02;

public class ArrEx {
public static void main(String[] args) {
	double[] arr=new double[5];
	double[] arr2=arr;
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	
	for(int i=0;i<arr2.length;i++)
		System.out.println(arr2[i]);
	
	double[] arr3=new double[5];
	double[] arr4=new double[arr3.length];
	for(int i=0;i<arr3.length;i++)
		System.out.println(arr3[i]);
	
	for(int i=0;i<arr4.length;i++)
		System.out.println(arr4[i]);
	
}
}

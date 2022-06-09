package ch03;

import java.util.Arrays;

public class ArraySortEx {
	public static void main(String[] args) {
	int[] arr = {35, 20, 15, 70, 65, 100};
	//임시저장 변수
	int temp;
	//이중 for문
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			 if(arr[i]>arr[j]) {
				 temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
		}
	}
	   for(int k:arr)
		   System.out.print(k+"\t");
	  
	   System.out.println("\n--------------------------------");
		System.out.println(Arrays.toString(arr));
	}
}

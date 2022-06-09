package ch02;

import java.util.Arrays;

public class ArrayExam5 {
	public static void main(String[] args) {
	int[] intArr =new int[5];
	int[] intArr2 =new int[5];
	
	int[] myarr =new int[intArr.length+intArr2.length];
	
    intArr[0]=1; intArr[1]=2; intArr[2]=2; intArr[3]=3;intArr[4]=4;
    intArr2[0]=5; intArr2[1]=6; intArr2[2]=7; intArr2[3]=8;intArr2[4]=9;

    //각 요소들을 복사
    for(int i=0;i<intArr.length;i++)
    	myarr[i]=intArr[i];
    System.out.println("---------------------");
    for(int i=0;i<intArr2.length;i++) {
    	   myarr[intArr.length+i]=intArr2[i];
    }
    //타입[] 새배열변수 = Arrays.CopyOf(원본배열,길이);
    int[] newArr=Arrays.copyOf(myarr, myarr.length);
    
    for(int i=0;i<newArr.length;i++) {
    	System.out.println(newArr[i]);
    }
    
	}
}

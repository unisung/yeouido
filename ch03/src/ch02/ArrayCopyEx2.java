package ch02;

public class ArrayCopyEx2 {
  int[] myArr = {1,2,3,4};
  
  void myCalc() {
    myFunc(myArr);
    for(int i=0;i<myArr.length;i++)
         System.out.println(myArr[i]); 
  }
  
  int[] myFunc(int[] arr) {
	  int[] temp=new int[arr.length];
	  for(int i=0;i<arr.length;i++)
		    temp[i] = arr[i];
	  temp[2]=9;
	  return arr;
  }
  
  public static void main(String[] args) {
	  ArrayCopyEx2 ex=new ArrayCopyEx2();
	  ex.myCalc();
  }
}

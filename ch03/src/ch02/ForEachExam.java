package ch02;

public class ForEachExam {
	public static void main(String[] args) {
	 int[] arr= {1,2,3,4,5};
	 
	 //for-each문
	 int i=0;
	 for(int k : arr) {
		 System.out.println(k);
		 System.out.println(i);
		 i++;
	 }
	 
	 double[] dArr = {0.1, 0.2, 0.3, 9.9};
	 
	 for(double d :dArr) {
		 System.out.println(d);
	 }	 

	 String[] greets = {"hello","hi","bye","me"};
	 //for-each문으로 작성
	 for(String s:greets) {
		 System.out.println(s);
	 }
	 
	 // int[] arr= {1,2,3,4,5};
	 //arr배열의 모든 요소들의 합 출력
	 //for-each문
	 int sum=0;
	 for(int k:arr)  sum+=k;

	 sum=0;
	 for(int k=0;k<arr.length;k++) {
		 sum+=arr[k];
	 }
	 
	 System.out.println("합계="+sum);
	 
	}
}

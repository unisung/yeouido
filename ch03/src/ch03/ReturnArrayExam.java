package ch03;

public class ReturnArrayExam {
	//static장소 지정자, int[]타입 리턴값, makeArry함수명(),매개변수 받지않음.
	static int[] makeArray() {
		int[] temp = new int[4];
		for(int i=0;i<temp.length;i++)
			temp[i] = i+1;
		
		return temp;
	}
	
	public static void main(String[] args) {
		int[] intArr = new int[4];
		intArr = makeArray();
		
		for(int k:intArr)
			System.out.print(k+" \t");
        
		//정렬
		
	}
}

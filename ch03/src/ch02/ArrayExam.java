package ch02;

public class ArrayExam {
	public static void main(String[] args) {
	//로컬 선언과 동시에 배열객체 생성하여 초기화
		int intArr[]=new int[5];
	    intArr[1] = 10;
	    intArr[1] = 20;
	    
	//배열 참조 로컬변수 선언
	int intArr2[];
	//배열객체 생성하여 로컬변수에 대입(초기화)
	intArr2=new int[5];
	
	
	//배열의 타입이 초기값으로 배열의 각 요소들이 초기화.
	for(int i=0;i<5;i++)
		System.out.println(intArr[i]);
	
	
	double doubleArr[] = new double[5];
	doubleArr[3]=5.5;
	doubleArr[3]=9.9;
	for(int i=0;i<5;i++)
		System.out.println(doubleArr[i]);
	//배열의 각요소들은 선언된 배열타입의 기본값으로 초기화됨.
	boolean boolArr[] =new boolean[5];
	boolArr[0]=true;
	boolArr[0]=false;
	for(int i=0;i<5;i++)
		System.out.println(boolArr[i]);
	
	
	String[] strArr = new String[5];
	strArr[2] = "hello";
	strArr[2] = "hi";
	strArr[2] = null;
	for(int i=0;i<5;i++)
		System.out.println(strArr[i]);
	
	
	
	
	
	

	}

}

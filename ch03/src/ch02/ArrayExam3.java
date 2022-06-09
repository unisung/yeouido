package ch02;

public class ArrayExam3 {
	public static void main(String[] args) {
	int[] intArr =new int[5];
	int[] myarr = intArr;

    intArr[0]=1; intArr[1]=2; intArr[2]=2; intArr[3]=3;intArr[4]=4;
    for(int i=0;i<intArr.length;i++)
        System.out.println(intArr[i]);
    
    for(int i=0;i<myarr.length;i++)
        System.out.println(myarr[i]);

    myarr[2] = 9;
     
    System.out.println("------------------------");
    for(int i=0;i<intArr.length;i++)
        System.out.println(intArr[i]);
    
    for(int i=0;i<myarr.length;i++)
        System.out.println(myarr[i]);
    }	

}

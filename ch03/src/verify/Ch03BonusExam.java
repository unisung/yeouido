package verify;

public class Ch03BonusExam {
	public static void main(String[] args) {
		int intArray[][];  // 2���� ���� �迭 ����
		intArray = new int[3][4]; // intArray�� 3x4 ���� �迭 ����
		
		// 12���� ������ �����ϰ� �߻����� �迭�� ������� �����Ѵ�. 
		for(int i=0; i<3; i++)
			for(int j=0; j<4; j++)
				intArray[i][j] = (int)(Math.random()*10); // 0���� 9������ ���� ����
		
		// 3x4 �迭�� ����Ѵ�.
		for(int i=0; i<intArray.length; i++) {
			for(int j=0; j<intArray[i].length; j++)
				System.out.print(intArray[i][j] + "\t");
			System.out.println(); // ���� �ٷ� �Ѿ
		}

		// 3x4 �迭�� ���� ���Ͽ� ����Ѵ�.
		int i=0, sum=0;
		while(i<3) { // 3 ���� �� �࿡ ���� �ݺ� 
			for(int j=0; j<4; j++)
				sum += intArray[i][j];
			i++;
		}
		System.out.println("���� " + sum);		
	}
}
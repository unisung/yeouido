package ch02;

public class LiteralExample01 {
	public static void main(String[] args) {
		String toolName="JDK";
		//���ڿ��� �ٸ� ����ŸŸ���� + ����� ���ڿ�
		System.out.println(toolName+1+0.8);//"JDK"+1=> "JDK1"+0.8 => "JDK10.8"
		System.out.println("�ڹ�"+(8+0.8));
		System.out.println(toolName+(1+0.8));// 1.8=> "JDK"+1.8 => "JDK1.8"
		System.out.println("(" +3+","+5+")");// "(3" => "(3,"=> "(3,5"=> "(3,5)"
	}
}

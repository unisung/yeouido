package ch02;

public class AnimalMainEx {
	public static void main(String[] args) {
      Animal animal = new Animal();
      animal.speak();
      
      Dog dog = new Dog();
      dog.speak();
      dog.speak("�����Ʈ");
      
      Cat cat = new Cat();
      cat.speak();
      
      Chicken chicken = new Chicken();
      chicken.speak();
      
      //��ӹ޾Ƽ� �޼ҵ尡 ������ �� �Ŀ���
      //�θ�Ÿ���Ƿ� ��ȯ(upcasting)�Ǵ���
      //����ô� �����ǵ� �޼ҵ��� �������� ����
      // <- ���� ����
      Animal zoo[] = new Animal[3];
      zoo[0]=new Dog();//Dog -> Animal
      zoo[1]=new Cat(); //Cat -> Animal
      zoo[2] = new Chicken(); // Chicken -> Animal
      
      System.out.println("-----------------------");
      for(int i=0;i<zoo.length;i++)
    	  zoo[i].speak();
      
	}
}

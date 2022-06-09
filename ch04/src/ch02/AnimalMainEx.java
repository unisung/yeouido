package ch02;

public class AnimalMainEx {
	public static void main(String[] args) {
      Animal animal = new Animal();
      animal.speak();
      
      Dog dog = new Dog();
      dog.speak();
      dog.speak("말라뮤트");
      
      Cat cat = new Cat();
      cat.speak();
      
      Chicken chicken = new Chicken();
      chicken.speak();
      
      //상속받아서 메소드가 재정의 된 후에는
      //부모타입의로 변환(upcasting)되더라도
      //실행시는 재정의된 메소드의 내용으로 실행
      // <- 동적 실행
      Animal zoo[] = new Animal[3];
      zoo[0]=new Dog();//Dog -> Animal
      zoo[1]=new Cat(); //Cat -> Animal
      zoo[2] = new Chicken(); // Chicken -> Animal
      
      System.out.println("-----------------------");
      for(int i=0;i<zoo.length;i++)
    	  zoo[i].speak();
      
	}
}

package oopsdemo3;

abstract class Animal
{
	public void eat()
	{
		System.out.println("I can eat");
	}
	void makeSound() {
		// TODO Auto-generated method stub
		
	}
	abstract void makesound(); // abstract method  - without body
}
class Dog extends Animal
{

	@Override
	void makesound() {
		System.out.println("Bark Bark");
		
	}
	
}

class Cat extends Animal
{
	@Override
	void makeSound() {
		System.out.println("Mew Mew");
		
	}

	@Override
	void makesound() {
		// TODO Auto-generated method stub
		
	}
}
public  class AnimalAbstractionTest {

	public static void main(String[] args) {
		
		//Animal a= new Animal();
		
		Dog d1=new Dog();
		
		d1.makesound();
		d1.eat();
		
		Cat c1=new Cat();
		
		c1.makesound();
		c1.eat();
		
		
		

	}

}



class Animal{
	private String name;
	Animal(String name){
		this.name=name;
	}
	public void eat() {
		System.out.println("Eat food");
	}
	public String showName() {
		return this.name;
	}

}

class Dog extends Animal{
	Dog(String name){
		super(name);
	}
	public void eat() {
		System.out.println("Eat dog food");
	}
}

class Cat extends Animal{
	private String name;//not used
//	Cat(String name){
//		this.name=name;
//	}//exception!!!
	Cat(String name){
		super(name);
	}
	public void eat() {
		System.out.println("Eat cat food");
	}
	
}
class feeder{
	public void feed(Animal a) {//Animal a will automatically convert into its subclass object while calling this method.
		System.out.println("feed food to "+a.showName());
		a.eat();
	}
}
//
class Supper1{
	public void doWork() {
		System.out.println("Supper1");
	}
}
class Sub1 extends Supper1{
	public void doWork() {
		System.out.println("Sub1");
	}
}
class Sub2 extends Supper1{
	
}
//
class Supper2{
	
}
class Sub3 extends Supper2{
	public void doWork() {
		System.out.println("Sub3");
	}
}


public class J2_OOP_Polymorphic {
	public static void main(String[] args) {
		Animal d=new Dog("Dog");
		Animal c=new Cat("Cat");
		feeder f=new feeder();
		f.feed(d);
		f.feed(c);
		
		Supper1 obj=new Sub1();
		obj.doWork();//sub1;
		
		Supper1 obj2=new Sub2();
		obj2.doWork();//supper
		
		Supper2 obj3=new Sub3();
		obj3.doWork;//exception:doWork cannot be resolved.
	}
}

class Person{//class Person extends Object{};
	String name;
	protected int age;
	public void sleep() {
		System.out.println("I wanna sleep!");
	}
	public void eat() {
		System.out.println("I like big burger");
	}
	private String privacy;
}

class Student extends Person{
	int num;
	public void sleep() {
		System.out.println("I never sleep!");
	}
	//protected void eat() {
		//System.out.println("I like small burger");
	//}//the visibility should be larger than parent class,so should not use "protected"!!
}
class Teacher extends Person{
	int level;
}
class Employer extends Person{
	int hireDate;
}
class Dog{
	public void bark() {
		System.out.println("I can bark");
	}
}
class Husky extends Dog{
	public void bark() {
		System.out.println("I can bark and howl!!");
	}
	public void bark_2() {
		super.bark();// "super" calls the method from superclass.
	}
}

class Animal{
	private String name;
	private int age;
	Animal(int age, String name){
		this.age=age;
		this. name=name;
	}
	public int showAge() {
		return this.age;
	}
}
class Cat extends Animal{
	private String color; 
	//initialize the subclass' constructor by calling the superclass' constructor using "super"
	Cat(int age, String name, String color){
		super(age, name);//super calls the constructor from superclass.
		this.color=color;
	}
	public String getColor() {
		return this.color;
	}
	
	public void show() {
		System.out.println("age:"+this.showAge());
	}
}

class Super{
	public String name="super";
}
class Sub extends Super{
	public int name=18;
	public void func() {
		System.out.println("sub:"+this.name);
		System.out.println("super:"+super.name);
	}
}

class J2_OOP_Inheritance {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="AAAA";//inherit default name
		s1.age=10;//inherit protected age;
		//s1.privacy;//cannot inherit private privacy;	
		s1.sleep();//I never sleep
		
		Husky h1=new Husky();
		h1.bark();//I can bark and howl!!
		h1.bark_2();//I can bark
		
		Cat c1=new Cat(5,"MIMI","Yellow");
		c1.show();
		
		Sub obj=new Sub();
		obj.func();//sub:18 super:super
	}
	
}

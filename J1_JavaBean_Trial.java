//javaBean Trial
class Person{
	private int age=101;
	private String name="XXX";
	public String getName() {
		return name;
	}
	public void setName(String m) {
		name=m;
	}
	public int getAge() {
		return age;
	}
}

class User{
	private int age;
	private String name;
	private int height;
	private int weight;
	private int grade;
	public void setAge(int a) {
		age=a;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getA() {
		return age;
	}
	public String getN() {
		return name;
	}
	public void show() {
		System.out.println(this.name+":"+this.age);
	}
	public void sayHello() {
		System.out.println("成功调用sayhello");
		this.show();//this可以省略
	}
	User(){};//default constructor
	
	User(String name){
		this.name=name;
	}//overridden constructor 1
	User(String name, int age){
		this(name);//User(name)
		this.age=age;
	}//overridden constructor 2
	User(String name, int age, int height){
		this(name, age);//User(name, age)
		this.height=height;
	}//overridden constructor 3
	
	User(String name, int age, int weight, int height){
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.height=height;
	}//overridden constructor 4
	
	User(int age){
		
		this("x",age,0,0);//User(String name, int age, int weight, int height)
		this.age=age;
	}//call constructor 4
}
class line {
	private int x;
	private int y;
	line(){};
	line(int start, int end){
		x=start;
		y=end;
	}//constructor line 1
	public void setX(int start) {
		x=start;
	}//setter x
	public void setY(int end) {
		y=end;
	}//setter y
}
class J1_JavaBean_Trial {
	public static void main(String[] args) {
		User u1=new User();
		u1.setAge(10);
		u1.setName("AAA");
		u1.show();//AAA:10
		
		User u2=new User();
		u2.setAge(100);
		u2.setName("BBB");
		u2.show();//BB:100
		
		u1.sayHello();
		
		User u3=new User("CCC");
		u3.show();
		
		line L1=new line(1,2);//call constructor line 1
		
		line L2=new line();//initialize
		L2.setX(1);//set x
		L2.setY(2);// set y
	}	
}

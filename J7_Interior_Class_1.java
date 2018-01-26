class Outer{
	String name="outter";
	int i=100;
	public int getInner() {
		return new Inner().i;//通过new一个内部类实例来调用内部类的字段i 
	}
	
	class Inner{//没有static修饰，实例内部类
		public String getName() {
			return name;
		}
		int i=10;
		String name="inner";
		public int getI() {
			int i=1;
			return i;
		}
	}
}
class Outer_2{
	String name="non-static name";
	static String name2="Outer_2";
	static class Inner{
		static int i=9;
		public String getName2() {
			return name2;
		}
		public String getName() {
			return new Outer_2().name;
		}
	}
}

public class J7_Interior_Class_1 {
	public static void main(String[] args) {
		//创建内部类对象
		Outer o=new Outer();//先创建外部类对象
		Outer.Inner i=o.new Inner();//再通过外部类对象，创建内部类对象
		//System.out.println(new Outer().Inner());内部类没有static修饰，不能通过类名调用
		System.out.println(i);
		System.out.println(i.getName());//通过内部类的方法访问外部类的成员。
		//外部类访问内部类
		System.out.println(o.getInner());//10
		//重名的字段调用结果
		System.out.println(i.getI());//1 就近原则访问。若要访问inner的i，则return this.i，
		//若访问外部的i,return outer.this.i
		
		//static inner class
		System.out.println(new Outer_2.Inner().i);
		//创建内部类对象
		Outer_2.Inner inn=new Outer_2.Inner();
		System.out.println(inn.getName2());//outer_2,静态内部类可以访问外部类的静态对象
		System.out.println(new Outer_2.Inner().getName());//non-static name 非静态外部类成员，需要先创建对象再访问	
	}
}

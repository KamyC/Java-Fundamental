class SuperClass{
	public String name="Super Name";
	public void doWork(){
		System.out.println("Super Do Work");
	}
}
class SubClass extends SuperClass{	
	public String name="Sub Name";
	public void doWork(){
		System.out.println("Sub Do Work");
	}
}
class DemoBlock{
	{
		System.out.println("构造代码块");
	}
	DemoBlock(){
		System.out.println("构造器");
	}
	static {
		System.out.println("静态代码块");
	}
}
//put all the consts in one class
class Consts{
	final static String NAME="AAA";
	final static int X_Coordinate=100;
	final static int Y_Coordinate=100;
}
//singleton
class ArrayUtil{
	private static final ArrayUtil ulti=new ArrayUtil();//initialize a private instance 
	private ArrayUtil() {
		
	}//avoid being called by others
	public static ArrayUtil getUlti() {
		return ulti;
	}//expose this method to get ulti
	
	public void sort(String[] arr) {
		System.out.println("sorting");
	}//method
}
//wrapper class

class intWrapper{
	private int value;
	public intWrapper(int value) {
		this.value=value;
	}
}

public class J3_OOP {
	public static void main(String[] args) {
		SuperClass clz=new SubClass();
		clz.doWork();
		System.out.println(clz.name);//Super Name
		
		new DemoBlock();//静态代码块 构造代码块 构造器
		new DemoBlock();//构造代码块 构造器
		//call the constant variable
		System.out.println(Consts.X_Coordinate+Consts.Y_Coordinate);
		
		ArrayUtil.getUlti().sort(null);
		
		intWrapper val=new intWrapper(10);//initilize the int obj
		//装箱操作
		Integer num1=new Integer(19);//覆盖了Object中的toString方法，所以打印出来的是值。
		//拆箱操作
		int num2=num1.intValue();
		System.out.println(num1==num2);//true
	}
}

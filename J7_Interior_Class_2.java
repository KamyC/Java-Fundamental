
public class J7_Interior_Class_2 {
	static String name="xxx";//外部类的字段
	public static void main(String[] args) {
		final int age=10;//局部变量，用final修饰
		class localClass{//局部类
			String info="YYY";
			public void test() {
				System.out.println(name);//可直接访问外部类的字段
				System.out.println(age);//可直接访问方法内的变量
				System.out.println(info);//可访问自身的字段 
			}
		}
		new localClass().test();
		
	}
}

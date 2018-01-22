public class J3_Output_Consequence {
	private static J3_Output_Consequence d=new J3_Output_Consequence();
	//下面这个初始化，可以相当于 private Super_Class t=null;然后在自身构造器内实现：t=new Sub_Class();
	private Super_Class t=new Sub_Class();//2. 非static字段初始化，是通过构造器执行的，优先于其他字段执行，
	//所以先调用了sub_class，而sub_class继承了父类，构造器内有个隐式的super,所以就指向了super_class的构造器
	static {
		System.out.println('3');
	}
	//
	public J3_Output_Consequence(){
		//t=new Sub_Class();
		System.out.println("4");
	}
	public static void main(String[] args) {
		System.out.println("Hello");
	}
}

class Super_Class{
	Super_Class(){
		System.out.println("构造superclass");
	}
}

class Sub_Class extends Super_Class{
	static {
		System.out.println("1");
	} //1. main入口中，依靠sub_class类，所以先加载被依靠的类的静态构造器
	Sub_Class(){
		System.out.println("2");
	}
}
//the output is:
//1
//构造superclass
//2
//4
//3
//Hello


package J9_Internal_Library;

import java.math.*;

public class Math_Demo {
	public static void main(String[] args) {
		System.out.println(Math.max(10,11));
		System.out.println(Math.random());//返回[0,1)之间的随机数
		System.out.println(0.09+0.01);//0.09999999999999999
		BigDecimal a=new BigDecimal("0.9");//根据api文档建议用string类型的构造器来保证传入参数的准确性
		BigDecimal b=new BigDecimal("0.1");
		System.out.println(a.add(b));//1.0
	}
}

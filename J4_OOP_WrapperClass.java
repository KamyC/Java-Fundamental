
public class J4_OOP_WrapperClass {
	public static void main(String[] args) {
	
		System.out.println(Integer.MAX_VALUE);//2147483647
		System.out.println(Integer.MIN_VALUE);//-2147483648
		System.out.println(Integer.SIZE);//32
		//装箱
		Integer num1=new Integer(1111);
		Integer num2=Integer.valueOf(222);//recommended,带有缓存
		//拆箱
		int a=num1.intValue();//byteValue, shortValue, integerValue,floatValue,longValue,doubleValue
		//类型转换
		Long num=123L;
		int b=num.intValue();
		System.out.println(b);
		//String 转成包装类对象
		Integer num3=new Integer("111");
		Integer num4=Integer.valueOf("222");
		System.out.println(num3+num4);//333
		//包装类转成String
		String str=num3.toString();
		System.out.println(str.getClass());//class java.lang.String
		String str2="2222";
		int c=Integer.parseInt(str2);
		System.out.println(c);
		
		System.out.println(new Boolean("SB"));//除了true/TRUE字符串，其他都是false.
		//cache flyweight pattern
		Integer i1=new Integer(111);
		Integer i2=new Integer(111);
		System.out.println(i1==i2);//false
		Integer i3=Integer.valueOf(123);
		Integer i4=Integer.valueOf(123);
		System.out.println(i3==i4);//true
		Integer i5=123;
		Integer i6=123;
		System.out.println(i5==i6);//true
		//-----------------------------------
		Integer i_1=new Integer(222);
		Integer i_2=new Integer(222);
		System.out.println(i_1==i_2);//false
		Integer i_3=Integer.valueOf(222);
		Integer i_4=Integer.valueOf(222);
		System.out.println(i_3==i_4);//false
		Integer i_5=222;
		Integer i_6=222;
		System.out.println(i_5==i_6);//false
		System.out.println(i_5.equals(i_6));//true
		//abstract method
		
	}
}

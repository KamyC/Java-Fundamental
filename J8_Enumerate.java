enum Weekdays{//在底层，这里相当于class Weekdays extends Enum
	MONDAY,TUESDAY,WENEDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}
enum ArrUtil{
	INSTANCE;
	public void sort(int[] arr) {
		System.out.println("SORT");
	}
}
class Employee{
	private Weekdays restday;
	public Weekdays getRestday() {
		return this.restday;
	}
	public void setRestday(Weekdays ele) {
		this.restday=ele;
	}
}

public class J8_Enumerate {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setRestday(Weekdays.FRIDAY);
		Weekdays restday=e.getRestday();
		System.out.println(restday);
		if(restday==Weekdays.FRIDAY||restday==Weekdays.SATURDAY) {
			System.out.println("Weekend Rest");
		}
		else {
			System.out.println("Business Day");
		}
		//枚举对象可调用Enum中的方法
		String someday=Weekdays.MONDAY.name();
		int ordinal=Weekdays.TUESDAY.ordinal();
		System.out.println(ordinal);
		
		Weekdays[] ws=Weekdays.values();
		for(Weekdays i:ws) {
			System.out.println(i);//返回数组中所有的常量
		}
		//把字符串转换成枚举类中的同名常量
		Weekdays day=Weekdays.valueOf("MONDAY");
		System.out.println(day);
		//单例设计模式
		ArrUtil.INSTANCE.sort(null);
	}
}

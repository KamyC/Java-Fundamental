abstract class getTime{
	final public long doWork() {//final强制子类不能修改算法
		long begin=System.currentTimeMillis();
		//下面是子类的具体操作，通过父类回调。钩子方法。
		count();
		//父类的抽象方法
		long end=System.currentTimeMillis();
		return end-begin;
	}
	protected abstract void count();//只需要子类调用即可，外界不可调用 
}
class CountString extends getTime{
	public void count() {
		String str="";
		for(int i=0;i<10000;i++) {
			str+=i;
		}
	}
}
class CountInt extends getTime{
	public void count() {
		int n=0;
		for(int i=0;i<100000;i++) {
			n+=1;
		}
	}
}
public class J5_Template {
	public static void main(String[] args) {
		System.out.println(new CountString().doWork());
		System.out.println(new CountInt().doWork());
	}
}

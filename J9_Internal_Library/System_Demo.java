package J9_Internal_Library;

import java.util.Arrays;

public class System_Demo {
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("recycled");
	}
	public static void main(String[] args) {
		int[] src= {1,2,3,4,5};
		int[] des= new int[10];
		System.arraycopy(src, 0, des, 0, 5);
		System.out.println(Arrays.toString(des));//数组拷贝
		long time=System.currentTimeMillis();//获取时间
		System.out.println(time);
		System.exit(0);//退出系统
		new System_Demo();
		//System.gc();//强制运行垃圾回收系，一般不用
		//Runtime.getRuntime().gc();相当于System.gc();在底层runtime是单例设计模式
		
	}
}

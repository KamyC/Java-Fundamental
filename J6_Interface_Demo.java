
interface USB{
	void swapData();
}

class MotherBoard {
	private static USB[] usb=new USB[3];
	private static int index=0;//这里new出来了一个类，一个数组类。
	public static void plugIn(USB item){//static 修饰只是为了方便类名调用
		usb[index]=item;
		index++;
		item.swapData();
	}
	public static void doWork() {
		for(USB i:usb) {
			if(i!=null) {
				i.swapData();
			}
		}
	}
	
}
class Mouse implements USB{
	public void swapData() {
		System.out.println("Mouse Moving");
	}
}
class Printer implements USB{
	public void swapData() {
		System.out.println("Printing Documents");
	}
}

public class J6_Interface_Demo {
	public static void main(String[] args) {
//		MotherBoard.plugIn(new Mouse());
//		MotherBoard.plugIn(new Printer());
//		MotherBoard.plugIn(new Printer());
		//MotherBoard.plugIn(new Printer());
		
		MotherBoard.doWork();
		
	}
}

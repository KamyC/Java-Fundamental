abstract class Graph{
	abstract public double getArea(); //不需要方法体
}
class Circle extends Graph{
	private Integer r;
	Circle(Integer r){
		this.r=r;
	}
	public double getArea() {
		return 3.14*r*r;
	}
}
class Rec extends Graph{
	private Integer width;
	private Integer height;
	Rec(Integer width, Integer height){
		this.width=width;
		this.height=height;
	}
	public double getArea() {
		return width.doubleValue()*height.doubleValue();
	}
}

public class J5_Abstract_Design {
	public static void main(String[] args) {
		Circle c=new Circle(4);
		System.out.println(c.getArea());//50.24
		
		System.out.println(new Rec(3,4).getArea());//12.0
	}
}

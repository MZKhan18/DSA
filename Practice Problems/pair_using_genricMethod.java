package testClass;

public class pair_using_genricMethod<X ,Y> {
	
	X x;
	Y y;
	public pair_using_genricMethod(X x, Y y) {
		this.x = x;
		this.y= y;
	}
	
	public void getDesc() {
		System.out.println(x +" and "+ y);
	}
	
	
}

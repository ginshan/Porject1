class Base{
	private int a;
	private int m=2;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public int getM() {
		return m;
	}
	
	public void setM(int m) {
		this.m = m;
	}
}
class Derive extends Base{
	int b;
	
	public Derive(int x ,int y) {
		this.setA(x);
		this.b =y;	
	}
	
	public void show() {
		System.out.println("a * m ="+this.getA() * this.getM());
		System.out.println("b * m ="+this.b * this.getM());
	}
	
}
public class Exp03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derive x = new Derive(4,5);
		x.show();
	}
}

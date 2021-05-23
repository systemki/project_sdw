package day13;

public class Circle extends Figure {
	
	private int x, y;
	private int r;
	
	public Circle(int x, int y, int r) {
		super(x -r , y -r , x + r , x + r);
		this.x = x;
		this.y = y;
		this.r = r;
	}
	@Override
	public void print() {
		System.out.println("<<<원형 입니다. >>>");
		System.out.println("중심점 : " + x + "px, " + y +"px");
		System.out.println("반지름 : " + r);
	}
//	public Circle(int left, int up, int right, int down) {
//		super(left, up, right, down);
//	x = getRight() - getLeft();
//	y = getDown() - getUp();
//	
	/* 원을 그릴때 좌상점과 우하점으로 그린다면 중심점으로 실수로 해야한다.
	 * 예 : (0,0) (1,1)인 원에서 중심점으로 (0.5,0.5)
	 * 원을 그릴 때 좌성점과 우하점으로 그린다면 원이 아닌 타원이 나올 수 있다.
	 
	 */ 
//	
//	}
//	
//	public void print() {
//		System.out.println("<<<원형 입니다. >>>");
//		super.print();
//		System.out.println("");
//		System.out.println("가로 : " + w);
//		System.out.println("세로 : " + h);
//	}
//	
	
}
 
package day11;

public class MethoodOverloadingTest {

	public static void main(String[] args) {
		Point2 pt = new Point2();
		pt.print();
		pt.move(4,5);
		pt.print();
		Point2 pt2 = new Point2(10,20);
		pt.move(pt2);
		pt2.print();
		System.out.println("1");
		System.out.println('1');
		
	}

}
class Point2{
	private int x, y;
	public Point2() {
		this(0,0);
		
	}
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point2(Point2 pt) {
		this(pt.x, pt.y);
	;
	}
	
	public void print() {
		System.out.println("(" + x + "," + y + ")");
	}
	/* 기  능  : 이동할 x,y좌표가 주어지면 해당 좌표로 이동하는 메소드
	 * 매개변수 : int x1, int y1
	 * 리턴타입 : 없음
	 * 메소드명 : move
	 */
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	/* 기  능  : 이동할 좌표가 Point2 주어지면 해당 좌표로 이동하는 메소드
	 * 매개변수 : 이동할 좌표 Point2의 객체 > Point2 pt
	 * 리턴타입 : void
	 * 메소드명 : move
	 */	
	public void move(Point2 pt) {
		x = pt.x;
		y = pt.y;
	}
	
}
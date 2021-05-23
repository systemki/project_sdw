package day13;

public class Rect extends Figure {
	private int w;
	private int h;
	
	
	public Rect(int left, int up, int right, int down) {
		super(left, up, right, down);
		w = getRight() - getLeft();
		h = getDown() - getUp();
		
		
	}

		public void print() {
			System.out.println("<<<사각형 입니다>>");
			super.print();
			System.out.println("");
			System.out.println("가로 : " + w);
			System.out.println("세로 : " + h);
		}
	
}

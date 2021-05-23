package day10;

public class Circle {
	
	public static void main(String[] args) {
		
	// 중심좌표(x좌표, y좌표) 반지름 radius
	//	private int x, y, radius;
		private Point center = new Point();
		private int radius;
		
		/* 기능	  : 원의 중심점을 이동하는 메소드
		 * 매개변수 : int x1, int y1, int radius1; 
		 * 리턴타입 : 없음 void
		 * 메소드명 :  move
		 */
		
		public void move (int x, int y) {
			//center의 x,y좌표를 매개변수 x,y로 이동시키는 코드
			center.move(x,y);
		}
		
		/* 기  능   원의 정보를 출력하는 메소드
		 * 매개변수 : 
		 */
		/*
		public void print() {
			다음과 같이 출력되도록 코드를 작성하세요.
			중심점 : (?,?)
			반지름 : ?
					*/
			System.out.print("중심점 : ");
			center.print();
			System.out.println("반지름 : " + radius);
		} 
		
		public Point getcenter() {
			return center;
		}
		public void setcenter(Point center) {
			this.center = center;
		}
		public int getRadius() {
			return radius;
		}
		public void setRadius(int radius) {
			this.radius = radius;
		}

	}


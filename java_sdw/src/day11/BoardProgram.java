package day11;

import java.util.Scanner;

public class BoardProgram {

	private Board []board;
	private Scanner scan;
	private int count;
	public BoardProgram() {
		this(10);
	//	board = new Board[10];
	//	scan = new Scanner(System.in);
		
		
	}
	public BoardProgram(int max) {
		if(max <= 10) {
			max = 10;
		}
		board = new Board[max];
		scan = new Scanner(System.in);
	}
	/* 기   능 : 게시글을 추가하는 기능
	 * 매개변수 : 없음
	 * 리턴타입 : 없음
	 * 메소드명 : insertBoard
	 */
		public void insertBoard() {
			System.out.println("게시글 정보를 입력하세요.");
			System.out.print("제목 : ");
			String title = scan.next();
			System.out.print("작성자: ");
			String writer = scan.next();
			System.out.print("작성일: ");
			String registerDate = scan.next();
			System.out.print("내용 : ");
			String contents = scan.next();
			//타입은 게시글로 지정, 번호는 배열의 번지를 이용
			String type = "게시글";
			int num = count + 1;
			//입력된 정보를 이용하여 게시글 생성
			Board tmpBoard = new Board(num, title, contents, writer, registerDate, type);
			//생성된 게시글을 배열에 저장
			board[count] = tmpBoard;
			count += 1;
		}

	/* 기   능 :  게시글 번호를 입력 받아 입력받은 게시글을 확인하는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : void
	 * 메소드명 : printBoardDetail
	 */
	public void printBoardDetail() {
	
		//상세 내용을 확인할 게시글을 선택
		System.out.print("확인할 게시글 번호를 입력하세요 : ");
		int num = scan.nextInt();
		//해당 게시글의 내용을 출력
		if(num <= count && board[num-1] != null) {
			//게시글을 확인하면 조회수를 1증가
			//기존 조회수를 가져옴
			//views = board[num-1].getLike();
			//기존 조회수에 + 1을 해서 다시 업데이트
			//board[num-1].setLike(views + 1);
			board[num-1].print();//게시글 조회
		}else {
			System.out.println("해당 게시글이 없거나 삭제되었습니다.");
		}
	}
	/* 기   능 :  게시글 전체를 확인 하는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : void
	 * 메소드명 : printBoardList
	 */
	
	public void printBoardList() {
		for(int i = 0; i < count; i+=1) {
			if(board[i] != null) {
				board[i].summaryPrint();
			}
		}
	}
	
	/* 기   능 : 수정할 게시글번호와 정보를 입력받아 수정하는 메소드 
	 * 매개변수 : 없음 
	 * 리턴타입 : 없음 void
	 * 메소드명 : modifyBoard
	 */
	
		public void modifyBoard() {
			System.out.print("수정할 게시글 번호를 입력하세요 : ");
			int num = scan.nextInt();

			if(num <= count && board[num-1] != null) {
				System.out.print("제목 : ");
				String title = scan.next();
				System.out.print("내용 : ");
				String contents = scan.next();
				board[num-1].modify(title, contents);
			}else {
				System.out.println("게시글이 없거나 삭제되었습니다.");
			}
		}
	/* 기   능 : 게시글 번호를 입력받아 삭제하는 메소드
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 > void
	 * 메소드명 : deleteBoard
	 */
	
		public void deleteBoard () {
			//삭제할 게시글 번호를 입력
			System.out.print("삭제할 게시글 번호를 입력하세요 : ");
			int num = scan.nextInt();
			//삭제 => 해당 정보를 null로
			if(num <= count) {
				board[num-1] = null;
			}
		}
		
	/* 기   능 : 게시글 프로그램을 종료하는 메소드 
	 * 매개변수 : 없음
	 * 리턴타입 : 없음 void
	 * 메소드명 : closeBoard
	 */
	
		public void closeBoard() {
			System.out.println("프로그램 종료 ");
			scan.close();
		}
	/* 기   능 :  
	 * 매개변수 :
	 * 리턴타입 :
	 * 메소드명 :
	 */
	
	
}

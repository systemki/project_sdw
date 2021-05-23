package day16;

public class ObjectTostringTest {

	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s);
		System.out.println(s.toString());

	}

}


class Student{
	private String name;
	private int grade;
	private int classNum;
	private int num;
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", classNum=" + classNum + ", num=" + num + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
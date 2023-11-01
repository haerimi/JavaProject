package Ex5;

class Man {
	private String name;
	private String dept;
	public Man(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	public void show() {
		System.out.print(name + ": " + dept);
	}
}

class Student extends Man {
	private int grade;
	public Student(String name, String dept, int grade) {
		super(name, dept);	// 슈퍼 클래스 호출
		this.grade = grade;
	}
	
	// 메서드 재정의 (메서드 오버라이딩)
	public void show() {
		super.show();
		System.out.println("(" + grade + "학년)");
	}
}

class Proffessor extends Man {
	private String position;
	public Proffessor(String name, String dept, String position) {
		super(name, dept);
		this.position = position;
	}
	
	public void show() {
		super.show();
		System.out.println("(" + position + ")");
	}
}
public class ManTest {
	public static void main(String[] args) {
		Man s1 = new Student("홍길동", "컴퓨터공학", 4);
		Man s2 = new Student("김철수", "컴퓨터공학", 2);
		Man p1 = new Proffessor("이순신", "컴퓨터공학", "조교수");
		Man[] mans = {s1, s2, p1};
		for (Man list : mans) 
			list.show();
	}
}

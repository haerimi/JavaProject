package day01;

import java.util.HashMap;
import java.util.Scanner;

class Student {
	private int id;
	private String tel;
	public Student (int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTel() {
		return tel;
	}
}
public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3명의 학생을 HashMap을 사용해 저장하고 검색하고 싶은 이름을 입력받아 그 학생의 번호와 전화번호 출력
		HashMap<String , Student> map = new HashMap<String, Student>(); 
		map.put("박해림", new Student(1, "010-2353-2112"));
		map.put("손현우", new Student(2, "010-2423-2112"));
		map.put("채형원", new Student(3, "010-2353-5242"));
		
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("찾고싶은 사람의 이름을 입력 : ");
			String name = s.next();
			if(name.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			} 

			Student stu = map.get(name);
			
			if (stu == null) 
				System.out.println(name + "은 등록되지 않았습니다.");
			else 
				System.out.println(stu.getId() + " : " + stu.getTel());
		}
	}
}

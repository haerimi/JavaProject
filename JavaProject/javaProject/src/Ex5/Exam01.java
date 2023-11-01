package Ex5;

import java.util.Scanner;

class Hero1 {
	private String name;
	public Hero1(String name) {
		this.name = name;
	}
	
	public void move() {
		System.out.print(name);
	}
}

class HeroEx1 extends Hero1 {
	private String level;
	public HeroEx1(String name, String level) {
		super(name);
		this.level = level;
	}
	
	public void move() {
		super.move();
		System.out.println("이(가) " + level + "(으)로 출동~~~");
	}
}
public class Exam01 {

	public static void main(String[] args) {
		System.out.println("영웅과 무기를 장착하여 출동해주세요.");
		Scanner scanner = new Scanner(System.in);
		Hero1 [] hero1s = new Hero1[3];
		for (int i = 0; i < hero1s.length; i++) {
			System.out.print("영웅의 이름과 무기를 입력하세요.");
			String name = scanner.next();
			String level = scanner.next();
			hero1s[i] = new HeroEx1(name, level); 
		}
		for (Hero1 listHero1 : hero1s)
			listHero1.move();
	}
}

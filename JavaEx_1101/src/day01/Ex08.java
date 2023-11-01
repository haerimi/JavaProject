package day01;

import java.util.HashMap;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		dic.put("baby", "아기");		//추가할 땐 put사용
		dic.put("name", "송이");		//추가할 땐 put사용
		dic.put("dad", "하하");		//추가할 땐 put사용
		dic.put("mom", "별");		//추가할 땐 put사용
		// 영어 단어를 입력받아 그 단어의 한글을 출력. 단, 없는 단어인 경우 없는 단어라고 출력
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("찾고싶은 단어를 입력 : ");
			String ans = s.next();
			if(ans.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			} 

			String kor = dic.get(ans);
			
			if (kor == null) 
				System.out.println(ans + "은 사전에 등록되지 않았습니다.");
			else
				System.out.println(kor);
		}
	}

}

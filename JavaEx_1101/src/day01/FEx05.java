package day01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// 이렇게 입력하면 원래 입력된 자료가 지워짐 => , true 옵션을 넣으면 됨 (안넣으면 지워짐)
public class FEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아이디, 비밀번호를 입력받아 파일에 추가하고 quit를 입력받으면 입력종료
		try {
			FileWriter wout	 = new FileWriter("C:\\Users\\mjc\\Downloads\\mem.txt", true);	// 기본 값은 새로쓰기임(원하지 않으면 옵션을 넣어야함)
			boolean quit = false;
			Scanner s = new Scanner(System.in);
			while(!quit) {
				System.out.print("아이디 입력 : ");
				String id = s.next();
				wout.write("아이디 : " + id + " ");
				
				System.out.print("비밀번호 입력 : ");
				String pwd = s.next();
				wout.write("비밀번호 : " + pwd + "\n");
				
				System.out.println("계속진행(Y | N) => ");
				String str = s.next();
				if(str.toUpperCase().equals("N"))
					quit = true;
			}
			
			wout.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}

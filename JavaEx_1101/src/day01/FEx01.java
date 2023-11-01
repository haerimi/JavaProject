package day01;

import java.io.FileInputStream;
import java.io.IOException;
/*1. like java
2. name is hearim
라고 메모장에 쓴 후 input으로 저장(txt확장명 지우고)*/
public class FEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream in = new FileInputStream("C:\\Users\\mjc\\Downloads\\input.txt");
			int c;
			while((c=in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close(); // 닫는걸 지양
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}

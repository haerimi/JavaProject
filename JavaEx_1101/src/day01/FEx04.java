package day01;

import java.io.FileReader;
import java.io.IOException;
// 꼭 기억해야 하는 것 : 문자 외에 모든 파일을 읽고 쓰는것은 input,outputstream사용함 
public class FEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// FileReader는 문자단위로 받아옴
			FileReader in = new FileReader("C:\\Users\\mjc\\Downloads\\out.txt");
			int c;
			while ((c=in.read()) != -1) {
				System.out.print((char)c);				
			}
			in.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}

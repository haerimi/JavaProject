package day01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 읽고 쓰기가 가능하게 만들기
// 한글이 깨지지 않도록 FileInputStream과 FileoutStream 사용함

public class FEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//FileInputStream inputStream = new FileInputStream("C:\\Users\\mjc\\Downloads\\out.txt");
			FileInputStream inputStream = new FileInputStream("C:\\Users\\mjc\\Desktop\\images\\images\\car1.jpg");
			//FileOutputStream outputStream = new FileOutputStream("C:\\Users\\mjc\\Downloads\\outcopy.txt");
			FileOutputStream outputStream = new FileOutputStream("C:\\Users\\mjc\\Downloads\\outcopy.jpg");
		
			int c;
			while ((c=inputStream.read()) != -1) {
				outputStream.write(c); 	// 쓸 때 write() 사용
			}
			System.out.println("복사가 완료되었습니다.");
			outputStream.close();
			inputStream.close();	// 밖부터 닫고 안을 닫음. 닫지 않으면 글자가 보이지 않을 수 있음
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}

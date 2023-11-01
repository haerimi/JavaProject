package day01;

import java.io.FileOutputStream;
import java.io.IOException;

public class FEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream out =  new FileOutputStream("C:\\Users\\mjc\\Downloads\\out.txt");
			String str = "이 문자를 파일에 기록하고 싶습니다.";
			//byte로 변환하여 저장해야 문자열을 출력할 수 있음
			byte [] buf = str.getBytes();
			out.write(buf);
			// 리드는 반환형태에 주목함. 사용할 때는 입력형태에 주목함
			out.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}

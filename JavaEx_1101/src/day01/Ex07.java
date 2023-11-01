package day01;

import java.util.*;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set set = new HashSet();
		set.add("박해림");
		set.add(1);
		set.add(2);
		set.add("박해림");	// 중복된 데이터 추가
		System.out.print(set + " ");
		// 중복된 요소를 제거하고 출력 (Ex05에서)
	}

}

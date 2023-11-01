package day01;

import java.util.*;

/* 시험문제 - size 
 * 문제1. 가장 긴 문자열 출력
 * 배열의 길이는 size, 입력한 문자열의 길이 메소드가 length
 * ox문제도 나옴*/
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		// 4명의 친구의 이름을 입력받아 저장
		for (int i=0; i<4; i++) {
			System.out.print("이름을 입력해주세요");
			String name = s.next();
			a.add(name);
		}
		
		// a의 길이는 size (length 사용하면 안됨)
		for (int i=0; i<a.size(); i++) 
			System.out.print(a.get(i) + " ");
			// 가장 긴 문자열 출력 // length()
		
		// 비교하기 전 방을 하나 생성해 비교 : 처음 입력받은 문자열, 배열에 저장된 0번째 기준
		// 가장 긴 문자열 배열리스트에 저장 (더 길면 전에 길었던 문자열을 제거하고 더 긴 문자열을 추가, 같으면 배열리스트 추가)
		int longIndex = 0;
		ArrayList<String> ans = new ArrayList<String>();
		
		// 0부터 저장 (같은 길이일 수 있기 때문) 0번째가 조건에 만족하면 저장
		for (int i=0; i<a.size(); i++) {
			// 새로운 값이 0보다 크면 새로운 값 저장 -> 이전 값은 지워야 함
			
			if(a.get(longIndex).length() < a.get(i).length()) {
				longIndex = i;
				ans.clear();
				ans.add(a.get(i));
			}
			// 문자열의 길이가 같은지 비교. 길이가 같으면 clear()가 아니라 추가
			else if (a.get(longIndex).length() == a.get(i).length()) {
				ans.add(a.get(i));
			}
		}
		
		// System.out.println("가장 긴 이름은" + a.get(longIndex)); -> 이렇게 하면 같은 길이의 문자열을 같이 출력하지못함
		System.out.println("가장 긴 이름은" + ans);
		
		// 중복 요소가 제거되어 가장 긴 문자열을 출력 HashSet로 변환 (2023-11-01추가)
		// 배열을 HashSet으로 가져옴
		HashSet<String> hs = new HashSet<String>(ans);
		ans.clear();	// 중복된 값 제거
		ans.addAll(hs);	// 모든 값 추가
		System.out.println("중복요소 제거 후 : " + ans);
	}
}

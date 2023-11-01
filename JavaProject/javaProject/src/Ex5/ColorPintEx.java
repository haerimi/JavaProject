package Ex5;

class Point {
	private int x, y;	// 한 점을 구성하는 X, Y좌표
	public void set(int x, int y) {
		this.x = x;
		this.y = y; 
	}
	
	public void showPoint() {
		// 점의 좌표 출력
		System.out.println("(" + x + ", " + y + ")");
	}
}

// Point 상속
class ColorPoint extends Point {
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class ColorPintEx {
	public static void main(String[] args) {
		Point point = new Point();	// Point 객체 생성
		point.set(1, 2);	// set() 호출
		point.showPoint();	// 좌표 출력
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);	// Point를 상속받았기 때문에 set() 호출 가능
		cp.setColor("red");	// setColor() 호출
		cp.showColorPoint();	// 색과 좌표 호출
	}
}

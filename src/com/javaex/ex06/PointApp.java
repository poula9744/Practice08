package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2); //false, p1과 p2의 주소값은 다르다
		System.out.println(p2 == p3); //false, p2와 p3의 주소값은 다르다
		System.out.println(p3 == p4); //false, p3와 p4의 주소값은 다르다
		System.out.println(p4 == p1); //true. p1과 p4의 주소값은 같다. p4에 p1의 주소값을 복사했다.
		System.out.println(p1.equals(p2)); 
		//Object 클래스에는 이미 equals()가 정의되어 있지만 Point 클래스에는 정의되어 있지 않아 두 점이 동일한지 확인하기 위해서는 재정의해서 사용해야한다
		System.out.println(p4.equals(p1)); 
		//재정의되지 않은 equals()은 주소값을 비교하여 동일한지 여부를 확인한다. --> true p1과 p4의 주소값은 같다.
	}

}



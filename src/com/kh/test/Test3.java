package com.kh.test;

import java.util.Scanner;
/**
 * @실습문제: com.kh.test.Test3.test() 
 * 사용자의
 * 이름 String, 나이 int, 주소 String, 
 * 키double, 몸무게double, 성별String/char을 입력받고
 * 출력하는 프로그램을 만드세요.
 * 키,몸무게는 실수를 입력받고, 정수로 형변환해서 출력
 * 180.5 -> 180
 */

public class Test3 {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(">이름을 입력하세요.");
		String name = sc.next();
		System.out.println("이름 : " + name);
		
		System.out.println(">나이를 입력하세요.");
		int age = sc.nextInt();
		System.out.println("나이 : " + age);
		
		System.out.println(">주소를 입력하세요.");
		String address = sc.next();
		System.out.println("주소 : " + address);
		
		System.out.println(">키를 입력하세요.");
		double height = sc.nextDouble();
		int height2 = (int)height;
		System.out.println("키 : " + height2);
		
		System.out.println(">몸무게를 입력하세요.");
		double weight = sc.nextDouble();
		int weight2 = (int)weight;
		System.out.println("몸무게 : " + weight2);
		
		System.out.println(">성별을 입력하세요.");
		String sex = sc.next();
		System.out.println("성별 : " + sex);
		
	}
	
}

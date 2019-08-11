package com.kh.test;

public class Test1 {
	/*
	 * 1. 각 자료형별 변수를 만들고 초기화한 후 그 값을 출력하는 코드를 작성해 보자.
    	- 정수형 100, 9999억, 
    	- 실수 486.520(float), 567.890123
    	- 문자 A
    	- 문자열 Hello world, 
    	- 논리 true
     	단, 변수를 이용하여 출력하시오 .
	 */
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test();
	}
	public void test() {
		int i = 100;
		long j = 999900000000L;
		
		float f = 486.520f;
		double d = 567.890123;
		
		char a = 'A';
		String str = "Hello world";
		boolean bool = true;

		System.out.println(i);
		System.out.println(j);
		System.out.println(f);
		System.out.println(d);
		System.out.println(a);
		System.out.println(str);
		System.out.println(bool);
	}
	
}

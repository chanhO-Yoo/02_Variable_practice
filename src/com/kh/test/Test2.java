package com.kh.test;

public class Test2 {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.test();
		}
	public void test(){
		String name = "Yoo Chanho";
		int age = 28;
		char sex = '남';
		String phoneNum = "01012345678";
		String email = "khac.chanc@gmail.com";
		String address = "서울시";
		
		System.out.println("=============================================================================");
		System.out.println("이름\t\t나이\t성별\t전화번호\t\t이메일\t\t\t주소");
		System.out.println("=============================================================================");
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s",name,age,sex,phoneNum,email,address);
	}
}

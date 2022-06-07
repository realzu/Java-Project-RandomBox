package com.pj.mini;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Scanner;

public class ProjectMnMain {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		ProjectMn ob = new ProjectMnImpl();
		
		Random rd = new Random();
		
		Thread t = new Thread(new ProjectMnImpl());
		
		int ch;
		
		Thread co = new Thread(new cosme());

		co.start();

		try {
			co.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		ob.write();
		
		while(true) {
			
			do {
				System.out.println("\n===============================================================================================================================================");
				System.out.println("                                                                     <메뉴>");
				System.out.print("\n                               1.회원가입                       2.회원 정보 확인                         3.이벤트 참여");
				System.out.println("\n===============================================================================================================================================\n");
				ch = sc.nextInt();
			}while(ch<1);
			
			switch (ch) {
			case 1: ob.input(); break;
			case 2: ob.print(); break;
			case 3: ob.event(); 	
			
			System.out.println("\r\n" + 
					"\r\n" + 
					"                                     ,----                            \r\n" + 
					"                            *       =#@;~@                            \r\n" + 
					"                          ;@@@@-. :@@-  -@                            \r\n" + 
					"                          ~@!-;@#*@!-  :@*      !*.                   \r\n" + 
					"                      *-.. #@,  @@=   -@@@@...@@#!                    \r\n" + 
					"                      :#@@!!@@$!:@=:!#@#::@@@@;:                      \r\n" + 
					"                          ;@@@@@@@@@@~                                \r\n" + 
					"                    $@@@@@@@@@@@@@@@@@@@@@@@@@@-                      \r\n" + 
					"                   .##         #= -@$        ~@!                      \r\n" + 
					"                   .$#:::::::::#$:!@#::::::::!@!                      \r\n" + 
					"                    *@@@@@@@@@@@@@@@@@@@@@@@@@@                       \r\n" + 
					"                     .@@       #* -@$       @!                        \r\n" + 
					"                     .@@       #* -@$       @!                        \r\n" + 
					"                     .@@       #* -@$       @!                        \r\n" + 
					"                     .@@       #* -@$       @!                        \r\n" + 
					"                     .@@       #* -@$       @!                        \r\n" + 
					"                     .@@       #* -@$       @!                        \r\n" + 
					"                     .@@       #* -@$       @!                        \r\n" + 
					"                     .@@       #* -@$       @!                        \r\n" + 
					"                     .@@       #= -@$       @!                        \r\n" + 
					"                      -!@@@@@@@@@@@@@@@@@@@@;-                        \r\n" + 
					"                                                                      \r\n" + 
					"");
			
			System.out.print("              두근두근 랜덤박스 고르는 중 ");
			
			t.start();
			
			try {			
				Thread.sleep(500);			
			} catch (Exception e) {
				System.out.println(e.toString());
			}		
			
			try {
				t.join();				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			ob.ranran();
			ob.check(); break;
			case 4:
				System.out.println("관리자 모드에 진입합니다.");
				System.out.println("<회원 목록>");
				ob.printfile(); break;
			default : System.out.println("숫자 입력 오류!!"); break;
			
			}
		}		
	}
}

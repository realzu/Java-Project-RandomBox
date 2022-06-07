package com.pj.mini;

import java.util.Random;
import java.util.Scanner;


public class RandomCos {

	private static String[] cos =
		{"아이쉐도우", "아이라이너","마스카라","립스틱"};

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		int co=2; //당첨될 화장품 개수 
		int n=0;
		int num[];

		num = new int[co];

		while(n<co) {
			num[n] = rd.nextInt(4)+1;
			for(int i=0;i<n;i++) {//중복된 값 제거하기
				if(num[i]==num[n]) {
					n--; 
					break;
				}
			}
			n++;
		} 

		System.out.print("축하합니다!\n\n당첨된 화장품은 <%s> ");
		//System.out.printf("축하합니다!\n\n당첨된 화장품은 <%d>",파데 변수);
		for(int su : num) { 
			System.out.printf("<%s> ",cos[su-1]);
		}
		System.out.print("입니다!");
		

		System.out.println("\n\n%s님이 받으실 주소는 아래와 같습니다.");
		//		System.out.println("받는 사람 : "+);
		//		System.out.println("주소 : "+);
		//		System.out.println("번호 : "+);


		int suu; 

		while(true) {
			System.out.println("\n\n1.당첨 확인 2.회원정보 변경 3.종료");
			suu = sc.nextInt();

			switch(suu) {
			case 1:
				System.out.print("%s님이 당첨된 화장품은 \n<%d> ");
				for(int su : num) { 
					System.out.printf("<%s> ",cos[su-1]);
				}
				System.out.print("이며, 받아보실 주소는 아래와 같습니다.");
				//System.out.println("주소 : "+);
				break;
			case 2:
				System.out.println("주소변경!");
				break;	
			case 3:
				System.out.println("이벤트 응모를 종료합니다.");
				System.exit(0);

			default :
				System.out.println("숫자 입력 오류!");

			}
		}
	}
}
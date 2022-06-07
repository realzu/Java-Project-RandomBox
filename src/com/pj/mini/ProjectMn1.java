package com.pj.mini;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ProjectMn1 {
	
	/*//public static void main(String[] args) {
	
	ProjectMnVO pj = new ProjectMnVO();


	Scanner sc = new Scanner(System.in);
	
	private ArrayList<ProjectMnVO>lists = new ArrayList<>(); //ProjectMn맞나
	
	//Random rd = new Random();
	
	
	public int input() throws Exception{
		
		int result = 0;
				
		System.out.print("이름?");
		pj.setName(sc.next());
		
		System.out.print("아이디? [영소문자,5-10자]");
		pj.setId(sc.next());
		
		if(5>pj.getId().length()||pj.getId().length()>10) 
			throw new Exception("아이디의 길이는 5~10자 입니다.");						
		
		for(int i=0;i<pj.getId().length();i++) {
			
			char chid = pj.getId().charAt(i);
			
			if((chid<'a')||(chid>'z'))
				throw new Exception("아이디는 영소문자만 가능합니다."); //new Exception중복 ㄱㅊ?		
		}
		
		System.out.print("비밀번호? [영문자+숫자, 6-20자]");
		pj.setPw(sc.next());
		
		if(6>pj.getPw().length()||pj.getPw().length()>20)
			throw new Exception("비밀번호의 길이는 6~20자 입니다.");
		
		int eng=0, num=0;
		
		for(int j=0;j<pj.getPw().length();j++) {
			
			char chpw = pj.getPw().charAt(j);
			
			if(('a'<=chpw && chpw<='z')||(chpw>='A' && chpw<='Z')) {
				eng++;				
			}else if(0<=num && num<=9) {
				num++;
			}			
		} if(eng==0||num==0)
			throw new Exception("비밀번호는 영문자 및 숫자만 가능합니다.");
		
		String pww;
		do {
			System.out.print("비밀번호 재확인?");
			 pww = sc.next();
		}while(!pww.equals(pj.getPw()));	//pww로 안받나?
		
		//pj.setPw(sc.next());
				
		System.out.print("휴대폰 번호?");
		pj.setTel(sc.nextInt());
		
		System.out.print("주소? [ex.서울특별시 강남구 역삼동 123-4");
		pj.setAddress(sc.next());
		
		lists.add(pj);
		
		return result;		
	}
	
	public void print() {
		Iterator<ProjectMnVO> it = lists.iterator();
		
		while(it.hasNext()) {
			ProjectMnVO pj = it.next();
			
			System.out.println(pj.toString());
		}		
	}
	
	
	public void event() { //void맞나?int..?
		
		System.out.print("랜덤박스 이벤트에 참여하시겠습니까? [Y/N]");
		String dab = sc.next();
		
		do {			
			System.out.println("Y/N을 정확하게 입력해주세요.");
			dab = sc.next();
		}while(!dab.equals("Y") && !dab.equals("N"));	//&&헷갈
		
		if(dab.equals("Y")) {
			
			System.out.println("해당되는 피부 타입의 번호를 선택해주세요!");
			System.out.print("1. 21호_지성 / 2. 21호_건성 / 3. 23호_지성 / 4. 23호_건성");
			
			int type = sc.nextInt();	
			
		}else if(dab.equals("N")) {
			System.exit(0);
		}		
	}
	
	private static String[] cos =
		{"아이쉐도우", "아이라이너","마스카라","립스틱"};
	
	public static void main(String[] args) throws Exception {
		
		Random rd = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		ProjectMn1 ob = new ProjectMn1();
		
		int ch;
		
		while(true) {
			
			do {
				System.out.print("1.입력 2.출력 3.참여");
				ch = sc.nextInt();
			}while(ch<1);
			
			switch (ch) {
			case 1: ob.input(); break;
			case 2: ob.print(); break;
			default: ob.event(); break;
			}
		
		}
		
		//Random rd = new Random();

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
*/

	}



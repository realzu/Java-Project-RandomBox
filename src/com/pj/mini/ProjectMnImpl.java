package com.pj.mini;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ProjectMnImpl implements ProjectMn,Runnable{
	
	Scanner sc = new Scanner(System.in);
	
	private ArrayList<ProjectMnVO>lists = new ArrayList<>();
	
	private File ff = new File("c:\\\\doc\\\\projectmnii.txt");
	
	ProjectMnVO pj = new ProjectMnVO();
	
	int num[];
	int type;
		
	private static String[] cos = {"아이쉐도우", "아이라이너","마스카라","립스틱"};
	String[] fd = {"CoolMatt", "CoolGlow", "WarmMatt", "WarmGlow"};
	
	String[] boxImages = new String[2];
	int cnt = 0;
		
	class cosme implements Runnable{

		public void run() {

			String[] art = new String[38];
			art[0] = "                                                                                                                                                       \r\n";
			art[1] = "                                                                                                                                                       \r\n";
			art[2] = "                                                                                                                                                       \r\n";
			art[3] = "                                                                                                                                                       \r\n";
			art[4] = "			        -$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=                                                  \r\n" ; 
			art[5] = " 			       *~                                                                                 =*                                                 \r\n" ; 
			art[6] = "     			     ;#-               ♥                                          ♡                         -!.                                          \r\n" ; 
			art[7] = "			    .=*                                                                                      =-                                              \r\n" ; 
			art[8] = " 			   ,=                                      ♥                                                  -$,                                           \r\n" ; 
			art[9] = "			  .@*       ♥...                                                     ♡                            =~                                          \r\n" ; 
			art[10] = "			 -$                                                                                              $,                                          \r\n" ; 
			art[11] = "			.@;                                ♡                                         ♥                  *!                                         \r\n" ; 
			art[12] = "			~=                  ♡                                 ♥                                         ~=                                         \r\n" ; 
			art[13] = "			@-                                                                                               !$                                          \r\n" ; 
			art[14] = "			:#              :~              ~:-            ~:              ~:              -:~                #:                                         \r\n" ; 
			art[15] = "			!@:         ,:@!;~           :@!$:           :;!@:           .:@!;:         :$!@:               ~;!;                                         \r\n" ; 
			art[16] = "			 ;;!:.      -;=;: ;#;~       :;!; ;=;:       ~;@; ;;!;,      ,;*;: ;@;:       ~;*; ;*;:       ~;#!.                                          \r\n" ; 
			art[17] = " 			  :;=!!!!!!$;:    :;#!!!!!!!!:.   -:*!!!!!!!$;:    :;=!!!!!!=;:    :;#!!!!!!!!:,   ,:!!!!!!!!$!:                                         \r\n" ; 
			art[18] = " 			   .~~~~~~$!.       ~~~~~~~~.       ,~~~~~~~-        ~~~~~~~~.       ~~~~~~~~,       .~;=~~~~~.            !@@-                          \r\n" ; 
			art[19] = "			         =~                                                                           ~*                  !@@@-                              \r\n" ; 
			art[20] = "  			         =~                   ___  _____  _____    ___  _____  _____                  ~*                !@@@@@-                          \r\n" ; 
			art[21] = "   	 		         =~                  |_  ||  _  ||  _  |  |_  ||  _  ||  _  |                 ~*               !@@@@@@@-                         \r\n" ; 
			art[22] = " 			         =~                    | || | | || | | |    | || | | || | | |                 ~*              *!@@@@@@@-                         \r\n" ; 
			art[23] = "          		         =~                    | || | | || | | |    | || | | || | | |                 ~*              :@@@@@@@@-                     \r\n" ; 
			art[24] = "         		         =~                /\\__/ /\\ \\_/ /\\ \\_/ //\\__/ /\\ \\_/ /\\ \\_/ /                 ~*             :@@@@@@@@@-           \r\n" ; 
			art[25] = "         		         =~                \\____/  \\___/  \\___/ \\____/  \\___/  \\___/                  ~*             :@@@@@@@@@-               \r\n" ; 
			art[26] = "        			 =~                                                                           ~*           ~.,---------,..~                          \r\n" ; 
			art[27] = "        			 =~                                                                           ~*           ~              :                          \r\n" ; 
			art[28] = "        			 =~           _____  _____  _____ ___  ___ _____  _____  _____  _____         ~*           ~              :                          \r\n" ; 
			art[29] = "        			 =~          /  __ \\|  _  |/  ___||  \\/  ||  ___||_   _||_   _|/  __ \\        ~*           ~              :                       \r\n" ; 
			art[30] = "        			 =~          | /  \\/| | | |\\ `--. | .  . || |__    | |    | |  | /  \\/        ~*           !!*:-.    .,:*;:                       \r\n" ; 
			art[31] = "        			 =~          | |    | | | | `--. \\| |\\/| ||  __|   | |    | |  | |            ~*           ~     .,-,     :                        \r\n" ; 
			art[32] = "        			 =~          | \\__/\\\\ \\_/ //\\__/ /| |  | || |___   | |   _| |_ | \\__/\\        ~*           ~              :                   \r\n" ; 
			art[33] = "        			 =~           \\____/ \\___/ \\____/ \\_|  |_/\\____/   \\_/   \\___/  \\____/        ~*           ~              :                  \r\n" ; 
			art[34] = "       			         =~                                                                           ~*           ;.            ;,                  \r\n" ; 
			art[35] = "       			         =~                                                                           ~*             !:,       ,.!                   \r\n" ; 
			art[36] = "        			 =~                                                                           ~*               ,.*$=$$,,                             \r\n" ; 
			art[37] = "       			         =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*                                             \r\n" ; 


			for(int i=0;i<art.length;i++) {
				System.out.print(art[i]);

				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}	
	
	@Override
	public void write() {
		
		System.out.println("\n                                                               현주와 찬주의");
		System.out.println("                                                       주주코스메틱에 오신 것을 환영합니다!");
		System.out.println("\n");
		
		System.out.println("===============================================================================================================================================");
		
		System.out.println("\n                                                   ♥ 랜덤박스 100% 당첨 회원가입 이벤트 ♥\n");
		System.out.println("\n                                                일주일간 펼쳐지는 주주코스메틱의 역대급 이벤트!");
		System.out.println("                                         회원가입을 하신 분들에게는 다양한 화장품이 담긴 랜덤박스가 펑펑~~");
		System.out.println("                                                (속닥속닥) 2022 신상 파운데이션도 기대하세요!");
		
		System.out.println("\n                                               지금 바로 회원가입하고 참여해보세요 (∩^o^)⊃━☆\r\n");
		
	}			

	@Override
	public int input() throws Exception { //회원가입
		
		int result = 0;
		
		System.out.println("[1. 회원가입]\n");
		System.out.print("이름?");
		pj.setName(sc.next());
		
		System.out.print("아이디? [영소문자,5-10자]");
		pj.setId(sc.next());
		
		if(5>pj.getId().length()||pj.getId().length()>10) 
			throw new Exception("아이디의 길이는 5~10자 입니다.");						
		
		for(int i=0;i<pj.getId().length();i++) {
			
			char charId = pj.getId().charAt(i);
			
			if((charId<'a')||(charId>'z'))
				throw new Exception("아이디는 영소문자만 가능합니다.");	
		}
		
		System.out.print("비밀번호? [영문자+숫자, 6-20자]");
		pj.setPw(sc.next());
		
		if(6>pj.getPw().length()||pj.getPw().length()>20)
			throw new Exception("비밀번호의 길이는 6~20자 입니다.");
		
		int eng=0, num=0;
		
		for(int j=0;j<pj.getPw().length();j++) {
			
			char charPw = pj.getPw().charAt(j);
			
			if(('a'<=charPw && charPw<='z')||('A'<=charPw && charPw<='Z')) {
				eng++;				
			}else if(0<=num && num<=9) {
				num++;
			}
			
		} if(eng==0||num==0)
			throw new Exception("비밀번호는 영문자 및 숫자만 가능합니다.");
		
		String pwCk;
		do {
			System.out.print("비밀번호 재확인?");
			pwCk = sc.next();
		}while(!pwCk.equals(pj.getPw()));
				
		System.out.print("휴대폰 번호?");
		pj.setTel(sc.next());
		
		System.out.print("주소?");
		pj.setAddress(sc.next());
		
		lists.add(pj);
							
		return result;		
	}	
	
	@Override
	public void print() {//회원 정보 확인	
		
	try {
		System.out.println("[2. 회원 정보 확인]\n");
		
		System.out.print("확인할 id를 입력해주세요.");
		String str = sc.next();
		FileInputStream fis = new FileInputStream(ff);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ArrayList<ProjectMnVO> lists3 = (ArrayList<ProjectMnVO>)ois.readObject();
		//Iterator<ProjectMnVO> it = lists.iterator();
		lists = lists3;
	
		Iterator<ProjectMnVO> it = lists.iterator();
		
		while(it.hasNext()) {
			
			ProjectMnVO vo = it.next();
			System.out.println(vo.toString());
		}
		
		} catch(IOException e) {
			System.out.println(e.toString());
		} catch(ClassNotFoundException e) {
			System.out.println(e.toString());
		}		
	}
	

	@Override
	public void event() {//이벤트 안내
		
		String dab;
		
		do {
			System.out.println("┌───────────★ Special Random Box 상품 구성 ★────────────┐");
			System.out.println("│                                                                                │");
			System.out.println("│                     피부 타입에 맞는 신상 파운데이션 1종                       │");
			System.out.println("│                                                                                │");
			System.out.println("│           올리브영 1위 달성한 아이쉐도우, 아이라이너, 마스카라, 립스틱         │");
			System.out.println("│                                중 2개 랜덤 발송                                │");
			System.out.println("│                                                                                │");
			System.out.println("└────────────────────────────────────────┘\n");
			System.out.print("랜덤박스 이벤트에 참여하시겠습니까? [Y/N]");
			dab = sc.next();
						
		}while(!dab.equals("Y") && !dab.equals("N"));
		
		if(dab.equals("Y")) {
			
			System.out.println("\n\n해당되는 피부 타입의 번호를 입력해주세요!\n");
			System.out.println("      ▼ 피부 타입 목록 ▼");
			System.out.print("1. 21호_지성 (CoolMatt 파운데이션 제공)\n2. 21호_건성 (CoolGlow 파운데이션 제공)\n3. 23호_지성 (WarmMatt 파운데이션 제공)\n4. 23호_건성 (WarmGlow 파운데이션 제공)\n");
			
			type = sc.nextInt();	
			System.out.printf("선택하신 피부 타입은 %s번 입니다.",type);
			
		}else if(dab.equals("N")) {
			System.out.println("이벤트 참여가 종료되었습니다.");
			System.exit(0);
		}				
	}

	@Override
	public void ranran() { //랜덤
		
		Random rd = new Random();

		int co=2; //당첨될 화장품 개수 
		int n=0;

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

		System.out.printf("                   ~~~~~~~  축하합니다! \\^o^/  ~~~~~~~");
		System.out.printf("\n\n당첨된 랜덤박스 SET는 <%s 파운데이션> ",fd[type-1]);
		
		for(int su : num) { 
			System.out.printf("<%s> ",cos[su-1]);
		} System.out.print("입니다!");

		System.out.printf("\n\n%s님이 받으실 주소는 아래와 같습니다.\n", pj.getName() );
		System.out.println("배송지 주소 : "+ pj.getAddress());
	}

	public void check() { //이벤트 결과 확인
		
		int suu; 

		while(true) {
			System.out.println("\n===============================================================================================================================================");
			System.out.println("                                                                      <메뉴>");
			System.out.println("\n                 1.당첨 확인                    2.배송지 변경                    3.연락처 변경                    4.종료");
			System.out.println("===============================================================================================================================================\n");
			
			suu = sc.nextInt();

			switch(suu) {
			case 1:
				System.out.println("[1. 당첨 확인]\n");
				System.out.printf("%s님이 당첨된 화장품은 <%s 파운데이션> ",pj.getName(),fd[type-1]);
				for(int su : num) { 
					System.out.printf("<%s> ",cos[su-1]);
				}
				System.out.print("이며, \n받아보실 주소와 연락처는 아래와 같습니다.\n\n");
				System.out.println("주소 : "+ pj.getAddress());
				System.out.println("\n연락처 : " + pj.getTel());
				break;
			case 2:
				System.out.println("[2. 배송지 변경]\n");
				System.out.print("변경할 배송지 주소를 입력해주세요.");
				pj.setAddress(sc.next());
				System.out.println("\n변경되었습니다!");
				System.out.println("\n변경된 주소 : "+ pj.getAddress());
				break;	
			case 3:
				System.out.println("[3. 연락처 변경]\n");
				System.out.print("변경할 연락처를 입력해주세요.");
				pj.setTel(sc.next());
				System.out.println("\n변경되었습니다!");
				System.out.println("\n변경된 연락처 : " + pj.getTel());
				break;
			case 4:
				System.out.println("이벤트 페이지를 종료합니다.");
				System.exit(0);

			default :
				System.out.println("숫자 입력 오류!");

			}
		}		
	}

	@Override
	public void run() {
		
		while(true) {
			System.out.print("♥");
			
			try {				
				Thread.sleep(500);
				
				if(cnt==9)
					break;
				
				cnt++;				
				
			} catch (Exception ie) {
				System.out.println(ie.toString());
			}			
		}
		
		try {			
			System.out.println("\r\n" + 
					"\r\n" +   
					"                                                                      \r\n" +
					"                                                                      \r\n" +
					"                                                                      \r\n" +
					"                          @#   ,#$              *==$$==!              \r\n" + 
					"                        #@  @@:@@@;-@#.        -$@@.-@@=.             \r\n" + 
					"                       .@@  $@@;~~=@:$@-         !@..@!               \r\n" + 
					"                      .@!  ;@* ~@@-  @@          *@@@@~               \r\n" +  
					"                  ~@@@!=@@=@@@$;  .##~                                \r\n" + 
					"                 =#,     .@@@@*  =@@      -#                          \r\n" + 
					"                  :*@@@@@@@@* !:!@;.    -:=**:                        \r\n" + 
					"                    ..*@@@@@: ~@@-       -$.@.                        \r\n" + 
					"                   ~~@@@@*~ $:@=-        ,$*#        ~@-              \r\n" + 
					"                 ,$@@-$@!   #@=            .       $$#~@$*            \r\n" + 
					"                == ,@#*  .@#! ,;@-                 -@*,;$             \r\n" + 
					"                   @@   *@=     #$=                 ##@@:             \r\n" + 
					"                   ;@!:*@*~~~~~~;~!~~~~~~~~~         ==               \r\n" + 
					"                     !#@@@#######@@##@#######@!                       \r\n" + 
					"                      :$@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       $@       @@ -@~      @@.                       \r\n" + 
					"                       -!@@@@@@@@@@@@@@@@@@@@;-                       \r\n" +  
					"");
			
			Thread.sleep(1000);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}		
	}
}
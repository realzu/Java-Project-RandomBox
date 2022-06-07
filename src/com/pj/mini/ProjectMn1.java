package com.pj.mini;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ProjectMn1 {
	
	/*//public static void main(String[] args) {
	
	ProjectMnVO pj = new ProjectMnVO();


	Scanner sc = new Scanner(System.in);
	
	private ArrayList<ProjectMnVO>lists = new ArrayList<>(); //ProjectMn�³�
	
	//Random rd = new Random();
	
	
	public int input() throws Exception{
		
		int result = 0;
				
		System.out.print("�̸�?");
		pj.setName(sc.next());
		
		System.out.print("���̵�? [���ҹ���,5-10��]");
		pj.setId(sc.next());
		
		if(5>pj.getId().length()||pj.getId().length()>10) 
			throw new Exception("���̵��� ���̴� 5~10�� �Դϴ�.");						
		
		for(int i=0;i<pj.getId().length();i++) {
			
			char chid = pj.getId().charAt(i);
			
			if((chid<'a')||(chid>'z'))
				throw new Exception("���̵�� ���ҹ��ڸ� �����մϴ�."); //new Exception�ߺ� ����?		
		}
		
		System.out.print("��й�ȣ? [������+����, 6-20��]");
		pj.setPw(sc.next());
		
		if(6>pj.getPw().length()||pj.getPw().length()>20)
			throw new Exception("��й�ȣ�� ���̴� 6~20�� �Դϴ�.");
		
		int eng=0, num=0;
		
		for(int j=0;j<pj.getPw().length();j++) {
			
			char chpw = pj.getPw().charAt(j);
			
			if(('a'<=chpw && chpw<='z')||(chpw>='A' && chpw<='Z')) {
				eng++;				
			}else if(0<=num && num<=9) {
				num++;
			}			
		} if(eng==0||num==0)
			throw new Exception("��й�ȣ�� ������ �� ���ڸ� �����մϴ�.");
		
		String pww;
		do {
			System.out.print("��й�ȣ ��Ȯ��?");
			 pww = sc.next();
		}while(!pww.equals(pj.getPw()));	//pww�� �ȹ޳�?
		
		//pj.setPw(sc.next());
				
		System.out.print("�޴��� ��ȣ?");
		pj.setTel(sc.nextInt());
		
		System.out.print("�ּ�? [ex.����Ư���� ������ ���ﵿ 123-4");
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
	
	
	public void event() { //void�³�?int..?
		
		System.out.print("�����ڽ� �̺�Ʈ�� �����Ͻðڽ��ϱ�? [Y/N]");
		String dab = sc.next();
		
		do {			
			System.out.println("Y/N�� ��Ȯ�ϰ� �Է����ּ���.");
			dab = sc.next();
		}while(!dab.equals("Y") && !dab.equals("N"));	//&&��
		
		if(dab.equals("Y")) {
			
			System.out.println("�ش�Ǵ� �Ǻ� Ÿ���� ��ȣ�� �������ּ���!");
			System.out.print("1. 21ȣ_���� / 2. 21ȣ_�Ǽ� / 3. 23ȣ_���� / 4. 23ȣ_�Ǽ�");
			
			int type = sc.nextInt();	
			
		}else if(dab.equals("N")) {
			System.exit(0);
		}		
	}
	
	private static String[] cos =
		{"���̽�����", "���̶��̳�","����ī��","����ƽ"};
	
	public static void main(String[] args) throws Exception {
		
		Random rd = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		ProjectMn1 ob = new ProjectMn1();
		
		int ch;
		
		while(true) {
			
			do {
				System.out.print("1.�Է� 2.��� 3.����");
				ch = sc.nextInt();
			}while(ch<1);
			
			switch (ch) {
			case 1: ob.input(); break;
			case 2: ob.print(); break;
			default: ob.event(); break;
			}
		
		}
		
		//Random rd = new Random();

		int co=2; //��÷�� ȭ��ǰ ���� 
		int n=0;
		int num[];

		num = new int[co];

		while(n<co) {
			num[n] = rd.nextInt(4)+1;
			for(int i=0;i<n;i++) {//�ߺ��� �� �����ϱ�
				if(num[i]==num[n]) {
					n--; 
					break;
				}
			}
			n++;
		} 

		System.out.print("�����մϴ�!\n\n��÷�� ȭ��ǰ�� <%s> ");
		//System.out.printf("�����մϴ�!\n\n��÷�� ȭ��ǰ�� <%d>",�ĵ� ����);
		for(int su : num) { 
			System.out.printf("<%s> ",cos[su-1]);
		}
		System.out.print("�Դϴ�!");
		

		System.out.println("\n\n%s���� ������ �ּҴ� �Ʒ��� �����ϴ�.");
		//		System.out.println("�޴� ��� : "+);
		//		System.out.println("�ּ� : "+);
		//		System.out.println("��ȣ : "+);


		int suu; 

		while(true) {
			System.out.println("\n\n1.��÷ Ȯ�� 2.ȸ������ ���� 3.����");
			suu = sc.nextInt();

			switch(suu) {
			case 1:
				System.out.print("%s���� ��÷�� ȭ��ǰ�� \n<%d> ");
				for(int su : num) { 
					System.out.printf("<%s> ",cos[su-1]);
				}
				System.out.print("�̸�, �޾ƺ��� �ּҴ� �Ʒ��� �����ϴ�.");
				//System.out.println("�ּ� : "+);
				break;
			case 2:
				System.out.println("�ּҺ���!");
				break;	
			case 3:
				System.out.println("�̺�Ʈ ���� �����մϴ�.");
				System.exit(0);

			default :
				System.out.println("���� �Է� ����!");

			}
		}
	}
*/

	}



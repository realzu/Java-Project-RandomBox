package com.pj.mini;

import java.util.Random;
import java.util.Scanner;


public class RandomCos {

	private static String[] cos =
		{"���̽�����", "���̶��̳�","����ī��","����ƽ"};

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

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
}
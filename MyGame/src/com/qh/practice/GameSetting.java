package com.qh.practice;

import java.util.Scanner;

/**
 * ��Ϸ����
 * @author Administrator
 *
 */
public class GameSetting {
	 int gameDifficulty;//��Ϸ�Ѷ�
	LeadingRole leadingrole;
	Monster monster;

	int k1=0,k2=0,k3=0,k4=0,k5=0,k6=0,k7=0,k8=0,k9=0,k10=0;//��־λ���ж��������Ƿ����
	public void setting() {
		leadingrole=new LeadingRole();
		System.out.println("��������������:");
		Scanner inputN = new Scanner(System.in);
		leadingrole.name = inputN.next();
		
		System.out.println("��������������ֵ:");
		Scanner inputL = new Scanner(System.in);
		leadingrole.initialLifeValue=inputL.nextInt();
		
		System.out.println("���������ǹ�����:");
		Scanner inputA = new Scanner(System.in);
		leadingrole.aggressivity=inputA.nextInt();
		
		System.out.println("���������Ƿ�����:");
		Scanner inputD = new Scanner(System.in);
		leadingrole.defensivePower=inputD.nextInt();
		
		System.out.println("��������������:");
		Scanner inputAG = new Scanner(System.in);
		leadingrole.agile=inputAG.nextInt();
		
		System.out.println("��������Ϸ�Ѷ�");
		Scanner inputDF = new Scanner(System.in);
		this.gameDifficulty=inputDF.nextInt();
	}
	//С�ֳ�ʼ������ʼ��Ϸ
	public void startGame1() {
		switch(this.gameDifficulty) {
		case 1:
			monster=new Monster(1);
			monster.initialize();
		if(k1==0) {
			System.out.println(leadingrole.name+" ���� "+monster.address+"��������3��"+monster.name+"��");
			k1++;
		}
		break;
		case 2:
			monster=new Monster(2);
			monster.initialize();
			if(k2==0) {
				System.out.println(leadingrole.name+" ���� "+monster.address+"��������3��"+monster.name+"��");
				k2++;
			}
			break;
		case 3:
			monster=new Monster(3);
			monster.initialize();
			if(k3==0) {
				System.out.println(leadingrole.name+" ���� "+monster.address+"��������3��"+monster.name+"��");
				k3++;
			}
			break;
		case 4:
			monster=new Monster(4);
			monster.initialize();
			if(k4==0) {
				System.out.println(leadingrole.name+" ���� "+monster.address+"��������3��"+monster.name+"��");
				k4++;
			}
			break;
		case 5:
			monster=new Monster(5);
			monster.initialize();
			if(k5==0) {
				System.out.println(leadingrole.name+" ���� "+monster.address+"��������3��"+monster.name+"��");
				k5++;
			}
			break;
		case 6:
			monster=new Monster(6);
			monster.initialize();
			if(k6==0) {
				System.out.println(leadingrole.name+" ���� "+monster.address+"��������3��"+monster.name+"��");
				k6++;
			}
			break;
		case 7:
			monster=new Monster(7);
			monster.initialize();
			if(k7==0) {
				System.out.println(leadingrole.name+" ���� "+monster.address+"��������3��"+monster.name+"��");
				k7++;
			}
			break;
		case 8:
			monster=new Monster(8);
			monster.initialize();
			if(k8==0) {
				System.out.println(leadingrole.name+" ���� "+monster.address+"��������3��"+monster.name+"��");
				k8++;
			}
			break;
		case 9:
			monster=new Monster(9);
			monster.initialize();
			if(k9==0) {
				System.out.println(leadingrole.name+" ���� "+monster.address+"��������3��"+monster.name+"��");
				k9++;
			}
			break;
		case 10:
			monster=new Monster(10);
			monster.initialize();
			if(k10==0) {
				System.out.println(leadingrole.name+" ���� "+monster.address+"��������3��"+monster.name+"��");
				k10++;
			}
			break;
			default:
				
				break;
		}
	}
	//boss��ʼ������ʼ��Ϸ
	public void startGame2() {
		switch(this.gameDifficulty+10) {
		case 11:
			monster=new Monster(11);
			monster.initialize();
			System.out.println(leadingrole.name+"������BOSS-"+monster.name+"��");
		break;
		case 12:
			monster=new Monster(12);
			monster.initialize();
			System.out.println(leadingrole.name+"������BOSS-"+monster.name+"��");
			break;
		case 13:
			monster=new Monster(13);
			monster.initialize();
			System.out.println(leadingrole.name+"������BOSS-"+monster.name+"��");
			break;
		case 14:
			monster=new Monster(14);
			monster.initialize();
			System.out.println(leadingrole.name+"������BOSS-"+monster.name+"��");
			break;
		case 15:
			monster=new Monster(15);
			monster.initialize();
			System.out.println(leadingrole.name+"������BOSS-"+monster.name+"��");
			break;
		case 16:
			monster=new Monster(16);
			monster.initialize();
			System.out.println(leadingrole.name+"������BOSS-"+monster.name+"��");
			break;
		case 17:
			monster=new Monster(17);
			monster.initialize();
			System.out.println(leadingrole.name+"������BOSS-"+monster.name+"��");
			break;
		case 18:
			monster=new Monster(18);
			monster.initialize();
			System.out.println(leadingrole.name+"������BOSS-"+monster.name+"��");
			break;
		case 19:
			monster=new Monster(19);
			monster.initialize();
			System.out.println(leadingrole.name+"������BOSS-"+monster.name+"��");
			break;
		case 20:
			monster=new Monster(20);
			monster.initialize();
			System.out.println(leadingrole.name+"������BOSS-"+monster.name+"��");
			break;
			default:
				
				break;
		}
	}
	public void beat()  {
		int i=0,j=0;
		int value1=leadingrole.aggressivity-monster.defensivePower;
		if(value1<0) {
			value1=0;
		}
		int value2=monster.aggressivity-leadingrole.defensivePower;
		if(value2<0) {
			value2=0;
		}
		while(monster.initialLifeValue>0&&leadingrole.initialLifeValue>0) {
			if(leadingrole.agile>=monster.agile&&i<=j) {
				System.out.println(leadingrole.name+" ��"+
			monster.name+" �����˽���, "+"��"+monster.name+"�����"+value1+"���˺�");
				monster.initialLifeValue=monster.initialLifeValue-value1;
				i++;
			}else if(leadingrole.agile<monster.agile&&i>=j) {
				System.out.println(monster.name+" ��"+
						leadingrole.name+" �����˽���, "+"��"+leadingrole.name+"�����"+value2+"���˺�");
				leadingrole.initialLifeValue=leadingrole.initialLifeValue-value2;
				j++;
			}else if(leadingrole.agile<monster.agile) {
				System.out.println(leadingrole.name+" ��"+
						monster.name+" �����˽���, "+"��"+monster.name+"�����"+value1+"���˺�");
							monster.initialLifeValue=monster.initialLifeValue-value1;
							i++;
			}else if(leadingrole.agile>=monster.agile) {
				System.out.println(monster.name+" ��"+
						leadingrole.name+" �����˽���, "+"��"+leadingrole.name+"�����"+value2+"���˺�");
				leadingrole.initialLifeValue=leadingrole.initialLifeValue-value2;
				j++;
			}
		}
		if(leadingrole.initialLifeValue<=0) {
			System.out.println(leadingrole.name+"������֧��������"+monster.address+"��");
			System.exit(-1);
		}else {
			System.out.println(monster.name+"���ˡ�");
		}
	}
	public void choose()  {
		System.out.println(leadingrole.name+"����ǰ��(����1)");
		System.out.println("*****");
		System.out.println("��ʾ����"+leadingrole.name+"Ѫ��(����2)");
		Scanner s1=new Scanner(System.in);
		int value=s1.nextInt();
		if(value==2) {
			System.out.println(leadingrole.name+"�ĵ�ǰ����ֵΪ"+leadingrole.initialLifeValue);
			
			System.out.println(leadingrole.name+"����ǰ��(����1)");
			System.out.println("*****");
			System.out.println(leadingrole.name+"�˳���Ϸ(����0)");
			Scanner s2=new Scanner(System.in);
			int value1=s2.nextInt();
			if(value1==0) {
				System.exit(-1);
			}else if(value1==1) {
				System.out.println(leadingrole.name+"��ʼ����ǰ��");
			}
		}else if(value==1) {
			System.out.println(leadingrole.name+"��ʼ����ǰ��");
		}
		
	}
}

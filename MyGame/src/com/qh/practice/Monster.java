package com.qh.practice;

public class Monster {
	 int id;//�ؿ���
	 String address;//����Ķ�������
	 String name;  //���������
     int  initialLifeValue; //����ĳ�ʼ����ֵ
     int aggressivity; //����Ĺ�����
      int defensivePower;//����ķ�����
      int agile; //���������
	public Monster(int id) {
		super();
		this.id = id;
	}
      
      public void initialize() {
    	  switch(id) {
    	  case 1:
    		  name="С����";
    		  initialLifeValue=1;
    		  aggressivity=1;
    		  defensivePower=1;
    		  agile=1;
    		  address="�޵׶�";
    		  break;
    	  case 2:
    		  name="СЫ��";
    		  initialLifeValue=2;
    		  aggressivity=2;
    		  defensivePower=2;
    		  agile=2;
    		  address="���ö�";
    		  break;
    	  case 3:
    		  name="С����";
    		  initialLifeValue=4;
    		  aggressivity=4;
    		  defensivePower=4;
    		  agile=4;
    		  address="�ڷ綴";
    		  break;
    	  case 4:
    		  name="С֩��";
    		  initialLifeValue=8;
    		  aggressivity=8;
    		  defensivePower=8;
    		  agile=8;
    		  address="��˿��";
    		  break;
    	  case 5:
    		  name="Сʨ��";
    		  initialLifeValue=16;
    		  aggressivity=16;
    		  defensivePower=16;
    		  agile=16;
    		  address="ʨ�ն�";
    		  break;
    	  case 6:
    		  name="С����";
    		  initialLifeValue=32;
    		  aggressivity=32;
    		  defensivePower=32;
    		  agile=32;
    		  address="����";
    		  break;
    	  case 7:
    		  name="С����";
    		  initialLifeValue=64;
    		  aggressivity=64;
    		  defensivePower=64;
    		  agile=64;
    		  address="������";
    		  break;
    	  case 8:
    		  name="С¹��";
    		  initialLifeValue=128;
    		  aggressivity=128;
    		  defensivePower=128;
    		  agile=128;
    		  address="�廪��";
    		  break;
    	  case 9:
    		  name="С����";
    		  initialLifeValue=256;
    		  aggressivity=256;
    		  defensivePower=256;
    		  agile=256;
    		  address="������";
    		  break;
    	  case 10:
    		  name="СϬţ";
    		  initialLifeValue=512;
    		  aggressivity=512;
    		  defensivePower=512;
    		  agile=512;
    		  address="��Ӣ��";
    		  break;
    		  case 11:
          		  name="��ë����";
          		  initialLifeValue=2;
          		  aggressivity=2;
          		  defensivePower=2;
          		  agile=2;
          		  address="�޵׶�";
          		  break;
          	  case 12:
          		  name="Ы�Ӿ�";
          		  initialLifeValue=4;
          		  aggressivity=4;
          		  defensivePower=4;
          		  agile=4;
          		  address="���ö�";
          		  break;
          	  case 13:
          		  name="���ܾ�";
          		  initialLifeValue=8;
          		  aggressivity=8;
          		  defensivePower=8;
          		  agile=8;
          		  address="�ڷ綴";
          		  break;
          	  case 14:
          		  name="֩�뾫";
          		  initialLifeValue=16;
          		  aggressivity=16;
          		  defensivePower=16;
          		  agile=16;
          		  address="��˿��";
          		  break;
          	  case 15:
          		  name="��ʨ";
          		  initialLifeValue=32;
          		  aggressivity=32;
          		  defensivePower=32;
          		  agile=32;
          		  address="ʨ�ն�";
          		  break;
          	  case 16:
          		  name="����";
          		  initialLifeValue=64;
          		  aggressivity=64;
          		  defensivePower=64;
          		  agile=64;
          		  address="����";
          		  break;
          	  case 17:
          		  name="����";
          		  initialLifeValue=128;
          		  aggressivity=128;
          		  defensivePower=128;
          		  agile=128;
          		  address="������";
          		  break;
          	  case 18:
          		  name="¹��";
          		  initialLifeValue=256;
          		  aggressivity=256;
          		  defensivePower=256;
          		  agile=256;
          		  address="�廪��";
          		  break;
          	  case 19:
          		  name="��Ҷ���Ӿ�";
          		  initialLifeValue=512;
          		  aggressivity=512;
          		  defensivePower=512;
          		  agile=512;
          		  address="������";
          		  break;
          	  case 20:
          		  name="Ϭţ��";
          		  initialLifeValue=1024;
          		  aggressivity=1024;
          		  defensivePower=1024;
          		  agile=1024;
          		  address="��Ӣ��";
          		  break;
          	 default:
   			  break;
    	  }
      }
}

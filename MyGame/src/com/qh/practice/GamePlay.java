package com.qh.practice;
/**
 * ��Ϸ������
 * @author Administrator
 *
 */
public class GamePlay {
        public static void main(String[] args) throws Throwable  {
        	
        	GamePlay gameplay1=new GamePlay();
        	GameSetting gameSetting1=gameplay1.settingGame();

        	while(gameSetting1.leadingrole.initialLifeValue>0&&gameSetting1.gameDifficulty<11) {
        		gameplay1.startGame(gameSetting1);
        	}
        	if(gameSetting1.gameDifficulty==11) {
        		System.out.println(gameSetting1.leadingrole.name+"�������йؿ���������һ���򾡣�");
        	}
        }
        public  GameSetting settingGame() {
        	     GameSetting game=new GameSetting();
			     game.setting();
                 return game;
        }
        public   void startGame(GameSetting game) throws Throwable {
        	
    		//��һ��
			for(int i=0;i<3;i++) {
				game.startGame1();
			    game.beat();
			}
		  game.choose();//�û�����ѡ��
		  //�ڶ���
		 for(int i=0;i<3;i++) {
			game.startGame1();
		    game.beat();
		 }
		 game.choose();//�û�����ѡ��
		 //������
		 game.startGame2();
		 game.beat();
		 game.choose();//�û�����ѡ��
		 game.gameDifficulty++;
		}
        }


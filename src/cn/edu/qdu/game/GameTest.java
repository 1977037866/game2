package cn.edu.qdu.game;

public class GameTest {
	public static void main(String[] args) {
		Judge judge=new Judge();
		String yn=null;
		judge.startGame();
		judge.askName();
		do{
		   judge.playGame();
		   yn=judge.isContinue();
		}while(yn.equalsIgnoreCase("y"));	
		judge.finalResult();
	}
}

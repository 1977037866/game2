package cn.edu.qdu.game;

import java.util.Scanner;

public class Judge {
	//属性
    int total;
    //关联关系
    private Person person=new Person();
	private Computer computer=new Computer();	 
	//宣布游戏开始及规则
	public void startGame(){
		System.out.println("\t\t-------------------------------");
		System.out.println("\t\t|           猜拳，开始                        |");
		System.out.println("\t\t-------------------------------");
        System.out.println("出拳规则：1.剪刀  2.石头  3.布");        
	}
	//确定玩家姓名
	public void askName(){
		System.out.print("请选择对方角色（1.刘备  2.孙权  3.曹操）：");
		computer.inputName();		
		System.out.print("请输入你的姓名：");
		person.inputName();
	}	 
	//正式开始游戏
	public void playGame(){
		System.out.println();
		System.out.println(person.getPlayerName()+" VS "+computer.getPlayerName()+" 对战");		 		
		System.out.print("请出拳：1.剪刀  2.石头  3.布（输入相应数字）：");
		System.out.println("你出拳："+person.myFist());
		System.out.println(computer.getPlayerName()+"出拳："+computer.myFist());
		//判断本轮结果
		if(person.getPerFist()>computer.getComFist()){
			computer.setWinningTimes(1);
			System.out.println("结果：你输了，真笨！");
	    }else if(person.getPerFist()<computer.getComFist()){
	    	person.setWinningTimes(1);
	        System.out.println("结果：你赢了，厉害！");
	    }else{
	        System.out.println("结果：哈哈，平局！");
	    }
		total++;
	}
	//询问是否继续游戏
	public String isContinue(){
		System.out.print("是否开始下一轮？（y/n）");
		Scanner inputchoice=new Scanner(System.in);
		return (inputchoice.nextLine());
 	}
	//确定最后结果
	public void finalResult(){
		System.out.println(person.getPlayerName()+" VS "+computer.getPlayerName());
		System.out.println("对战次数："+total);
		System.out.println();
		System.out.println("姓名\t得分");
		System.out.println(person.getPlayerName()+"\t"+person.getWinningTimes());
		System.out.println(computer.getPlayerName()+"\t"+computer.getWinningTimes());
		if(person.getWinningTimes()>computer.getWinningTimes()){
			System.out.println("结果：恭喜恭喜！");
		}else if(person.getWinningTimes()<computer.getWinningTimes()){
			System.out.println("结果：下次加油！");
		}else{
			System.out.println("结果：平局哦！");
		}
	}
	
}

package cn.edu.qdu.game;

import java.util.Scanner;

public class Computer extends Player {
	//出拳选择，便于后续判断输赢
	private int comFist;
	public int getComFist() {
		return comFist;
	}
	public void setComFist(int comFist) {
		this.comFist = comFist;
	}
	//重写方法
	public void inputName(){		 
		Scanner inputName=new Scanner(System.in);
		int choice=inputName.nextInt();
		if(choice==1){
			setPlayerName("刘备"); 
		}else if(choice==2){
			setPlayerName("孙权");
		}else{
			setPlayerName("曹操");
		}	 
//		优化
//		String[] name={"刘备","孙权","曹操"};
//		setPlayerName(name[choice-1]);
	}
	public String myFist(){
		setComFist((int)(Math.random()*3+1));//随机1-3
		if(getComFist()==1){
			return "剪刀";
		}else if(getComFist()==2){
			return "石头";
		}else{
			return "布";
		}		
	}
}

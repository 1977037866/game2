package cn.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player {
	//出拳选择，便于后续判断输赢
    private int perFist;
    public int getPerFist() {
		return perFist;
	}
	public void setPerFist(int perFist) {
		this.perFist = perFist;
	}
	public void inputName(){	
		Scanner inputName=new Scanner(System.in);
		setPlayerName(inputName.nextLine());		 
	}
	public String myFist(){	
		Scanner inputFist=new Scanner(System.in);
		setPerFist(inputFist.nextInt());
		if(getPerFist()==1){
			return "剪刀";
		}else if(getPerFist()==2){
			return "石头";
		}else{
			return "布";
		}		 		 
	}
}

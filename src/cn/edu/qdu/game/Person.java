package cn.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player {
	//��ȭѡ�񣬱��ں����ж���Ӯ
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
			return "����";
		}else if(getPerFist()==2){
			return "ʯͷ";
		}else{
			return "��";
		}		 		 
	}
}

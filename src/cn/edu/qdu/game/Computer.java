package cn.edu.qdu.game;

import java.util.Scanner;

public class Computer extends Player {
	//��ȭѡ�񣬱��ں����ж���Ӯ
	private int comFist;
	public int getComFist() {
		return comFist;
	}
	public void setComFist(int comFist) {
		this.comFist = comFist;
	}
	//��д����
	public void inputName(){		 
		Scanner inputName=new Scanner(System.in);
		int choice=inputName.nextInt();
		if(choice==1){
			setPlayerName("����"); 
		}else if(choice==2){
			setPlayerName("��Ȩ");
		}else{
			setPlayerName("�ܲ�");
		}	 
//		�Ż�
//		String[] name={"����","��Ȩ","�ܲ�"};
//		setPlayerName(name[choice-1]);
	}
	public String myFist(){
		setComFist((int)(Math.random()*3+1));//���1-3
		if(getComFist()==1){
			return "����";
		}else if(getComFist()==2){
			return "ʯͷ";
		}else{
			return "��";
		}		
	}
}

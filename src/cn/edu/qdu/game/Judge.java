package cn.edu.qdu.game;

import java.util.Scanner;

public class Judge {
	//����
    int total;
    //������ϵ
    private Person person=new Person();
	private Computer computer=new Computer();	 
	//������Ϸ��ʼ������
	public void startGame(){
		System.out.println("\t\t-------------------------------");
		System.out.println("\t\t|           ��ȭ����ʼ                        |");
		System.out.println("\t\t-------------------------------");
        System.out.println("��ȭ����1.����  2.ʯͷ  3.��");        
	}
	//ȷ���������
	public void askName(){
		System.out.print("��ѡ��Է���ɫ��1.����  2.��Ȩ  3.�ܲ٣���");
		computer.inputName();		
		System.out.print("���������������");
		person.inputName();
	}	 
	//��ʽ��ʼ��Ϸ
	public void playGame(){
		System.out.println();
		System.out.println(person.getPlayerName()+" VS "+computer.getPlayerName()+" ��ս");		 		
		System.out.print("���ȭ��1.����  2.ʯͷ  3.����������Ӧ���֣���");
		System.out.println("���ȭ��"+person.myFist());
		System.out.println(computer.getPlayerName()+"��ȭ��"+computer.myFist());
		//�жϱ��ֽ��
		if(person.getPerFist()>computer.getComFist()){
			computer.setWinningTimes(1);
			System.out.println("����������ˣ��汿��");
	    }else if(person.getPerFist()<computer.getComFist()){
	    	person.setWinningTimes(1);
	        System.out.println("�������Ӯ�ˣ�������");
	    }else{
	        System.out.println("�����������ƽ�֣�");
	    }
		total++;
	}
	//ѯ���Ƿ������Ϸ
	public String isContinue(){
		System.out.print("�Ƿ�ʼ��һ�֣���y/n��");
		Scanner inputchoice=new Scanner(System.in);
		return (inputchoice.nextLine());
 	}
	//ȷ�������
	public void finalResult(){
		System.out.println(person.getPlayerName()+" VS "+computer.getPlayerName());
		System.out.println("��ս������"+total);
		System.out.println();
		System.out.println("����\t�÷�");
		System.out.println(person.getPlayerName()+"\t"+person.getWinningTimes());
		System.out.println(computer.getPlayerName()+"\t"+computer.getWinningTimes());
		if(person.getWinningTimes()>computer.getWinningTimes()){
			System.out.println("�������ϲ��ϲ��");
		}else if(person.getWinningTimes()<computer.getWinningTimes()){
			System.out.println("������´μ��ͣ�");
		}else{
			System.out.println("�����ƽ��Ŷ��");
		}
	}
	
}

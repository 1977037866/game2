package cn.edu.qdu.game;

public abstract class Player {
    //����
	private String playerName;	 
	private int winningTimes;
	//��̬��
	//��ʼ����
	//���췽��
	//��Ա����
	public abstract  void inputName();
	public abstract String myFist();
	//Getter��Setter����
    public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getWinningTimes() {
		return winningTimes;
	}
	public void setWinningTimes(int winningTimes) {
		this.winningTimes += winningTimes;
	}
}

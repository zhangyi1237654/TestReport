package beans;
//�����
public class User {

	//���id
	private int UserId;
	//�������
	private String userName;
	//�������
	private int userAge;
	//����Ա�
	private String userSex;
	//������ڵ���
	private String userArea;
	//��ҵ绰
	private int userTel;
	
	public User(){
		
	}

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserArea() {
		return userArea;
	}

	public void setUserArea(String userArea) {
		this.userArea = userArea;
	}

	public int getUserTel() {
		return userTel;
	}

	public void setUserTell(int userTel) {
		this.userTel = userTel;
	}
	
	
	
}

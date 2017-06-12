package beans;
//买家类
public class User {

	//买家id
	private int UserId;
	//买家姓名
	private String userName;
	//买家年龄
	private int userAge;
	//买家性别
	private String userSex;
	//买家所在地区
	private String userArea;
	//买家电话
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

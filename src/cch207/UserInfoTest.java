package cch207;

public class UserInfoTest {

	public static void main(String[] args) {
		
		UserInfo userLee = new UserInfo();
		userLee.userId = "a12345";
		userLee.userPassWord = "zxcvbn12345";
		userLee.userName = "Lee";
		userLee.phoneNumber = "01034556699";
		userLee.userAddress = "Seoul, korea";
		
		System.out.println(userLee.showUseInfo());
		
		UserInfo userKim = new UserInfo("b12345", "09876mnbvc", "Kim");
		System.out.println(userKim.showUseInfo());
	}

}

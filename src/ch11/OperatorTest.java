package ch11;

public class OperatorTest {

	public static void main(String[] args) {

		int gamescore = 150;
		
		int lastscore = gamescore--;	//gamescore += 1; gamescore = gamescore +1;
		
		System.out.println(lastscore);
		System.out.println(gamescore);
	}

}

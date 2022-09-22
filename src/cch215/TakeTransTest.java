package cch215;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentD = new Student("Doy", 20000);
		Taxi goodTaxi = new Taxi("잘 가다 운수");
		studentD.takeTaxi(goodTaxi);
		
		studentD.showInfo();
		goodTaxi.shoeTaxiInfo();
	}

}

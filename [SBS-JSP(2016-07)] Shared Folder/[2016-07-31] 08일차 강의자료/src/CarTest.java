
public class CarTest {

	public static void main(String[] args) {

		Car myCar = new Car();
		FireEngine fe;
		fe = (FireEngine) myCar;
		
		fe.drive();
		fe.stop();
		//fe.water();
		
	}

}

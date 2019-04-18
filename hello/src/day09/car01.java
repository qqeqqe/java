package day09;

public class car01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		car.printCar();
		car.turnOn();
		car.printCar();
		
		
		car.setGear('D');
		for(int i = 0; i<50; i++)
		car.accCar();
		car.printCar();
		car.turnOff();
		car.turnOn();
	}

}

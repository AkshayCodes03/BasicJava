package OOProgrammingBasic;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car car = new Car();
		System.out.println(car.getDoors() + " " + car.getEngine() + " " + car.getSpeed());
		car.setSpeed(10);
		System.out.println(car.getDoors() + " " + car.getEngine() + " " + car.getSpeed());
	}

}

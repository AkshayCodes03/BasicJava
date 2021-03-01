package OOProgrammingBasic;

public class Car 
{
	private String doors;
	private String engine;
	private int speed;
	
	public Car()
	{
		doors = "Open";
		engine = "off";
		speed = 0;
	}
	
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	

}

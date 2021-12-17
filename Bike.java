package practiceQuestions;

public class Bike {
	private String bikeName;
	private int tankCapacity;
	
	public Bike(String bikeName, int tankCapacity) {
		super();
		this.bikeName = bikeName;
		this.tankCapacity = tankCapacity;
	}
	
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public int getTankCapacity() {
		return tankCapacity;
	}
	public void setTankCapacity(int tankCapacity) {
		this.tankCapacity = tankCapacity;
	}
	
	@Override
	public String toString() {
		return "Bike [bikeName=" + bikeName + ", tankCapacity=" + tankCapacity + "]";
	}
	
}

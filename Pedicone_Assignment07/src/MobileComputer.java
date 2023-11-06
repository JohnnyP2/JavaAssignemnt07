
public class MobileComputer extends Computer
{

	private double weight;
	private double screenSize;
	private int battery;
	MobileComputer()
	{
		
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	@Override
	public String toString() {
		return getBrand() +"[weight= " + weight + ", screenSize= " + screenSize + ", battery= " + battery
				 + " Model = " + getModel() + " Processor= " + getProcessor()
				+ ", Ram= " + getRam() + ", Hdd= " + getHdd() + ", Ssd()= " + getSsd() + ", Gpu= "
				+ getGpu() + ", Score= " + getScore() + "]";
	}
	
	





}


public class SmartPhone extends MobileComputer
{
	private String phoneNumber;
	private String carrier;
	
	@Override
	public String toString() {
		return  getBrand() + "[ Number= " + phoneNumber + ", carrier= " + carrier + ", Weight= " + getWeight()
				+ ", Screen Size " + getScreenSize() + ", getBattery= " + getBattery() +
				  ", Model= " + getModel() + ", Processor= "
				+ getProcessor() + ", Ram= " + getRam() + ", Hdd()= " + getHdd() + ", Ssd= " + getSsd()
				+ ", Gpu()= " + getGpu() + ", Score()= " + getScore() + "]";
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	
	
	
	
	
	
	
	
}

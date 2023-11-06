public class Computer 
{
	private String brand;
	private String model;
	private String processor;
	private int ram;
	private int hdd;
	private boolean ssd;
	private String gpu;
	private int score;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHdd() {
		return hdd;
	}
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	public boolean getSsd() {
		return ssd;
	}
	public void setSsd(boolean ssd) {
		this.ssd = ssd;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	Computer()
	{
		 
	}
	private int calculateScore() // Calculates the score of the computer
	{
		int newScore = 0 + (ram*10);
		boolean haveSSD = ssd;
		if(haveSSD) 
		{
			newScore += 50;
		}
		return newScore;
	}
	public int setScore(int ram, boolean ssd) //allows the use of calculateScore outside of the class
	{
		score = calculateScore();
		return score;
	}
	
	public boolean isFaster(Computer computer) // checks if one computer is faster than the other based on the score
	{
		if(this.score > computer.score)
		{
			return true;
		}else
		{
			return false;
		}
	}
}
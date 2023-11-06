// Johnny Pedicone
public class ComputerTester {

	public static void main(String[] args) 
	{
		MobileComputer myLaptop = new MobileComputer();//The first computer 
		
		myLaptop.setBrand("Dell");
		myLaptop.setModel("xps 13");
		myLaptop.setProcessor("Intel i5-4460k");
		myLaptop.setRam(4);
		myLaptop.setHdd(512);
		myLaptop.setSsd(false);
		myLaptop.setGpu("GeForce GTX 660");
		myLaptop.setBattery(100);
		myLaptop.setScreenSize(15);
		myLaptop.setWeight(5);
		myLaptop.setScore(myLaptop.getRam(), myLaptop.getSsd());
		System.out.println(myLaptop.toString());
		MobileComputer myLaptop2 = new MobileComputer();// The second computer
		
		myLaptop2.setBrand("Lenovo");
		myLaptop2.setModel("k450e");
		myLaptop2.setProcessor("Intel i9-9900k");
		myLaptop2.setRam(16);
		myLaptop2.setHdd(1024);
		myLaptop2.setSsd(true);
		myLaptop2.setGpu("GeForceGTX 1060");
		myLaptop2.setBattery(20);
		myLaptop2.setScreenSize(17);
		myLaptop2.setWeight(10);
		myLaptop2.setScore(myLaptop2.getRam(), myLaptop2.getSsd());
		System.out.println(myLaptop2.toString());
	
		System.out.println("-----------------------------------------------------------------------");

		if(myLaptop.isFaster(myLaptop2)) // This if statement compares the 2 scores of the computer to determine which is faster; 
		{
			System.out.println("The first Laptop is faster than The Second");
		}else if (myLaptop2.isFaster(myLaptop)) 
		{
			System.out.println("The Second Laptop is faster than The first");
		}else
		{
			System.out.println("The computers are the same speed!");
		}
		System.out.println("-----------------------------------------------------------------------");

		
		SmartPhone myPhone1 = new SmartPhone();
		SmartPhone myPhone2 = new SmartPhone();
		myPhone1.setBrand("Apple");
		myPhone1.setModel("Iphone 10");
		myPhone1.setProcessor("Apple A5");
		myPhone1.setRam(4);
		myPhone1.setHdd(32);
		myPhone1.setSsd(false);
		myPhone1.setGpu("None");
		myPhone1.setBattery(100);
		myPhone1.setScreenSize(6);
		myPhone1.setWeight(1);
		myPhone1.setPhoneNumber("302-234-1125");
		myPhone1.setCarrier("Verison");
		myPhone1.setScore(myPhone1.getRam(), myPhone1.getSsd());
		System.out.println(myPhone1.toString());
		
		
		myPhone2.setBrand("Samsung");
		myPhone2.setModel("Galaxy S7 Edge");
		myPhone2.setProcessor("Samsung Ultra Chip");
		myPhone2.setRam(8);
		myPhone2.setHdd(16);
		myPhone2.setSsd(false);
		myPhone2.setGpu("None");
		myPhone2.setBattery(100);
		myPhone2.setScreenSize(6.5);
		myPhone2.setWeight(0.5);
		myPhone2.setPhoneNumber("302-757-9484");
		myPhone2.setCarrier("Verison");
		myPhone2.setScore(myPhone2.getRam(), myPhone2.getSsd());
		System.out.println(myPhone2.toString());
	
		System.out.println("-----------------------------------------------------------------------");

		
		if(myPhone1.isFaster(myPhone2)) 
		{
			System.out.println("The first Phone is faster than The Second");
		}else if (myLaptop2.isFaster(myLaptop)) 
		{
			System.out.println("The Second Phone is faster than The first");
		}else
		{
			System.out.println("The Phones are the same speed!");
		}
		
		
	}

}

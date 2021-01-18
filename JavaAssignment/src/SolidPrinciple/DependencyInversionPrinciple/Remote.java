package SolidPrinciple.DependencyInversionPrinciple;

public class Remote {
	
	Battery battery;
	
	Remote(Battery battery)
	{
		 this.battery= battery;
		System.out.println("Remote object created with battery");
	}

	public Battery getBattery() {
		return battery;
	}
	
	
}

package SolidPrinciple.DependencyInversionPrinciple;

public class Remote {
	
	EvereadyBattery battery;
	
	Remote()
	{
		 battery= new EvereadyBattery();
		System.out.println("Remote object created with Eveready battery");
	}
	
}

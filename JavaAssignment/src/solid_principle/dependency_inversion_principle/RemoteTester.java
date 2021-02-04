package solid_principle.dependency_inversion_principle;

public class RemoteTester {
	public static void main(String[] args) {
		Battery battery = new ParasonicBattery();
		Remote remote = new Remote(battery);
		remote.getBattery();
	}
}

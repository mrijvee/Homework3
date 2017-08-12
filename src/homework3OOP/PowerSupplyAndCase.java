package homework3OOP;

public class PowerSupplyAndCase {

	PowerSupply power = new PowerSupply();
	Case pcCase = new Case();

	public void PowerSupplyCase() {
		System.out.println("We are going to need to harness the power of electricity to bring our PC to life.");
		System.out.println("The computer case is where everything comes together.");
		power.powerSupply();
		pcCase.computerCase();
	}

	private class PowerSupply {
		private void powerSupply() {
			System.out.println("PowerSupply is where a quality power supply unit, or PSU, comes into play. Therefore, we'll use 650-watt PSU for the power supply.");
		}
	}

	private class Case {
		private void computerCase() {
			System.out.println("Like a good power source, a nice case can last one multiple rebuilds over many years. Thus, we'll buy Riotoro CR1080");
		}
	}
}

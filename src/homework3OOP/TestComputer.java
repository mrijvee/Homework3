package homework3OOP;

public class TestComputer {

	public static void main(String[] args) {

		GamingComputer computer = new GamingComputer();
		computer.setComputerName("We will name the computer 'UltraDemonic' \n");
		computer.setComputerPrice("The price range will be between $1000 - $2000 \n");
		computer.setMonitorPrice("The price of the monitor will range between $400 - $500 \n");
		System.out.println(computer.getComputerName() + computer.getComputerPrice() + computer.getMonitorPrice());
		Components PC = new Components();
		PC.graphicsCard();
		PC.graphicsCard1();
		PC.graphicsCard2();
		PC.ram();
		PC.backupRam();
		PC.storage();
		PC.Storage1();
		PC.Storage2();
		PowerSupplyAndCase powerCase = new PowerSupplyAndCase();
		powerCase.PowerSupplyCase();

	}

}

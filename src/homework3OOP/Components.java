package homework3OOP;

public class Components extends Memory implements GraphicsCard, Storage {

	public void backupRam() {

		System.out.println("The backup RAM will be used as an alternative in case anything happens to the original \n");
	}

	public void graphicsCard1() {

		System.out.println("We will include EVGA GeForce GTX 970 4GB for Graphics Card 1");

	}

	public void graphicsCard2() {

		System.out.println("For the second graphics card, we will implement MSI Radeon RX 580");

	}

	public void Storage1() {
		System.out.println("Storage 1 will have SSD of 250GB");

	}

	public void Storage2() {
		System.out.println("Storage 2 will have a Hard Drive of 800GB \n");

	}

}

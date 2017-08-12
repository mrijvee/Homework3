package homework3OOP;

public abstract class Memory {

	public void graphicsCard(){
		System.out.println("To have a strong PC running, one must have a graphic card that can play the latest games");
	}

	public void ram(){
		System.out.println("This gaming PC will have 16GB of ram");
	}

	public void storage(){
		System.out.println("We will include the best of both worlds for storages:");
	}

	public abstract void backupRam();

}

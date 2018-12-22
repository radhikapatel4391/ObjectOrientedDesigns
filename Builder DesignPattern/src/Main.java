public class Main {

	public static void main(String[] args) {
		//Using builder to get the object in a single line of code and 
                //without any inconsistent state or arguments management issues		
		Computer comp = new Computer.ComputerBuilder(
				"500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		Boolean b = comp instanceof Computer;
		System.out.println("comp is instaceof Computer object: "+ b);
		System.out.println("HDD: "+comp.getHDD());
		System.out.println("RAM: "+comp.getRAM());
		System.out.println("Bluthooth: "+comp.isBluetoothEnabled());
		System.out.println("Graphics: "+comp.isGraphicsCardEnabled());
	}

}

package second.facade;

public class Facade {
	private Cpu cpu;
	private Mainboard mainboard;
	private Ram ram;
	
	public String getComputer() {
		String computer;
		
		cpu = new Cpu();
		mainboard = new Mainboard();
		ram = new Ram();
		computer = cpu.getType()+" + "+ram.getType()+" + "+mainboard.getType();
		return computer;
	}
}

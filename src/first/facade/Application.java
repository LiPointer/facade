package first.facade;

public class Application {

	private static Cpu cpu;
	private static Mainboard mainboard;
	private static Ram ram;
	
	private static String getComputer() {
		String computer;
		
		cpu = new Cpu();
		mainboard = new Mainboard();
		ram = new Ram();
		computer = cpu.getType()+" + "+ram.getType()+" + "+mainboard.getType();
		return computer;
	}
	
	public static void main(String[] args) {
		System.out.println(getComputer());
		System.out.println("组装成了一台电脑 ");
	}

}

package second.facade;

public class Application {

	private static Facade facade;
	
	public static void main(String[] args) {
		facade = new Facade();
		System.out.println(facade.getComputer());
		System.out.println("组装成了一台电脑 ");
	}

}

package it.beije.malang;

public class InitializationOrder {
	private String name = "Torchie";
	{ System.out.println(name); }
	private static int COUNT = 0;
	static { System.out.println("static : " + COUNT); }
	{ COUNT++; System.out.println(COUNT); }
	public InitializationOrder() {
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		//new InitializationOrder();
		System.out.println("read to construct");
	}
}

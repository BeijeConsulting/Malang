package it.beije.malang.natura;

public class Umano implements Onnivoro {
	static final int foglie=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Umano u = new Umano();
u.Mangiacarneerba();

	}

	@Override
	public void mangiaCarne() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mangiaErba() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Mangiacarneerba() {
		System.out.println("mangio sia carne che erba");
		
	}

}

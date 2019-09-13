package it.beije.malang;

public class ProvaPersona3 {
String name;
public ProvaPersona3(){}

public String setName(String nome){
	name=nome;
	return nome;
}
public void getName() {
	System.out.println(name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProvaPersona3 uomo= new ProvaPersona3();
		uomo.setName(args[0]);
		uomo.getName();
	}

}

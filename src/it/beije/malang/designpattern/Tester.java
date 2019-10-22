package it.beije.malang.designpattern;

import it.beije.malang.designpattern.factory.Oca;
import it.beije.malang.designpattern.factory.OcaFactory;

public class Tester {

	public static void main(String[] args) {
		
		Oca oca = OcaFactory.getOca("Vittorio", "Luoni");
		
		System.out.println(oca);
		
		
	
	}

}

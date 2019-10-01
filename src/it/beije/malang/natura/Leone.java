package it.beije.malang.natura;

public class Leone extends Carnivori {
	
		//metodi
		public void respirare() {
			 System.out.println("il leone respira con i polmoni");
		 }
	
		 public void mangiare() {
			 System.out.println("il leone è un carnivoro");
		 }
	
		 public void tipoAttacco() {
			 System.out.println("leone sferra zampata");
		 }
		 
//		 public void setEta(int eta) {
//			 super.setEta(eta);			 
//		 }
		 
		 		 
		 public static void main(String[] args) {
			 
			 Leone leone = new Leone();
			 leone.setEta(3);
			 leone.setlunghCanini("10 cm");
			 
			 System.out.println(leone.getEta());
			 System.out.println("la lnghezza dei canini di un leone è: " + leone.getLunghCanini());
			 
			 leone.respirare();
			 leone.mangiare();
			 leone.tipoAttacco();
			 
		 
		 }

		
		

	
}




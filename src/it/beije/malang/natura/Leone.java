package it.beije.malang.natura;

public class Leone extends Mammiferi {
static double annoleone;
	
	public void mangiare() {
		System.out.println("I leoni mangiano con i denti");
	}
	
	public void respirare() {
		System.out.println("il leone respira con i polmoni");
	}

	public static void main(String[] args) {
			
		Leone l= new Leone();
		//annoleone=l.getEta();
		System.out.println(l.getEta());
		
	}
	
	
//	@Override
//	public void setEta() {
//		// TODO Auto-generated method stub
//		
//	}
	
	
	
//	public int anni() {
//		
//		annoleone=getEta();
//		
//		return annoleone;
//		}
	
//	
//public Leone() {
//	//super.getEta();
//	
//}
	

}

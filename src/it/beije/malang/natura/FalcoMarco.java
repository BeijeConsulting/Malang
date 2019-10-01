package it.beije.malang.natura;

public class FalcoMarco extends VolatiliMarco {
	
	public void setEta(int eta) {
		super.setEta(eta);
	}
	
	public void riproduzione() {
		System.out.println("covano le uova in un nido durante l'incubazione");
	}
	public void movimento() {
		System.out.println("tramite le ossa cave e un movimento sussultorio delle ali volano");
	}
	public void respirazione() {
		System.out.println("tramite narici sul becco respirano in maniera classica,con polmoni");
	}
	
	public static void main(String... args) {
		
		FalcoMarco falco = new FalcoMarco();
		falco.setEta(10);
		falco.riproduzione();
		falco.movimento();
		falco.respirazione();
	}

}

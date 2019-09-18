package it.beije.malang;

public class MorraCinese {

	public void giocata(String str1,String str2) {
		//sasso forbice carta
		
		if(str1 != "sasso" & str1 != "forbice" & str1 != "carta" |str2 != "sasso" & str2 != "forbice" & str2 != "carta") {
			System.out.println("avete sbagliato la giocata");
		}
		else {
			if(str1 == str2) {
				System.out.println("pari");
				}
			else if(str1 == "sasso" && str2 == "forbice") {
				System.out.println("vince il giocatore 1");
			}
			else if(str1 == "forbice" && str2 == "sasso") {
				System.out.println("vince il giocatore 2");
			}
			else if(str1 == "forbice" && str2 == "carta") {
				System.out.println("vince il giocatore 1");
			}
			else if(str1 == "carta" && str2 == "forbice") {
				System.out.println("vince il giocatore 2");
			}
			else if(str1 == "sasso" && str2 == "carta") {
				System.out.println("vince il giocatore 2");
			}
			else if(str1 == "carta" && str2 == "sasso") {
				System.out.println("vince il giocatore 1");
			}
		}
	}
	public static void main(String[] args) {
		MorraCinese sassoCartaForbice = new MorraCinese();
		sassoCartaForbice.giocata("sasso","forbice");
	}
}

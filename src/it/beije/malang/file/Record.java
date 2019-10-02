package it.beije.malang.file;

public class Record {
	public String nome;
	public String cognome;
	StringBuilder indirizzo = new StringBuilder();

public void addEmail(String email) {
	indirizzo.append(email).append("|");
}

public String allMail() {
	return indirizzo.toString();
}
}
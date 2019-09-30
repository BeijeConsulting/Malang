package it.beije.malang;

import java.util.Random;

public class Contatto implements Comparable<Contatto>{
	
	private int id;
	private String cognome;
	private String nome;
	private String telefono;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		
	}
	
	public String getCognomeNome() {
		return cognome + " " + nome;
	}
	
	
	
	public Contatto(String cognome, String nome, String telefono, String email) {
		super();
		this.cognome = cognome;
		this.nome = nome;
		this.telefono = telefono;
		this.email = email;
	}
	
	public Contatto() {
		super();
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(cognome).append(';');
		builder.append(nome).append(';');
//		builder.append(getCognomeNome()).append(';');
		builder.append(email).append(';');
		builder.append(telefono).append(';');
		builder.append(randomString(10));
		return builder.toString();
	}
	
	@Override
    public int compareTo(Contatto contatto) {
		String cognome=contatto.getCognome();
		
		return this.cognome.compareTo(cognome);
	}
	
	public static String randomString(int length){
		Random rand = new Random();
		StringBuffer tempStr = new StringBuffer();
		tempStr.append("");
		for (int i = 0; i < length; i++) {
		int c = rand.nextInt(122 - 48) + 48;
		if((c >= 58 && c <= 64) || (c >= 91 && c <= 96)){
		i--;
		continue;
		}
		tempStr.append((char)c);

		}
		return tempStr.toString();
		}
	
//	public static void main(String[] args) {
//		System.out.println(randomString(10));
//	}
	
}

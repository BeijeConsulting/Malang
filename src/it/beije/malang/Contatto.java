package it.beije.malang;

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
	
	public Contatto(String[] arr) {
		this.nome=arr[0];
		this.cognome=arr[1];
		this.telefono=arr[2];
		this.email=arr[3];
	}
	
	public Contatto(Contatto contatto)
	{
		this.cognome=contatto.getCognome();
		this.nome=contatto.getNome();
		this.telefono=contatto.getTelefono();
		this.email=contatto.getEmail();
	}
	
	public Contatto() {
		// TODO Auto-generated constructor stub
	}
	public String getCognomeNome() {
		return this.cognome+" "+this.nome;
	}
	
	public String makeEmail() {
		return nome+"@"+cognome+".it";
	}
	
	@Override
    public int compareTo(Contatto contatto) {
		String cognome=contatto.getCognome();
		
		return this.cognome.compareTo(cognome);
	}
	
	public String toString(int esId){
		StringBuilder builder = new StringBuilder();
		switch(esId) {
			case 3:
			case 1:
				builder.append(cognome).append(';');
				builder.append(nome).append(';');
				builder.append(getCognomeNome()).append(';');
				builder.append(email).append(';');
				builder.append(telefono);
				break;
			case 2:
				builder.append(cognome).append(';');
				builder.append(nome).append(';');
				builder.append(telefono).append(';');
				builder.append(makeEmail());
			case 4:
				builder.append(cognome).append(';');
				builder.append(nome).append(';');
				builder.append(getCognomeNome()).append(';');
				builder.append(email).append(';');
				builder.append(telefono);
		}
		return builder.toString();
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("cognome : ").append(cognome).append('\n');
		builder.append("nome : ").append(nome).append('\n');
		builder.append("telefono : ").append(telefono).append('\n');
		builder.append("email : ").append(email).append('\n');
		return builder.toString();
	}
}

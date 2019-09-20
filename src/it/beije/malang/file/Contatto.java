package it.beije.malang.file;

public class Contatto {
		
					private String nome;
					private String cognome;
					private String numero;
					private String indirizzo;
					private String cognomeNome;
					
					public void setCognomeNome(String nome, String cognome) {
						cognomeNome = this.cognome + " " + this.nome;
					}
					
					public void setCognomeNome() {
						cognomeNome = this.cognome + " " + this.nome;
					}
					public String getCognomeNome() {
						return cognomeNome;
					}
					public String getNome() {
						return nome;
					}
					public void setNome(String nome) {
						this.nome = nome;
					}
					public String getCognome() {
						return cognome;
					}
					public void setCognome(String cognome) {
						this.cognome = cognome;
					}
					public String getNumero() {
						return numero;
					}
					public void setNumero(String numero) {
						this.numero = numero;
					}
					public String getIndirizzo() {
						return indirizzo;
					}
					public void setIndirizzo(String indirizzo) {
						this.indirizzo = indirizzo;
					}
					public void setIndirizzo(String nome,String cognome) {
						this.indirizzo = this.nome+"@"+this.cognome+".IT";
					}
					
					@Override
					public String toString() {
						StringBuilder builder = new StringBuilder();
						builder.append("cognome : ").append(cognome).append('\n');
						builder.append("nome : ").append(nome).append('\n');
						builder.append("CognomeNome : ").append(cognomeNome).append('\n');
						builder.append("telefono : ").append(numero).append('\n');
						builder.append("email : ").append(indirizzo).append('\n');
						return builder.toString();
					}

}

package it.beije.malang.database.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "utenti")
public class Utente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "cognome")
	private String cognome;
	
	@Column(name = "nome")
	private String nome;

	@Column(name = "email")
	private String email;
	
	@OneToMany
	@JoinColumn(name = "id_utente")
	private List<Indirizzo> indirizzi;
	
	public Utente() {
		
	}
	
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
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Indirizzo> getIndirizzi() {
		return indirizzi;
	}
	public void setIndirizzi(List<Indirizzo> indirizzi) {
		this.indirizzi = indirizzi;
	}
	
}


// create table utenti (
//		id integer not null auto_increment,
//	    cognome varchar(255),
//	    email varchar(255),
//	    nome varchar(255),
//	    primary key (id)
//	)

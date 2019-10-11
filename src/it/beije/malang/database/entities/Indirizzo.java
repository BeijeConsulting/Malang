package it.beije.malang.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "indirizzi")
public class Indirizzo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "id_utente")
	private int idUtente;
	
	@Column(name = "provincia", columnDefinition = "char")
	private String provincia;
	
	@Column(name = "citta")
	private String citta;
	
	@Column(name = "cap", columnDefinition = "char")
	private String cap;

	@Column(name = "indirizzo")
	private String indirizzo;
	
	@Column(name = "telefono")
	private String telefono;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdUtente() {
		return idUtente;
	}
	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}
	
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}


// create table indirizzi (
//		id integer not null auto_increment,
//        id_utente integer not null,
//	    citta varchar(100),
//	    provincia char(2),
//	    cap char(5),
//        indirizzo varchar(255),
//        telefono varchar(15) null,
//	    primary key (id),
//        foreign key (id_utente) references utenti(id)
//	)


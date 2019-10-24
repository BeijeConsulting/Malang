package it.beije.pool;

import java.time.LocalDateTime;

public class MyConnection {
	
	private int id;
	private String conn;
	private boolean available;
	private LocalDateTime timestamp;
	
	MyConnection(int id) {
		this.id = id;
		this.conn = "sono la connessione num " + id;
		this.available = false;
		this.timestamp = LocalDateTime.now();
	}
	
	public int getId() {
		return id;
	}
	
	public String getConn() {
		return conn;
	}
	public void setConn(String conn) {
		this.conn = conn;
	}
	
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
	public void close() {
		System.out.println("sono la connessione " + this.id + " e vengo liberata ora...");
		this.available = true;
		this.timestamp = null;
	}
}

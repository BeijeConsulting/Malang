package it.beije.malang.database;

import java.util.ArrayList;

public class NumberList {
	private String phone;
	private ArrayList<String> emails=new ArrayList<>();
	private String name;
	private String surname;
	
	public NumberList(String phone) {
		this.phone=phone;
	}
	
	public NumberList(String arr[]) {
		this(arr[2],arr[0],arr[1],arr[3]);
	}
	
	public NumberList(String phone, String name, String surname, String email) {
		this.phone=phone;
		setName(name);
		setSurname(surname);
		addEmail(email);
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	public void setName(String name) {
		if (!name.equals(""))
			this.name=name;
	}
	
	public void setSurname(String surname) {
		if (!surname.equals(""))
			this.surname=surname;
	}
	
	public void addEmail(String email) {
		emails.add(email);
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getEmails() {
		StringBuilder builder=new StringBuilder();
		builder.append("\"");
		for (String str: emails) {
			builder.append(str).append(",");
		}
		builder.delete(builder.length()-1, builder.length());
		builder.append("\"");
		return builder.toString();
	}
	
	public String toString() {
		StringBuilder builder=new StringBuilder();
		builder.append("\"").append(phone).append("\";");
		builder.append(getEmails()).append(";\"");
		builder.append(surname).append("\";\"");
		builder.append(name).append("\"");
		return builder.toString();
	}
}

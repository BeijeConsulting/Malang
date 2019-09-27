package it.beije.malang.database;

public class Contact {

	private int id;
    private String surname;
    private String name;
    private String phone;
    private String email;

    public Contact(String surname, String name, String phone, String email) {
        this.surname = surname;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Contact(String surname, String name, String phone){
        this(surname, name, phone, "");
    }

    public Contact(String surname, String name){
        this(surname, name, "", "");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    
    public int getId() {
    	return id;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append("ID :\t \t").append(id).append("\n")
        	.append("Name :\t \t").append(name).append("\n")
        	.append("Surname :\t \t").append(surname).append("\n")
        	.append("Phone :\t \t").append(phone).append("\n")
        	.append("Email :\t \t").append(email).append("\n");
        
        return builder.toString();
    }
}
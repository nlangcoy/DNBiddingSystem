package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User extends Person{
	@Id
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="Email")
	private String email;
	
	public User(String fName, String mName, String lName, String username, String password, String email){
		super(fName,mName,lName);
		this.username=username;
		this.password=password;
		this.email=email;
	}
	
	public User(Person p, String username, String password, String email){
		super(p.getfName(),p.getmName(),p.getlName());
		this.username=username;
		this.password=password;
		this.email=email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString(){
		return super.toString()+ "\nUsername: "+username+"\nPassword: "+password;
	}
	
	public static void main(String[] args){
		System.out.println(new User("Nim","Lapuz","Langcoy","nlangcoy","banana123","nimllangcoy@hotmail.com"));
		
	}
}

package model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
	@Column(name="FirstName")
	private String fName;
	private String mName;
	private String lName;
	
	public Person(String fName,String mName, String lName){
		this.fName=fName;
		this.mName=mName;
		this.lName=lName;
		
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public String toString(){
		return fName+" "+mName+" "+lName;
		
	}
}

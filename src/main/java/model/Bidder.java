package model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;

public class Bidder extends User implements Serializable{
	private ArrayList<BidItems> biddingsWon;
	private ArrayList<BidItems> currentbiddings;
	
	public Bidder(String fName,String mName, String lName,String username, String password, String email){
		super(fName,mName,lName,username,password,email);
	}
	
	public Bidder(User u){
		super(u.getfName(),u.getmName(),u.getlName(),u.getUsername(),u.getPassword(),u.getEmail());
	}

	public ArrayList<BidItems> getBiddingsWon() {
		return biddingsWon;
	}

	public void setBiddingsWon(ArrayList<BidItems> biddingsWon) {
		this.biddingsWon = biddingsWon;
	}

	public ArrayList<BidItems> getCurrentbiddings() {
		return currentbiddings;
	}

	public void setCurrentbiddings(ArrayList<BidItems> currentbiddings) {
		this.currentbiddings = currentbiddings;
	}
}

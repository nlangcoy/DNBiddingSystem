package model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="BidItem")
public class BidItems {
	@Id @GeneratedValue
	@Column(name="ID")
	private int itemID;
	@Column(name="StartPrice")
	private double startingPrice;
	@Column(name="HighestBid")
	private double currentPrice;
	@Column(name="DateAdded")
	private Calendar dateAdded;
	@Column(name="HighestBidder")
	private Bidder highestBidder;
	/*
	 * 0 for active
	 * 1 for expired
	 * */
	@Column(name="Status")
	private int status;
	@Column(name="BidDurationHours")
	private int bidDuration;
	
	
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public double getStartingPrice() {
		return startingPrice;
	}
	public void setStartingPrice(double startingPrice) {
		this.startingPrice = startingPrice;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public Calendar getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Calendar dateAdded) {
		this.dateAdded = dateAdded;
	}
	public Bidder getHighestBidder() {
		return highestBidder;
	}
	public void setHighestBidder(Bidder highestBidder) {
		this.highestBidder = highestBidder;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getBidDuration() {
		return bidDuration;
	}
	public void setBidDuration(int bidDuration) {
		this.bidDuration = bidDuration;
	}
	
	
}

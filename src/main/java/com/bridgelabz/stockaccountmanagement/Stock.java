package com.bridgelabz.stockaccountmanagement;

public class Stock {
	public String stockNames;
	public int numberOfShare; 
	public int sharePrice;

	public String getStockNames() {
		return stockNames;
	}

	public void setStockNames(String stockNames) {
		this.stockNames = stockNames;
	}

	public int getNumberOfShare() {
		return numberOfShare;
	}

	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	/**
	 * @param stockNames
	 * @param numberOfShare
	 * @param sharePrice
	 */
	public Stock(String stockNames, int numberOfShare, int sharePrice) {
		super();
		this.stockNames = stockNames;
		this.numberOfShare = numberOfShare;
		this.sharePrice = sharePrice;
	}

	public Stock(String filename, Object n, int sharePrice2) {
		// TODO Auto-generated constructor stub
	}

	public Object readLine() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

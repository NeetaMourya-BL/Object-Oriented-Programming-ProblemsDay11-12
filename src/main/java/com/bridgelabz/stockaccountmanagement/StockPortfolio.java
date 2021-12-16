package com.bridgelabz.stockaccountmanagement;
import java.util.Scanner;
public class StockPortfolio {
	public static final int iNVENTORY_SIZE = 3;
	private static Stock [] stocks;
	public StockPortfolio() {
	stocks = new Stock [iNVENTORY_SIZE];
	}
	// method declaration
	public static void calculateEachStockPrice() {
		for( int i = 0; i < iNVENTORY_SIZE; i++ )
		{
			double priceOfShare;
	        Scanner scanner = new Scanner(System.in);
		    System.out.println ("Stock's name:");
		    String stockNames = scanner.next();

		    System.out.println ("Stock's price:");
		    int numberOfShare = scanner.nextInt();
		    
		    System.out.println ("Numbers of shares: ");
		    int sharePrice= scanner.nextInt();
		    
		    stocks[i] = new Stock(stockNames,numberOfShare, sharePrice);
		    priceOfShare =numberOfShare * sharePrice;
			System.out.println("Stock report:");
		    System.out.println("Price of " +stockNames + " is:"+priceOfShare);
		    
		}
}
	public static void main (String [] args){
		StockPortfolio stockPortfolio=new StockPortfolio();
		stockPortfolio.calculateEachStockPrice();
}
}
package pullupmethod;

import java.util.Date;

public class RegularCustomer extends Customer {
	
	/*
	 * 1. 在父類別宣告chargeFor的抽象函式
	 * 2. 將createBill函式反白，refactor
	 * 
	 */
	private double charge;
	
	private void createBill(Date date){
		double chargAmount = chargeFor(lastBillDate, date);
		addBill(date, charge);
	}
	
	protected double chargeFor(Date start, Date end){
		double daterange = start.getTime() - end.getTime() * 50;
		return daterange;
	}
	
}

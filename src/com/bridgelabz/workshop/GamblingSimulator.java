package com.bridgelabz.workshop;

public class GamblingSimulator {
	public static final int EVERYDAYSTAKE=100;                  //uc1
	public static final int BETPERGAME=1;
	
	int everyDayStake=EVERYDAYSTAKE;
	int totalAmount=0;
	
	public void stakeStatus() 
	{                                                        //uc2
		int status=(int)(Math.random()*100);
		if(status<=50)
		{
			System.out.println("Win");
			everyDayStake++;
		}
			
		else
		{
			System.out.println("Loose");
			everyDayStake--;
		}
			
	}
	public void gamblingDays()                                 //uc4
	{
		int days=20;
		for(int index=1;index<=days;index++)
		{
			everyDayStake=100;
			lossProfit();
		}
		System.out.println("total amount: "+ totalAmount);
		
		
	}
	public void lossProfit() {                                  //uc3
		while(!(everyDayStake<=50 || everyDayStake>=150)){
			stakeStatus();
		}
		totalAmount+=everyDayStake;
		System.out.println("Gambling player has resigned for the day");
		System.out.println("stake balance:"+ everyDayStake);
	}

	public static void main(String[] args) {
		System.out.println("***Welcome to the Gambling Simulator***");
		GamblingSimulator object=new GamblingSimulator();
		object.gamblingDays();
		
 
	}

}

package com.bridgelabz.workshop;

public class GamblingSimulator {
	public static final int EVERYDAYSTAKE=100;                  //uc1
	public static final int BETPERGAME=1;
	
	int everyDayStake=EVERYDAYSTAKE;
	int totalAmount=0;
	int flag=0;
	
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
		int days=30;                     
		int averageStakeForMonth=3000;
		flag++;
		for(int index=1;index<=days;index++)                        //uc5
		{
			everyDayStake=100;
			lossProfit();
		}
		System.out.println("Total stake at the end of "+days+" days "+ totalAmount);
		System.out.println("Profit stake for month "+flag+" is "+(totalAmount-averageStakeForMonth));
		if(totalAmount> averageStakeForMonth)
		{                                                            //uc7
			if(flag<2)
			{
				gamblingDays();
			}
		}
		else
		{
			System.out.println("Loss Stake for month: "+ (averageStakeForMonth-totalAmount));
			System.out.println("********PLAYER STOPS GAMBLING********");
		}
		
		
	}
	public void lossProfit() 
	{                                                          //uc3
		while(!(everyDayStake<=50 || everyDayStake>=150))
		{
			stakeStatus();
			System.out.println("Gambling player has resigned for the day");
			System.out.println("stake balance:"+ (everyDayStake));
			if(everyDayStake>=150) 
			{
				System.out.println("****LUCKY DAYY*****WON MAXIMUM OF $150****");       //uc6
			}
			if(everyDayStake<=50) 
			{
				System.out.println("****UNLUCKY DAYY*****LOST MAXIMUM OF $150****");
			}
		}
		totalAmount+=everyDayStake;
		
	}

	public static void main(String[] args) {
		System.out.println("***Welcome to the Gambling Simulator***");
		GamblingSimulator object=new GamblingSimulator();
		object.gamblingDays();
		
 
	}

}

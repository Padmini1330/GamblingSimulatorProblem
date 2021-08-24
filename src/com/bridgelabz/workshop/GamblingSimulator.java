package com.bridgelabz.workshop;

public class GamblingSimulator {
	public static int EVERYDAYSTAKE=100;
	public static int BETPERGAME=1;
	
	public void stakeStatus() {
		int status=(int)(Math.random()*100);
		if(status<=50)
		{
			System.out.println("Win");
			EVERYDAYSTAKE++;
		}
			
		else
		{
			System.out.println("Loose");
			EVERYDAYSTAKE--;
		}
			
	}
	public void lossProfit() {
		while(!(EVERYDAYSTAKE<=50 || EVERYDAYSTAKE>=150)){
			stakeStatus();
		}
		System.out.println("Gambling player has resigned for the day");
		System.out.println("stake balance:"+ EVERYDAYSTAKE);
	}

	public static void main(String[] args) {
		System.out.println("***Welcome to the Gambling Simulator***");
		GamblingSimulator object=new GamblingSimulator();
		object.lossProfit();
 
	}

}

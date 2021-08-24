package com.bridgelabz.workshop;

public class GamblingSimulator {
	public static final int EVERYDAYSTAKE=100;
	public static final int BETPERGAME=1;
	public void uc1() {
		
	}
	public void uc2() {
		int status=(int)(Math.random()*100);
		if(status<=50)
			System.out.println("Win");
		else
			System.out.println("Loose");
	}

	public static void main(String[] args) {
		System.out.println("***Welcome to the Gambling Simulator***");
		GamblingSimulator object=new GamblingSimulator();
		object.uc1();
		object.uc2();
 
	}

}

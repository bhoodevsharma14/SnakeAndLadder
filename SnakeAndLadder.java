package com.snakeandladder;

public class SnakeAndLadder {
	public static final int NO_MOVE=0,LADDER=1,SNAKE=2;
	public static int player1Position=0,rollCounter=0,player2Position=0;

	public static int chance=1;
	public static void main(String[] args)
	{
		System.out.println("Welcome to Snake And Ladder Simulator");
		
		
		while(player1Position<100 && player2Position<100)
		{
			if (chance==1)
			{
				player1Position=rollDice(player1Position);
				chance=2;
				continue;
			}
			else
			{
				player2Position=rollDice(player2Position);
				chance=1;
				continue;
			}
		}
		
		if(player1Position==100)
			System.out.println("Dice Rolled for : " +rollCounter+" times and Player 1 is the Winner");
		if(player2Position==100)
			System.out.println("Dice Rolled for : " +rollCounter+" times and Player 2 is the Winner");
		

	}
	
	public static int rollDice(int playerPosition)
	{
		boolean condition=true;
		while(playerPosition<100 && condition)
		{
			int dice= (int) Math.floor(Math.random()*10)%6 +1;
			
			int move= (int) Math.floor(Math.random()*10)%3;
			
			rollCounter++;

			switch (move)
			{
				case LADDER: 
							playerPosition+=dice;
							if(playerPosition>100)
								{
									playerPosition-=dice;
									condition=false;
								}
								
							break;
				case SNAKE:
							playerPosition-=dice;
							condition=false;
							break;		
				default:
						condition=false;
			}
			
			if (playerPosition<0)
				playerPosition=0;
			
		}
			
		System.out.println("Dice Rolled for : " +rollCounter+" Player "+chance+" Position is : "+playerPosition);
		return playerPosition;
		
		
	}
}

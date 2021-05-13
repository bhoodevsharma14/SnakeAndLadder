package com.snakeandladder;

public class SnakeAndLadder {
	public static final int NO_MOVE=0,LADDER=1,SNAKE=2;

	public static void main(String[] args)
	{
		System.out.println("Welcome to Snake And Ladder Simulator");
		
		int player1Position=0;
		
		while(player1Position<100)
		{
			
			int dice= (int) Math.floor(Math.random()*10)%6 +1;
			
			int move= (int) Math.floor(Math.random()*10)%3;
			
			switch (move)
			{
				case LADDER: 
							player1Position+=dice;
							break;
				case SNAKE:
							player1Position-=dice;
							break;		
			}
//			System.out.println(" dice "+dice+" ,move "+move+" position: "+player1Position);
			if (player1Position<0)
				player1Position=0;
			System.out.println(" dice "+dice+" ,move "+move+" position: "+player1Position);
		}
	}
}

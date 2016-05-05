package com.mcnz.lab6;

import java.util.ArrayList;
import java.util.Scanner;

import com.mcnz.rps.GameSummary;

public class TestArrayList
{
	public static void main(String[] args)
	{
		try
		{
			ArrayList<GameSummary> gameHistory = new ArrayList<GameSummary>();
			Scanner scanner = new Scanner(System.in);
			
			for(int i = 0; i < 3; i++)
			{
				System.out.println("\n***** Game " + i + "*****");
				
				System.out.println("What did the client choose? >>");
				String client = scanner.nextLine();
				
				System.out.println("What did the server choose? >>");
				String server = scanner.nextLine();
				
				System.out.println("What was the result? >>");
				String result = scanner.nextLine();
				
				GameSummary gameSummary = new GameSummary(client, server, result);
				
				gameHistory.add(gameSummary);						
			}	 
			
			for (GameSummary summary : gameHistory) {
				System.out.println(summary.toString());
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}	
	}
}

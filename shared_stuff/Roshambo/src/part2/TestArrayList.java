package part2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import pool.Game;


public class TestArrayList
{
	public static void main(String[] args)
	{
		try
		{
			ArrayList<Game> games = new ArrayList<Game>();
			
			Scanner scanner = new Scanner(new FileReader("games.txt"));
			
			for(int i = 0; i < 4; i++)
			{
				String date = scanner.nextLine();
				String team1Name = scanner.nextLine();
				String team2name = scanner.nextLine();
				
				games.add(new Game (date, team1Name, team2name));						
			}	 
			
			for (Game g : games)
				System.out.println(g);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}	
	}
}

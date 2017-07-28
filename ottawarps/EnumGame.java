package com.mcnz.rps;

import javax.swing.JOptionPane;

public class EnumGame {
	public enum Gesture {rock,paper,scissors,error};
	
	public static Gesture figureOutGesture(String input) {
		if (input.equalsIgnoreCase("rock")){
			return Gesture.rock;
		}
		if (input.equalsIgnoreCase("paper")){
			return Gesture.paper;
		}
		if (input.equalsIgnoreCase("scissors")){
			return Gesture.scissors;
		}
		return Gesture.error;
	}
	
	public static String evaluateGameResult(Gesture clientGesture, Score score){
		String result = "error";
		if (clientGesture == Gesture.scissors) {
			score.increaseLosses();
			result = "lose";
		}
		if (clientGesture == Gesture.paper) {
			score.increaseWins();
			result = "win";
		}
		if (clientGesture == Gesture.rock) {
			score.increaseTies();
			result = "tie";
		}
		if (clientGesture == Gesture.error) {
			score.increaseLosses();
			result = "error";
		}
		return result;
	}

	public static void main(String[] args) {

		String prompt = "Will it be rock, paper or scissors?";
		Score score = new Score();
		while (true) {
			
			String input = JOptionPane.showInputDialog(prompt);
			//Input validation
			Gesture clientGesture = figureOutGesture(input);
			//Model processing
			String result = evaluateGameResult(clientGesture, score);
			JOptionPane.showMessageDialog(null, result);
			System.out.println(score.toString());
		}
	}
}

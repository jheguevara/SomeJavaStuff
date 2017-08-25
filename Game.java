
import javax.swing.*;

public class Game {
	
	public static void main(String args[]){
		
		String prompt = "Will it be rock, paper or scissors?";
		String input = JOptionPane.showInputDialog(prompt);
		String result = "error";
		
		if (input.equalsIgnoreCase("scissors")){
			result = "lose";
		}
			
		if (input.equalsIgnoreCase("paper")){
			
			result = "win";
		}
				
		if (input.equalsIgnoreCase("rock")){
			result = "tie";	
		}
		
		JOptionPane.showMessageDialog(null, result, "Abc", 1);
		
	}

}

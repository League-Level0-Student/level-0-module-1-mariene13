package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
            int score= 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
          String answer= JOptionPane.showInputDialog(null, "There was a plane crash in which every single person was killed. Yet there were 12 survivors. How?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
             if(answer.equals("Those 12 people were in a relationship")){
             JOptionPane.showMessageDialog(null, "correct!!"); 
             score++;
             }
             else { JOptionPane.showMessageDialog(null, "wrong");
             
             }
		// 5. Otherwise, say "wrong" and tell them the answer
              
		// 6. Add some more riddles
           String solution = JOptionPane.showInputDialog("2+2");
           if(solution.equals("4")) {
        	   JOptionPane.showMessageDialog(null, "correct!!"); 
               score++;
           }
               else { JOptionPane.showMessageDialog(null, "wrong");
           }
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,"your score"+score);
	}
}
	
		
		


	
		
	



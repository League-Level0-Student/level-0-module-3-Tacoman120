
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot Rob = new Robot("mini");
	    //2. Make the robot draw a shape (this will take more than one line of code)
		int beans = 50;
		Rob.penDown();
		Rob.setPenWidth(10);
		Rob.setSpeed(100);
		for(int j = 5; j > 1; j++) {
			beans = beans*2;
		String question = JOptionPane.showInputDialog(null, "what color pen would you like the robot to draw with");
		if(question.equals("orange")) { 
			Rob.setPenColor(255, 165, 0);
		}else if(question.equals("red")) { 
			Rob.setPenColor(300, 0, 0);
		}else if(question.equals("yellow")) { 
			Rob.setPenColor(300, 300, 0);
		}else if(question.equals("green")) { 
			Rob.setPenColor(0, 300, 0);
		}else if(question.equals("blue")) { 
			Rob.setPenColor(0, 0, 300);
		}else if(question.equals("purple")) { 
			Rob.setPenColor(106, 13, 173);
		}
		for(int I = 0; I < 4;I++) {
		Rob.move(beans);
		Rob.turn(90);
		}
		
		}
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}

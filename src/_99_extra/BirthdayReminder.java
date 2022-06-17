
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 27th";
		String dadsBirthday = "January 25th";
		String myBirthday = "December 30th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String bday = JOptionPane.showInputDialog(null, "Who's birthday do you want from my family?" );
	if(bday.equals("mom")) {
		JOptionPane.showMessageDialog(null, momsBirthday);
	}else if (bday.equals("dad")) {
		JOptionPane.showMessageDialog(null, dadsBirthday);
	}else if (bday.equals("dad")) {
		JOptionPane.showMessageDialog(null, myBirthday);
	}else {
		JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
	}
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}

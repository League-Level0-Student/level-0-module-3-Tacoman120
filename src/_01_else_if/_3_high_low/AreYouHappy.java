package _01_else_if._3_high_low;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String begin = JOptionPane.showInputDialog(null, "are you happy?");
	if(begin.equals("yes")) {
		JOptionPane.showMessageDialog(null, "keep doing what ever you are doing");
	}else if(begin.equals("no")) {
		String second = JOptionPane.showInputDialog(null, "do you want to be happy?");
		if(second.equals("yes")) {
			JOptionPane.showMessageDialog(null, "change some thing");
		}else if(second.equals("no")) {
			JOptionPane.showMessageDialog(null, "keep doing what ever you are doing");
		}
	}
}
}

package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		
		case "Sunday":
			JOptionPane.showMessageDialog(null, "Aren't you suppost to be in church?");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "Need some coffee?");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "Literally nothing happens on Tuesdays...");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "I can't spell wenesday right!!!!");
			break;
		case "Thursday":
			JOptionPane.showMessageDialog(null, "Friday Eve!!!");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "Friday night lights!");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "Lazy Saturdazzzz");
			break;
			default:
				JOptionPane.showMessageDialog(null, "ERROR");
		}
	}
}

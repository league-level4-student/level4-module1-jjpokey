package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void enumstuff(Zodiac z) {
		switch(z) {
		case AQUARIUS :
			JOptionPane.showMessageDialog(null, "This is Aquarius");
			break;
		case ARIES :
			JOptionPane.showMessageDialog(null, "This is Aries");
			break;
		case CANCER : 
			JOptionPane.showMessageDialog(null, "This is Cancer");
			break;
		case CAPRICORN :
			JOptionPane.showMessageDialog(null, "This is Capicorn");
			break;
		case GEMINI :
			JOptionPane.showMessageDialog(null, "This is Gemini");
			break;
		case LEO :
			JOptionPane.showMessageDialog(null, "This is Leo");
			break;
		case LIBRA :
			JOptionPane.showMessageDialog(null, "This is Libera");
			break;
		case PISCES :
			JOptionPane.showMessageDialog(null, "This is Pisces");
			break;
		case SAGITTARIUS :
			JOptionPane.showMessageDialog(null, "This is Sagittarius");
			break;
		case SCORPIO :
			JOptionPane.showMessageDialog(null, "This is Scorpio");
			break;
		case TAURUS :
			JOptionPane.showMessageDialog(null, "This is Taurus");
			break;
		case VIRGO :
			JOptionPane.showMessageDialog(null, "This is Virgo");
			break;
			default :
				JOptionPane.showMessageDialog(null, "Something Went Wrong! :(");
				break;
			
		}
		
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What is your Zodiac Sign?");
	
		switch(input) {
		case "Aquarius":
			enumstuff(Zodiac.AQUARIUS);
			break;
		case "Aries":
			enumstuff(Zodiac.ARIES);
			break;
		case "Cancer":
			enumstuff(Zodiac.CANCER);
			break;
		case "Capricorn":
			enumstuff(Zodiac.CAPRICORN);
			break;
		case "Gemini":
			enumstuff(Zodiac.GEMINI);
			break;
		case "Leo":
			enumstuff(Zodiac.LEO);
			break;
		case "Libra":
			enumstuff(Zodiac.LIBRA);
			break;
		case "Pisces":
			enumstuff(Zodiac.PISCES);
			break;
		case "Sagittarius":
			enumstuff(Zodiac.SAGITTARIUS);
			break;
		case "Scorpio":
			enumstuff(Zodiac.SCORPIO);
			break;
		case "Taurus":
			enumstuff(Zodiac.TAURUS);
			break;
		case "Virgo":
			enumstuff(Zodiac.VIRGO);
			break;
			default:
				JOptionPane.showMessageDialog(null, "Error, please check spelling! First letter also must be capotolized!");
				break;
		}
	}
}

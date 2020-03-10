package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void enumstuff(Zodiac z) {
		
		
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

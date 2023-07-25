package com.app.switchstatement;

public class SwtchExample4 {

	public static void main(String[] args) {
		char branch = 'C';
		int collegeYear = 4;
		switch (collegeYear) {
		case 1:
			System.out.println("English,Math,Science");
			break;
		case 2:
			switch (branch) {
			case 'C':
				System.out.println("Operating System,java,data Structure");
				break;
			case 'M':
				System.out.println("Micro processor,Logic switchinf theory");
				break;
			case 'E':
				System.out.println("Drawing, Manufacturing machine");
				break;
			}
			break;
		case 3:
			switch (branch) {
			case 'C':
				System.out.println("Computer Organosation,Multimedia");
				break;
			case 'M':
				System.out.println("Fundamental of Logic Design, Microelectronics");
				break;
			case 'E':
				System.out.println("Internal Conbustion Engines,Mechanical Vibration");
				break;
			}
			break;
		case 4:
			switch (branch) {
			case 'C':
				System.out.println("Data Communication and network,Multimedia");
				break;
			case 'M':
				System.out.println("Embedded System,Image Processing");
				break;
			case 'E':
				System.out.println("Production Technology, Thermal Engineering");
				break;
			}
			break;

		default:
			break;
		}
	}
}

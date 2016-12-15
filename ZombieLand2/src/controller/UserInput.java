package controller;

import java.util.Scanner;

public class UserInput {

	//@leila: how does the user has to enter the size of the map?
	final public static int [] askMapSize()
	{
		
		int [] mapSize = new int[2];
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the width of the map: ");
		mapSize[0] = sc.nextInt();
		System.out.print("Please enter the width of the map: ");
		mapSize[1] = sc.nextInt();
		sc.close();
		return mapSize;
	}
	
	 public static String chooseCommand() {
		
		String command;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a command: ");
		command = sc.nextLine();
		sc.close();		
		return command;
	}
	
}

package controller;

import java.util.Scanner;

import model.Installation;
import model.InstallationType;
import view.UI;

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
	
	 public static InstallationType chooseInstallationType(){
		 
		 int installationTypeId;
		 String installationType;
		 
		 Scanner sc = new Scanner(System.in);
		 UI.showInstallationList();
		 System.out.print("Enter installation Id");
		 installationTypeId = sc.nextInt();
		 sc.close();	
		 for (InstallationType e  : InstallationType.values()){
			if(installationTypeId == e.getId()){
			return e;
			}
		 }
		 return null;	//not found
	 }
	 
	 public static int [] chooseCoordinate(){
		 
		 int [] coordinate = new int[2];
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Choose coordinate (x,y)");
		 coordinate[0] = sc.nextInt();
		 coordinate[1] = sc.nextInt();
		 		 
		 sc.close();	
		 return coordinate;
		 
	 }

	public static void createInstallation(String installationType, int[] coordinate) {
		Installation installation1 = new Installation(installationType);
		
	}
}

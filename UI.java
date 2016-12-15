package view;


/*
 * User interface: diplay the user
 */


// @leila: find a way to handle exeptions of user input like char instead of int
// todo:
// 	getRoundNb,  getMaintenanceCost()

import java.util.Scanner;

import model.budget;
import model.Installation;
import model.InstallationType;
import model.MyMap;
import model.Statistic;

public class UI {
	
	int roundNb; 
	
	//@leila: find a way to add the date before every line
	//display the synopsis at the launch of the game
	static public void showSynopsys() {
		StringBuilder s = new StringBuilder();
		s.insert(0, "21/10/2035:");
		s.append(" connection... ");
		s.append("\n...");
		s.append("does anybody's here?");
		s.append("\n");
		s.append("\nWe entrust you to be our leader");
		System.out.println(s);
		return ;
	}
	
	// Diplay the list of commands
	static public void showCommands(){
		StringBuilder s = new StringBuilder();
		s.append(" Commands");
		s.append(" \n*****************");
		s.append(" \nH - show commands");
		s.append(" \nS - show statistics");
		s.append(" \nB - show budget");
		s.append(" \nF - finish round");
		s.append(" \nE - exit the game");
		s.append(" \nSet x, y installation - set up an installation at the coordinate x, y");
		s.append(" \nRemove x, y - remove an installation at the coordinate x, y");
		s.append(" \nInspect - inspect the installation located at the coordinate x, y");
		System.out.println(s);
		return ;	
	}
	
	//Display map
	public static void showMap(MyMap map) {	
		System.out.println();
		for (int i = 0; i < map.getWidth(); i++) {
			for (int j=0; j < map.getHeight(); j++) {
				System.out.print(" | " + map.getGrid()[i][j]);
			}
			System.out.println(" | ");
		}
		System.out.println();
	}
	
	// Diplays statistics
	public void showStatistic(Statistic statistic){
		System.out.println("Population size: " + statistic.getPopulationSize() + " people");
		System.out.println("IFC: " + statistic.getIFC());
		System.out.println("Health score: " +statistic.getHealthScore() );
		System.out.println("Security score: " +statistic.getSecurityScore());
		System.out.println("Scocial score: " +statistic.getSocialScore());
		System.out.println("Accomodation: " +statistic.getAccomodationScore());
		System.out.println("Basic need score: " +statistic.getBasicNeedScore());
	}
	
	// Diplay data relative to budget
	public void showBudgetPannel(Budget budget){
			
		System.out.println("budget: " + budget.getBudget() + " hours");
		System.out.println("Incoming money: " + budget.getIncomingMoney() +"hours");
		System.out.println("Outgoing expense: " + budget.getOutgoingExpense() + "hours");
	}
	
	// Display ending sentence	
	static public void showEnd() {
		   System.out.println("You choosed to abbandon your community and tempt your chance by yourself... Only god can help you now!");
	}
	
	//Inspect an installation
	public void inspectInstallation(Installation installation){
		
			int roundNb = getRounNb();
			
			StringBuilder s = new StringBuilder();
			s.append("This building is an " + installation.getName() + ".");
			s.append("It was build in month " + getRounNb() + ",");
			s.append("is located on grids " + installation.getCoordinate());
			s.append("it costed " + installation.buildingCost + " to build");
			s.append("and now costs " + installation.maintenanceCost + " daily as upkeep.");
					
			System.out.println(s);
			return ;
		}
	
}

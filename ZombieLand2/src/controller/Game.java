package controller;

import model.Budget;
import model.MyMap;
import model.Statistic;
import view.UI;

public class Game {
	public static void main (String[] args)
	{
		// Default value of game
		int basePopulation = 20;
		int baseMoney = 6000;
		int baseIFC = 50;
		//
		MyMap map;
		Budget budget;
		Statistic stat;
		boolean isEnd;
		int roundNb;
		
		UI.showSynopsys();
		int [] mapSize;
		mapSize = UserInput.askMapSize();
		map = new MyMap(mapSize[0], mapSize[1]);
		budget = new Budget(baseMoney);
		stat = new Statistic(basePopulation, baseIFC);
		//UI . showCommands();
		isEnd = false;
		roundNb = 0;
		while (isEnd != true) {
			roundNb = gameLoop(roundNb, map, budget, stat);
			if (roundNb == 0)
			  isEnd = true;
	    }
		UI.showEnd();
	}
		   
	public static int gameLoop(int roundNb, MyMap map, Budget budget, Statistic stat) {
		String command;
		
		UI.showMap(map);
		command = UserInput.chooseCommand();
		
		switch (command) {
			case "H":
				UI.showCommands();
				break;
			case "S":
				UI.showStatistic(stat);
				break;
			case "B":
				break;
			case "F":
				break;			
			case "E":		
				break;
			// End of game
			case "Q":
				return 0;
		}
		//return (roundNb += 1);
		return 0;
	}
}

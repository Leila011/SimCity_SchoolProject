package model;
/**
 * An enum class specifying the type of installation implying an id, a name, a initiallisation cost, number of people 
 * the installation can support, the number of cell an installation occupy
 *
 */
//@ LEILA: starting pop = 20 pers. 10 hour of work a day--> 200 hours/day --> 6000 hours a month
public enum InstallationType {

	//Installation with an effect on a max number of people
	ONEROOMACCOMODATION (1, "One room accomodation", 300, 3, 1, 0),
	FAMILLYHOUSE 		(2, "Familly house",800, 10, 1, 0),
	SHAREDHOUSE 		(3, "Shared house",2200, 30, 2, 0),
	VEGETABLEGARDEN 	(4, "Vegetable garden", 1000, 10, 1, 0),
	VEGETABLEFARM 		(5, "Vegetable farm", 3000, 50, 3, 0),
	CATTLEFARM		 	(6, "Cattle farm", 5000, 100, 3, 0),
	DISPENSARY 			(7, "Dispensary",1500, 20, 1, 0),
	HOSPITAL 			(8, "Hospital", 6000, 200, 2, 0),
	RESEARCHCENTER 		(9, "Research center", 15000, 1000, 3, 0),
	
	//Installation with effect on a number of cells
	WATCHTOWER			(10, "Watchtower",500, 0, 1, 1),
	TRAININGCENTER		(11, "Training center", 5000, 0, 3, 2),
	BARRICADE			(12, "Barricade",100, 0, 1, 1),
	SOCIALINSTALLATION	(13, "Social installation", 1000, 0, 1, 1),
	CINEMA				(14, "Cinema", 3000, 0, 2, 2),
	TOWNEVENT			(15, "Town event center", 5000, 0, 3, 3);
	
	private final int id;
	private final String installationName;
	private int installationCost;
	private int nbPersonEffect = 0;
	private int buildingSpace;
	private int nbCellEffect = 0;
	
	InstallationType(int id, String installationName, int installationCost, int nbPersonEffect, int buildingSpace, int nbCellEffect) {
		this.id = id;
		this.installationName = installationName;
		this.installationCost = installationCost;
		this.nbPersonEffect = nbPersonEffect;
		this.buildingSpace = buildingSpace;
		this.nbCellEffect =  nbCellEffect;
	}
	
	public String getInstallationName() {
		return installationName;
	}

	public int getInstallationCost() {
		return installationCost;
	}

	public int getNbCellEffect() {
		return nbCellEffect;
	}
	
	public int getNbPersonEffect() {
		return nbPersonEffect;
	}
	
	public int getBuildingSpace() {
		return buildingSpace;
	}

	public int getId() {
		return id;
	}
	
	
}
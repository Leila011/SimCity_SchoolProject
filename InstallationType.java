package model;
/**
 * An enum class specifying the type of installation implying a name, a inatllation cost, number of people 
 * the installation can support, the number of cell an installation occupy
 *
 */
//@ LEILA: starting pop = 20 pers. 10 hour of work a day--> 200 hours/day --> 6000 hours a month
public enum InstallationType{
	
	private String installationName = null;
	private int installationCost;
	private int nbPersonEffect = 0;
	private int buildingSpace;
	private int nbCellEffect = 0;
	
	//Installation with an effect on a max number of people
	
	ONEROOMACCOMODATION("One room accomodation", 300, 3, 1, null),
	FAMILLYHOUSE("Familly house",800, 10, 1, null),
	SHAREDHOUSE("Shared house",2200, 30, 2, null),
	VEGETABLEGARDEN("Vegetable garden", 1000, 10, 1, null),
	VEGETABLEFARM("Vegetable farm", 3000, 50, 3, null),
	CATTLEFARM("Cattle farm", 5000, 100, 3, null)
	DISPENSARY("Dispensary",1500, 20, 1, null),
	HOSPITAL("Hospital", 6000, 200, 2, null),
	RESEARCHCENTER("Research center", 15000, 1000, 3, null),
	
	//Installation with effect on a number of cell
	WATCHTOWER("Watchtower",500, null, 1, 1),
	TRAININGCENTER("Training center", 5000, null, 3, 2),
	BARRICADE("Barricade",100, null, 1, 1),
	SOCIALINSTALLATION("Social installation", 1000, null, 1, 1),
	CINEMA("Cinema", 3000, null, 2, 2),
	TOWNEVENT("Town event center", 5000, null, 3, 3);
	
	private InstallationType(String installationName, int installationCost, int nbPersonEffect, int buildingSpace, int nbCellEffect) {
		this.installationName = installationName;
		this.installationCost = installationCost;
		this.nbPersonEffect = nbPersonEffect;
		this.buildingSpace = buildingSpace;
	}
	
	public String getinstallationName() {
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
}
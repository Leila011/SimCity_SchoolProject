package model;

public class Budget {
	
	private int budget;
	private int incomingMoney;
	private int outgoingExpense;
	final static private int TAXESRATE = 1000;
	
	public Budget(int money) {
		this.budget = money;
		this.incomingMoney = 0;
		this.outgoingExpense = 0;
	}

	public void setbudget(){
		budget = budget + incomingMoney - outgoingExpense;
	}
	
	public void setIncomingMoney(int populationSize){
		incomingMoney = populationSize*taxesRate;
	}
	
	public void setOutgoingExpense(){
		// Iterate through the list of cell 
		for (i = 0; i < mapSize; i++){
			outgoingExpense += maintenanceCost;
		}	 
	}

	public int getOutgoingExpense() {
		return outgoingExpense;
	}

	public int getbudget(){
		return budget;
	}
	
	public int getIncomingMoney(){
		return incomingMoney;
	}
	
}

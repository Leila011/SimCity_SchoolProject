package model;

import java.util.ArrayList;
import java.util.List;

/**
 * A class of game statistics. Each object of the class represent the statistic of one round
 *
 *@todo
 * compute score to improve to limit them between two value (use ln or somethng like that)
 * 
 */
public class Statistic {
		
	private int IFC;
	private int healthScore;
	private int securityScore;
	private int socialScore;
	private int accomadationScore;
	private int basicNeedScore;
	private int popSize;
	private int nbLeft;
	private int nbArrival;
	
	//put somewher elese?
	List<Statistic> list = new ArrayList<Statistic>();
	
	public List<Statistic> appendStatisticList(Statistic statistic) {
		return statistic.getList().add(statistic);
		}
	
	// constructor: called at each begining of a new round: each object represent the statistic of one round
	public Statistic(int popSize, int ifc) {
		this.IFC = ifc;
		this.popSize = popSize;
	}

	public void setPopSize() {
		//pop size from round n-1
		this.popSize = popSize + nbArrival - nbLeft;
	}

	public void setIFC() {
		this.IFC = healthScore + securityScore + socialScore + accomadationScore + basicNeedScore ; 
	}

	public void setHealthScore() {
				
		this.healthScore = (totNbPeopleEffect / popSize;
	}
	
	public void setAccomadationScore() {
		this.accomadationScore = totNbPeopleEffect / popSize;
	}

	public void setBasicNeedScore() {
		this.basicNeedScore = totNbPeopleEffect / popSize;
	}
	
	public void setSecurityScore() {
		 
		this.securityScore = totNbCellEffect / Map.getMapSize();
	}

	public void setSocialScore() {		
		this.socialScore = totNbCellEffect / Map.getMapSize();
	}


	public int getPopulationSize() {
		return populationSize;
	}

	public int getIFC() {
		return IFC;
	}

	public int getHealthScore() {
		return healthScore;
	}

	public int getSecurityScore() {
		return securityScore;
	}

	public int getSocialScore() {
		return socialScore;
	}

	public int getAccomodationScore() {
		return accomadationScore;
	}

	public int getBasicNeedScore() {
		return basicNeedScore;
	}
}	
	
	
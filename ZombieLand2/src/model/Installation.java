package model;

/**
 * A class of Installation implying an installation type and a month
 */

public class Installation {
	
		
	private InstallationType installationType;
	private int month;
	
	/**
	 * Initialize this new installation with a given month and a given installation type
	 * @param month
	 * 		  The month of creation of this new installation
	 * @param installation
	 * 		  The installationType of this new installation
	 */
	
	public Installation(InstallationType installationType, int month) {
		this.installationType = installationType;
		this.month = month;
	}

	public InstallationType getInstallationType() {
		return installationType;
	}

	public int getMonth() {
		return month;
	}	
	
	
	
	
}

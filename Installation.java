package model;
/**
 * 
 * todo:
 * 	getRoundNb
 *  getMaintenanceCost()
 *
 */

public class Installation {
	private int mounth = 0;
	
	private InstallationType installationType;
	
	public Installation(InstallationType installationType, int mounth) {
		this.installationType = installationType;
	}

	public InstallationType getInstallationType() {
		return installationType;
	}	
}

package hexagon.codechallenge.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity()  
public class Position {
	
	private long posId;
	private String posName;
	private boolean managerFlag;
		
	@Id
	@Column(name="pos_id")
	public long getPosId() {
		return posId;
	}

	public void setPosId(long posId) {
		this.posId = posId;
	}

	@Column(name="pos_name")
	public String getPosName() {
		return posName;
	}

	public void setPosName(String posName) {
		this.posName = posName;
	}
	
	@Column(name="manager_flag")
	public boolean isManagerFlag() {
		return managerFlag;
	}
	
	public void setManagerFlag(boolean managerFlag) {
		this.managerFlag = managerFlag;
	}

	
}

package hexagon.codechallenge.app.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity()  
public class Employee {
	
	private long empId;	
	private long posId;	
	private String fullName;	
	private LocalDate dateHired;
	private String posName;
	private boolean managerFlag;	
	
	@Id
	@Column(name="emp_id")
	public long getPosId() {
		return posId;
	}
	
	public void setPosId(long posId) {
		this.posId = posId;
	}
	
	@Column(name="pos_id")
	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	@Column(name="full_name")
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name="date_hired")
	public LocalDate getDateHired() {
		return dateHired;
	}

	public void setDateHired(LocalDate dateHired) {
		this.dateHired = dateHired;
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

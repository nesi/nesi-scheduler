package nz.org.nesi.nesischeduler.project.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the project_properties database table.
 * 
 */
@Entity
@Table(name="project_properties")
@NamedQuery(name="ProjectProperty.findAllByProjectId", 
query="SELECT p FROM ProjectProperty p where p.facilityId=:facilityId and p.projectId=:projectId and p.propname=:propname")
public class ProjectProperty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int facilityId;

	private int projectId;

	private String propname;

	@Lob
	private String propvalue;

	private Timestamp timestamp;

	public ProjectProperty() {
	}

	public ProjectProperty(int facilityId, int projectId, String propname, String propvalue, Timestamp timestamp) {
		super();
		this.facilityId = facilityId;
		this.projectId = projectId;
		this.propname = propname;
		this.propvalue = propvalue;
		this.timestamp = timestamp;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFacilityId() {
		return this.facilityId;
	}

	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}

	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getPropname() {
		return this.propname;
	}

	public void setPropname(String propname) {
		this.propname = propname;
	}

	public String getPropvalue() {
		return this.propvalue;
	}

	public void setPropvalue(String propvalue) {
		this.propvalue = propvalue;
	}

	public Timestamp getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
}
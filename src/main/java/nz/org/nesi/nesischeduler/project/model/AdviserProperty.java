package nz.org.nesi.nesischeduler.project.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the adviser_properties database table.
 * 
 */
@Entity
@Table(name="adviser_properties")
public class AdviserProperty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int adviserId;

	private String propname;

	private String propvalue;

	private int siteId;

	private Timestamp timestamp;

	public AdviserProperty() {
	}

	public AdviserProperty(int adviserId, String propname, String propvalue, int siteId, Timestamp timestamp) {
		super();
		this.adviserId = adviserId;
		this.propname = propname;
		this.propvalue = propvalue;
		this.siteId = siteId;
		this.timestamp = timestamp;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAdviserId() {
		return this.adviserId;
	}

	public void setAdviserId(int adviserId) {
		this.adviserId = adviserId;
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

	public int getSiteId() {
		return this.siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

	public Timestamp getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

}
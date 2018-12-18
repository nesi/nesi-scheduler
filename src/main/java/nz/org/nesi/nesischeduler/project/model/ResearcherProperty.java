package nz.org.nesi.nesischeduler.project.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the researcher_properties database table.
 * 
 */
@Entity
@Table(name="researcher_properties")
@NamedQueries({@NamedQuery(name="ResearcherProperty.findAll", query="SELECT r FROM ResearcherProperty r"),
	@NamedQuery(name="findByPropvalue", query="SELECT r FROM ResearcherProperty r WHERE r.propname='linuxUsername' AND r.propvalue = :propvalue")})
public class ResearcherProperty implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String propname;

	private String propvalue;

	private int researcherId;

	private int siteId;

	private Timestamp timestamp;

	public ResearcherProperty() {
	}

	public ResearcherProperty(String propname, String propvalue, int researcherId, int siteId, Timestamp timestamp) {
		super();
		this.propname = propname;
		this.propvalue = propvalue;
		this.researcherId = researcherId;
		this.siteId = siteId;
		this.timestamp = timestamp;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getResearcherId() {
		return this.researcherId;
	}

	public void setResearcherId(int researcherId) {
		this.researcherId = researcherId;
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
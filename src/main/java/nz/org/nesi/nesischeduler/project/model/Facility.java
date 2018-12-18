package nz.org.nesi.nesischeduler.project.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the facility database table.
 * 
 */
@Entity
@Table(name="facility")
@NamedQuery(name="facility.findAll", query="SELECT f FROM Facility f")
public class Facility implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	private int siteId;

	public Facility() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSiteId() {
		return this.siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

}
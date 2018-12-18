package nz.org.nesi.nesischeduler.project.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_institution database table.
 * 
 */
@Entity
@Table(name="user_institution")
@NamedQuery(name="UserInstitution.findAll", query="SELECT u FROM UserInstitution u")
public class UserInstitution implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;
	@Id
	private String name;

	private int range;

	public UserInstitution() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRange() {
		return this.range;
	}

	public void setRange(int range) {
		this.range = range;
	}

}
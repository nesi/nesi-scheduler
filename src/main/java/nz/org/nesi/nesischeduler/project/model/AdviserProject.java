package nz.org.nesi.nesischeduler.project.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the adviser_project database table.
 * 
 */
@Entity
@Table(name="adviser_project")
@NamedQuery(name="AdviserProject.findAll", query="SELECT a FROM AdviserProject a")
public class AdviserProject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int adviserId;

	private int adviserRoleId;

	@Lob
	private String notes;

	private int projectId;

	public AdviserProject() {
	}

	public int getAdviserId() {
		return this.adviserId;
	}

	public void setAdviserId(int adviserId) {
		this.adviserId = adviserId;
	}

	public int getAdviserRoleId() {
		return this.adviserRoleId;
	}

	public void setAdviserRoleId(int adviserRoleId) {
		this.adviserRoleId = adviserRoleId;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

}
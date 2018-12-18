package nz.org.nesi.nesischeduler.project.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the researcher_project database table.
 * 
 */
@Entity
@Table(name="researcher_project")
@NamedQuery(name="ResearcherProject.findAll", query="SELECT r FROM ResearcherProject r")
public class ResearcherProject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	private String notes;

	private int projectId;
	
	@Id
	private int researcherId;

	private int researcherRoleId;

	public ResearcherProject() {
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

	public int getResearcherId() {
		return this.researcherId;
	}

	public void setResearcherId(int researcherId) {
		this.researcherId = researcherId;
	}

	public int getResearcherRoleId() {
		return this.researcherRoleId;
	}

	public void setResearcherRoleId(int researcherRoleId) {
		this.researcherRoleId = researcherRoleId;
	}

}
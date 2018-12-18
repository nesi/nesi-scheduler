package nz.org.nesi.nesischeduler.project.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;


/**
 * The persistent class for the project database table.
 * 
 */
@Entity
@Table(name = "project")
@NamedQueries({@NamedQuery(name="Project.findById", query="SELECT p FROM Project p WHERE p.id=:id"),
	@NamedQuery(name="findAllProjectCode", query="SELECT p.projectCode FROM Project p")})
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private Timestamp creationDate;

	private String department;

	@Lob
	private String description;

	private String division;

	private String endDate;

	private String hostInstitution;

	private Timestamp lastModified;

	private String name;

	private String nextFollowUpDate;

	private String nextReviewDate;

	@Lob
	private String notes;

	private String projectCode;

	private int projectTypeId;

	@Lob
	private String requirements;

	private String startDate;

	private int statusId;

	@Lob
	private String todo;

	public Project() {
	}

	
	public Project(String department, String description, String division, String hostInstitution, String name,
			String notes, String projectCode, int projectTypeId, int statusId) {
		super();
		this.department = department;
		this.description = description;
		this.division = division;
		this.hostInstitution = hostInstitution;
		this.name = name;
		this.notes = notes;
		this.projectCode = projectCode;
		this.projectTypeId = projectTypeId;
		this.statusId = statusId;
	}


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDivision() {
		return this.division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getHostInstitution() {
		return this.hostInstitution;
	}

	public void setHostInstitution(String hostInstitution) {
		this.hostInstitution = hostInstitution;
	}

	public Timestamp getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNextFollowUpDate() {
		return this.nextFollowUpDate;
	}

	public void setNextFollowUpDate(String nextFollowUpDate) {
		this.nextFollowUpDate = nextFollowUpDate;
	}

	public String getNextReviewDate() {
		return this.nextReviewDate;
	}

	public void setNextReviewDate(String nextReviewDate) {
		this.nextReviewDate = nextReviewDate;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getProjectCode() {
		return this.projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public int getProjectTypeId() {
		return this.projectTypeId;
	}

	public void setProjectTypeId(int projectTypeId) {
		this.projectTypeId = projectTypeId;
	}

	public String getRequirements() {
		return this.requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getTodo() {
		return this.todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

}
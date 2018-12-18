package nz.org.nesi.nesischeduler.project.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the researcher database table.
 * 
 */
@Entity
@Table(name="researcher")
@NamedQueries({@NamedQuery(name="Researcher.findAll", query="SELECT r FROM Researcher r"),
	@NamedQuery(name="Researcher.getAllActiveResearchers", query="SELECT r FROM Researcher r WHERE "
			+ "r.endDate > now() or r.statusId =1")})
public class Researcher implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String department;

	private String division;

	private String email;

	private String endDate;

	private String fullName;

	private String institution;

	private int institutionalRoleId;

	private Timestamp lastModified;

	@Lob
	private String notes;

	private String phone;

	private String pictureUrl;

	private String preferredName;

	private String startDate;

	private int statusId;

	private String tuakiriToken;

	public Researcher() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDivision() {
		return this.division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getFullName() {
		return this.fullName.trim();
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getInstitution() {
		return this.institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public int getInstitutionalRoleId() {
		return this.institutionalRoleId;
	}

	public void setInstitutionalRoleId(int institutionalRoleId) {
		this.institutionalRoleId = institutionalRoleId;
	}

	public Timestamp getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPictureUrl() {
		return this.pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public String getPreferredName() {
		return this.preferredName;
	}

	public void setPreferredName(String preferredName) {
		this.preferredName = preferredName;
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

	public String getTuakiriToken() {
		return this.tuakiriToken;
	}

	public void setTuakiriToken(String tuakiriToken) {
		this.tuakiriToken = tuakiriToken;
	}

}